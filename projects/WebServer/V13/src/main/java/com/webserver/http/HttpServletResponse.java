package com.webserver.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HttpServletResponse {
    private Socket socket;

    // 状态行相关信息
    private int statusCode = 200;
    private String statusReason = "OK";
    // 响应头相关信息
    private Map<String,String> headers = new HashMap<>();

    // 响应正文相关信息
        // 响应正文对应实体文件
    private File entity;

    public HttpServletResponse(Socket socket) {
        this.socket = socket;
    }

    public void response() throws IOException {
        // 发送状态行
        sendStatusLine();
        // 发送响应头
        sendHeaders();
        // 发送响应正文
        sendContent();

    }

    /**
     * 发送响应正文
     * @throws IOException
     */
    private void sendContent() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(entity);
        OutputStream outputStream = socket.getOutputStream();
        int len;
        byte[] buf = new byte[1024*10];
        // 块读块写
        while ((len = fileInputStream.read(buf)/*输入流 块读*/)!=-1) {
            outputStream.write(buf, 0, len);                  // 输出流 块写
        }
        System.out.println("响应发送完毕");
    }

    private void sendHeaders() throws IOException {

        /*
        遍历headers,发送每行响应头
         */
        Set<Map.Entry<String,String>> entrySet = headers.entrySet();
        for(Map.Entry<String,String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            String line = key + ": " + value;
            println(line);
        }


        // 发送单独的CRLF,表示响应头发送完毕
        println("");
    }

    private void sendStatusLine() throws IOException {
        // 3.1 发送状态行
        String line = "HTTP/1.1 " + statusCode + " " + statusReason;
        println(line);

    }


    private void println(String line) throws IOException {


       // line 是参数，可以传过来不同的line 不要写成死的
        byte[] data = line.getBytes(StandardCharsets.ISO_8859_1);

        OutputStream out = socket.getOutputStream();
        out.write(data);
        out.write(13);
        out.write(10);

    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public File getEntity() {
        return entity;
    }

    public void setEntity(File entity) {
        this.entity = entity;
    }

    /**
     * 添加一个要发送的响应头
     * @param name
     * @param value
     */
    public void addHeader(String name, String value) {
        this.headers.put(name, value);
    }
}
