package day02;

public class DataTypeDemo01 {
    public static void main(String[] args) {
        // 1) int: 整型，4个字节，-21亿到21亿左右
        int a = 250;
//        int b = 100000000000; // 字面量默认是int类型，但100000000000超出了int所能表示的范围。
        System.out.println(5/2); // int 数据无法表示小数，所以 5/2 = 2
        System.out.println(2/5); // 同样 2/5 = 0
        System.out.println(5.0/2); //5.0是double类型的字面量

        int c = 2147483647; // int的最大值
        c = c + 1; //发生溢出
        System.out.println(c); // -2147483648



    }
}
