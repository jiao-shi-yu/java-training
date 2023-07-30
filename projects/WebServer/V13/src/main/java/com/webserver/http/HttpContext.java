package com.webserver.http;

import java.util.HashMap;
import java.util.Map;

public class HttpContext {

    public static Map<String, String> mimeMapping = new HashMap<>();

    static {
        initMimeMapping();
    }

    private static void initMimeMapping() {
        mimeMapping.put("html", "text/html");
        mimeMapping.put("css", "text/css");
        mimeMapping.put("js", "application/javascript");
        mimeMapping.put("png", "image/png");
        mimeMapping.put("jpg", "image/jpeg");
        mimeMapping.put("gif", "image/gif");

    }

    public static String getMimeType(String ext) {
        return mimeMapping.get(ext);
    }

 /*   public static void main(String[] args) {
        String type = getMimeType("png");
        System.out.println(type);
    }*/
}
