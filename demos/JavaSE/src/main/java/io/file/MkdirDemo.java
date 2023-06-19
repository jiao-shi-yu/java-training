package io.file;

import java.io.File;

/**
 * 创建一个目录
 */
public class MkdirDemo {
    public static void main(String[] args) {
        // 在当前目录下新建一个目录：demo
        File dir = new File("./demo");
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("该目录创建成功！");
        } else {
            System.out.println("该目录已存在！");
        }
    }
}
