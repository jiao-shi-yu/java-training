package day05;

public class NestedForLoops {
    public static void main(String[] args) {
        /*
        示例2：九九乘法表
         */
        for (int i = 1; i<=9; i++) { // 控制行
            // j 最大可以跟 i 相等
            for (int j = 1; j <= i; j++) { // 代表列
                // 1 * 9 = 9; 2 * 9 = 18
                System.out.print(j + " * " + i + " = " + j*i + "\t");
            }
            // 一行完成，换行
            System.out.println();
        }
    }
}
