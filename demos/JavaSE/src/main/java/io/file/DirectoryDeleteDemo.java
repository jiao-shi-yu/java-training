package io.file;

import java.io.File;

public class DirectoryDeleteDemo {
    public static void main(String[] args) {
        File dir = new File("a");
        if (dir.exists()) {
            // 删除一个目录时，要求该目录必须是一个空目录，否则删除失败。
            dir.delete();
            System.out.println("目录删除成功！");
        } else {
            System.out.println("该目录不存在！");
        }
    }
}
