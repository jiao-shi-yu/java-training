package com.webserver.core;

import com.webserver.http.HttpServletRequest;
import com.webserver.http.HttpServletResponse;

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
            HttpServletResponse httpServletResponse = new HttpServletResponse(socket);


            //2 处理请求
            String path = httpServletRequest.getUri();
            System.out.println("path:" + path);

            //3 使用HttpServletResponse 发送响应

            File file = new File("./webapps" + path);

            // 如果定位是文件，则 200 OK
            if (file.isFile()) {


            } else { // 不是文件,要么不存在，要么是目录，则 404

                file = new File("./webapps/root/404.html");
                httpServletResponse.setStatusCode(404);
                httpServletResponse.setStatusReason("Not Found");
            }

            httpServletResponse.setEntity(file);
            httpServletResponse.response();

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
