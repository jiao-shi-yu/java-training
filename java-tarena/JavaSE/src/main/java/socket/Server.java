package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 */
public class Server {
    /**
     * "总机"
     */
    private ServerSocket serverSocket;
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
                InputStream inputStream = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(isr);



                String message;
               /*
                客户端如果调用 socket.close() 断开连接， 服务端这里的readline() 就会返回null,

                客户端如果意外中断，那么服务端这边会抛异常。
                */

                while ((message = bufferedReader.readLine())!=null) {
                    System.out.println("客户端说：" + message);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
