package com.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理HTTP请求的Servlet
 */
public class HttpServletRequest {
    private Socket socket;

    // 请求行相关信息
    private String method; // 请求方式
    private String uri;     // 抽象路径
    private String protocol; // 协议版本


    // 消息头相关信息
    private Map<String, String> headers = new HashMap<>();

    public HttpServletRequest(Socket socket) throws IOException {
        this.socket = socket;
        // 解析请求行
        parseRequestLine();
        // 解析消息头
        parseHeaders();
        // 解析消息正文
        parseContent();
    }

    private void parseContent()  {

    }

    private void parseHeaders() throws IOException {
        String line = readLine();
        Map<String, String> headers = new HashMap<>();
        while(true) {
            line = readLine();
            if (line.isEmpty()) {
                break; // 退出循环
            }
            // 一个消息头是这样的格式： Connection: keep-alive
            System.out.println("消息头：" + line);
            // 重用data
            String[] data = line.split(":\\s");
            headers.put(data[0], data[1]);
        }
        // 输出一下headers 看是否正确解析了
        System.out.println("headers: " + headers);
    }

    private void parseRequestLine() throws IOException {
        String line = readLine();
        System.out.println("请求行：" + line);
        // 请求行相关信息

        String[] data = line.split("\\s");
        method = data[0];
        uri = data[1];
        protocol = data[2];
        System.out.println("method:" + method);
        System.out.println("uri:" + uri);
        System.out.println("protocol:" + protocol);
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



    // getters and setters
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        System.out.println("getUri()return:" + uri);
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
