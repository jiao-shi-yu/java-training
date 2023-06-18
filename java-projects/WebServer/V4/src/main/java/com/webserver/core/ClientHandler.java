package com.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

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
            String line = readLine();
            System.out.println("请求行：" + line);
            // 请求行相关信息
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
            // 读取消息头
            Map<String, String> headers = new HashMap<>();
            while(true) {
                line = readLine();
                if (line.isEmpty()) {
                    break; // 退出循环
                }
                // 一个消息头是这样的格式： Connection: keep-alive
                System.out.println("消息头：" + line);
                // 重用data
                data = line.split(":\\s");
                headers.put(data[0], data[1]);
            }
            // 输出一下headers 看是否正确解析了
            System.out.println("headers: " + headers);
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


    private String readLine() throws IOException {
        InputStream in = socket.getInputStream();
        StringBuilder builder = new StringBuilder();

        char cur = 'a'; //保存上次读到的字符
        char pre = 'a'; //保存本次读到的字符
        // 一个个地开始读取字符
        int d;
        while ((d = in.read())!=-1) {
            cur = (char) d;
            if (pre==13 && cur==10) {
                break;
            }
            builder.append(cur);
            pre = cur;

        }

        return builder.toString().trim();
    }
}
