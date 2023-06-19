package io.file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        /**
         * 在当前项目下，手动创建一个 demo.txt 文件
         */
        File file = new File("./demo.txt");
        // 获取文件的名字
        String name = file.getName();
        System.out.println(name);
        // 获取文件大小，单位是字节。
        long len = file.length();
        System.out.println(len);
        // 获取文件的可读性
        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        boolean ce = file.canExecute();
        System.out.println(cr);
        System.out.println(cw);
        System.out.println(ce);

        boolean ih = file.isHidden();
        System.out.println(ih);

    }
}
