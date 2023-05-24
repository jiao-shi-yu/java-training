package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
    java.net.Socket 套接字
    Socket 封装了TCP协议的通讯细节，使用它可以与远端计算机建立连接，
    并基于一个输入流和一个输出流的读写完成交互。
     */
    private Socket socket;

    /**
     * 构造方法，用来初始化客户端
     */
    public Client() {
        try {
            System.out.println("正在连接服务器端");
            Socket localhost = socket = new Socket("localhost", 8088);
            System.out.println("与服务器建立了连接");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {

        try {
            // 启动ServerHandler
            ServerHandler serverHandler = new ServerHandler();
            Thread thread = new Thread(serverHandler);
            thread.start();

            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);


            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if ("exit".equals(line)) {
                    break;
                }
                pw.println(line);


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    /**
     * 循环读取服务端发送的消息
     */
    private class ServerHandler implements Runnable {
        @Override
        public void run() {

            // 通过socket 获取输入流，以读取服务端发送过来的消息
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = br.readLine())!=null) {
                    System.out.println(message);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
