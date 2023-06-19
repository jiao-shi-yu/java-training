package io.stream.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOSFlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bosflush.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String str = "让我再看你一眼，从南到北";
        byte[] bytes = str.getBytes("UTF-8");
        bos.write(bytes);
        // flush()方法，将缓冲区的数据强制写出。
		bos.flush();
        System.out.println("写出完毕");
        bos.close();
    }
}
