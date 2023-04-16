package demo;

public class ToBinaryStringDemo {
    public static void main(String[] args) {
        /**
         * Java 中二进制
         * 1. Java 在编译期间将十进制字面量编译为二进制数
         *  .java中的50 -> .class中 110010
         * 2. 在运算的时候 n 内部存储的是2进制数
         * 3. 在输出的时候，Java利用算法（方法）
         */
        int n = 50; // 110010
        n++;        // 110011
        System.out.println(n); // 110011 -> "51"
        System.out.println(Integer.toBinaryString(n)); // 110011 -> "110011"



        // toBinaryString() 返回二进制数的字符串形式
        System.out.println(Integer.toBinaryString(n));
        for (int i = 0; i < 200; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
