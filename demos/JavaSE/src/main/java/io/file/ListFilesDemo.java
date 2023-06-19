package io.file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        // 访问当前目录中的所有子项
        File dir = new File(".");

        // 判断是否为一个目录
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            System.out.println(files.length);
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        }
    }
}
