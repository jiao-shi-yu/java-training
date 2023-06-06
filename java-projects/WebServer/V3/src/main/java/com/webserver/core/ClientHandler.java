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
            StringBuilder builder = new StringBuilder();
            char cur = 'a'; //保存上次读到的字符
            char pre = 'a'; //保存本次读到的字符



            int d;
            while ((d = in.read())!=-1) {
                cur = (char) d;
                if (pre==13 && cur==10) {
                    break;
                }
                builder.append(cur);
                pre = cur;

            }
            String line = builder.toString().trim();
            System.out.println("请求行：" + line);
            String method;      //请求方式
            String uri;         //抽象路径
            String protocol;    //请求协议
            String[] data = line.split("\\s");
            method = data[0];
            uri = data[1];
            protocol = data[2];
            System.out.println("method:" + method);
            System.out.println("uri:" + uri);
            System.out.println("protocol:" + protocol);
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
