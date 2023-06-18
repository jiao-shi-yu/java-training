package com.webserver.core;

import com.webserver.http.HttpServletRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

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
            // 读取消息头
            HttpServletRequest httpServletRequest = new HttpServletRequest(socket);
            //2 处理请求
            // 从request那里得到路径
            String path = httpServletRequest.getUri();
            System.out.println("path:" + path);

            //3 发送响应
            // 先简单地响应一个页面 ./webapps/myweb/index.html
            File file = new File("./webapps" + path);

             /*
            HTTP/1.1 200 OK(CRLF)
            Content-Type: text/html(CRLF)
            Ciontent-Length: ????(CRLF)(CRLF)
            1011101010101010101011101....
             */
            OutputStream out = socket.getOutputStream();

            // 3.1 发送状态行
            String line = "HTTP/1.1 200 OK";
            byte[] data = line.getBytes(StandardCharsets.ISO_8859_1);
            out.write(data);
            out.write(13);
            out.write(10);

            // 3.2 发送响应头
            line = "Content-Type: text/html";
            data = line.getBytes(StandardCharsets.ISO_8859_1);
            out.write(data);
            out.write(13);
            out.write(10);

            line = "Content-Length: " + file.length();
            data = line.getBytes(StandardCharsets.ISO_8859_1);
            out.write(data);
            out.write(13);
            out.write(10);

            out.write(13);
            out.write(10);

            // 发送响应正文
            FileInputStream fileInputStream = new FileInputStream(file);
            int len;
            byte[] buf = new byte[1024*10];
                // 块读块写
            while ((len = fileInputStream.read(buf)/*输入流 块读*/)!=-1) {
                out.write(buf, 0, len);                  // 输出流 块写
            }
            System.out.println("响应发送完毕");

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
