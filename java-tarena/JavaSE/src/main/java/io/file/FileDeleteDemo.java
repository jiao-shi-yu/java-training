package io.file;

import java.io.File;

public class FileDeleteDemo {
    public static void main(String[] args) {
        // 将当前目录下的test.txt删除
        File file = new File("./test.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("文件已删除！");
        } else {
            System.out.println("文件不存在！");
        }
    }
}
