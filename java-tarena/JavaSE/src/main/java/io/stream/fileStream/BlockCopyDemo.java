package io.stream.fileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockCopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("music.mp3");
        FileOutputStream fos = new FileOutputStream("music_copy.mp3");


        byte[]data = new byte[1024*10];
        int len;
        long start = System.currentTimeMillis();
        while((len = fis.read(data)) != -1) {
            fos.write(data, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时："+ (end - start) +"ms");
        fis.close();
        fos.close();
    }
}
