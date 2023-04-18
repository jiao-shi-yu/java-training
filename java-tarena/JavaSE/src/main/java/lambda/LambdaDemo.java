package lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    public static void main(String[] args) {
        // lambda表达式写法（省去了接口名和方法名）
        FileFilter filter = (File f) -> {
            return f.getName().startsWith(".");
        };
        // 方法的参数列表中的参数类型可以不写。如果只有一个参数，"()"可以不写。
        FileFilter filter1 = f -> {
            return f.getName().startsWith(".");
        };
        // 如果方法体，只有一句代码。那么"{}"可以不写，如果这句话有 return 关键字，则return也要一同忽略
        FileFilter filter2 = f -> f.getName().startsWith(".");

        File file = new File("."); // 当前目录
        //获取当前目录下名字以"."开始的子项
        File[] subs = file.listFiles(f->f.getName().startsWith("."));

    }
}
