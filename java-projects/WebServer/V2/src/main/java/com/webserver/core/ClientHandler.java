package com.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 线程任务
 * 负责与特定客户端进行HTTP交互
 */
public class ClientHandler implements Runnable{

    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //1 解析请求
            InputStream in = socket.getInputStream();
            int d;
            while ((d = in.read())!=-1) {
                System.out.print((char)d);
            }
            //2 处理请求
            //3 发送响应
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
