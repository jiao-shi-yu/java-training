package io.stream.fileStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        // 使用 FileOutputStream 向文件中写字符串
        FileOutputStream fos = new FileOutputStream("fos.txt");

        String string = "吃个桃桃~嗯~~好凉凉~";

        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);

        fos.write(bytes);
        System.out.println("写完了");
        fos.close();
    }
}
