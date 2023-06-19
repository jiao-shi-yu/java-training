package io.stream.fileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream  fis = new FileInputStream("fos.txt");
        int len = fis.available();
        byte[] bytes = new byte[len];
        fis.read(bytes);
        String line = new String(bytes, "UTF-8");
        System.out.println(line);
        fis.close();
    }
}
