package com.webserver.http;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class HttpContext {

    public static Map<String, String> mimeMapping = new HashMap<>();

    static {
        initMimeMapping();
    }

    private static void initMimeMapping() {
        Properties properties = new Properties();
        try {
            properties.load(
                    HttpContext.class.getResourceAsStream("web.properties")
            );

            properties.forEach(
                    (k, v) -> mimeMapping.put(k.toString(), v.toString())
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static String getMimeType(String ext) {
        return mimeMapping.get(ext);
    }

    public static void main(String[] args) {
        String type = getMimeType("png");
        System.out.println(type);
    }
}
