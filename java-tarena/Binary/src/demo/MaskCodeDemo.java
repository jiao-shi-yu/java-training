package demo;

public class MaskCodeDemo {
    public static void main(String[] args) {
        /**
         * 掩码运算
         */
        int n = 0x614f7bbb;
        int m = 0xff;
        int k = n & m;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
    }
}
