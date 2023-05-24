package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * 聊天室服务端
 */
public class Server {
    /**
     * "总机"
     */
    private ServerSocket serverSocket;

    /**
     * 该数组存放所有ClientHandler对应客户端的输出流，以便广播消息给所有客户端。
     */
    private PrintWriter[] allOut = {};
    public Server() {
        try {
            System.out.println("正在启动服务端……");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void start() {
        try {

            while (true) {

                System.out.println("等待客户端连接……");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了！");

                // 启动一个线程，来与该客户端交互。
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程用于与指定的客户端交互
     */
    private class ClientHandler implements Runnable {

        private Socket socket;
        private String host; // 客户端的地址信息
        public ClientHandler(Socket socket) {
            this.socket = socket;
            // 通过socket获取远端计算机地址信息
            host = socket.getInetAddress().getHostAddress();
        }
        @Override
        public void run() {
            PrintWriter printWriter = null;
            try {
                InputStream inputStream = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(isr);

                // 通过socket 获取输出流，用于给客户端回复消息
                printWriter = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream(), "UTF-8"
                                )
                        ) , true
                );
                // 将该输出流存入共享数组,这步操作需要同步执行
                synchronized (Server.this) {
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    allOut[allOut.length - 1] = printWriter;
                }

                sendMessage(host + "上线了，当前在线人数：" + allOut.length);
                String message;
               /*
                客户端如果调用 socket.close() 断开连接， 服务端这里的readline() 就会返回null,

                客户端如果意外中断，那么服务端这边会抛异常。
                */

                while ((message = bufferedReader.readLine())!=null) {
                    System.out.println(host + "说：" + message);
                    // 将消息回复给所有客户端
                    sendMessage(host + "说:" + message);
                }
            } catch (IOException e) {
//                e.printStackTrace();
            } finally {
                // 处理客户端断开连接后的操作

                // 将当前客户端的输出流，从共享数组中删除
                synchronized (Server.this) {
                    for (int i = 0; i < allOut.length; i++) {
                        if (allOut[i] == printWriter) {
                            // 将最后一个元素赋值到当前位置
                            allOut[i] = allOut[allOut.length-1];
                            // 数组缩容
                            allOut = Arrays.copyOf(allOut, allOut.length -1);
                            // 目的达成，break
                        }
                    }
                }
                sendMessage(host + "下线了，当前在线人数：" + allOut.length);
                try {
                    // 与客户端断开连接，释放资源
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /**
         * 将指定的消息发送给所有客户端
         * @param message
         */
        private void sendMessage(String message) {
            synchronized (Server.this) {
                for (int i = 0; i < allOut.length; i++ ) {
                    allOut[i].println(message);
                }
            }
        }
    }
}
