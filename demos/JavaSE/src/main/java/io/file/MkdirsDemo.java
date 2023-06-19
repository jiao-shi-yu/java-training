package io.file;

import java.io.File;

public class MkdirsDemo {
    public static void main(String[] args) {
        // 在当前目录下新建目录:./a/b/c/d/e/f
        File dir = new File("./a/b/c/d/e/f");
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println("目录创建成功！");
        } else {
            System.out.println("该目录已经存在！");
        }
    }
}
