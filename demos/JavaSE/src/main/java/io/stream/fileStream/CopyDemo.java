package io.stream.fileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("scream.jpeg");
        FileOutputStream fileOutputStream = new FileOutputStream("scream_copy.jpeg");

        int byt;
        long start = System.currentTimeMillis();
        while ((byt = fileInputStream.read()) != -1) {
            fileOutputStream.write(byt);
        }
        long end = System.currentTimeMillis();
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("复制完毕！耗时：" + (end-start) + "ms");





    }
}
