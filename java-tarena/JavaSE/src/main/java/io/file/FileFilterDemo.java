package io.file;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {
    public static void main(String[] args) {
        // 获取当前目录下，所有名字以"."开头的子项
        File dir = new File(".");
        if (dir.isDirectory()) {
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    System.out.println("正在过滤："+pathname);
                    return pathname.getName().startsWith(".");
                }
            };

            File[] subs = dir.listFiles(filter);
            System.out.println("满足过滤器要求的子项共："+subs.length+"个");
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}
