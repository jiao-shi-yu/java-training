package demo;

public class BitOperationDemo {
    public static void main(String[] args) {
        /**
         * 取反
         */

        /**
         * 逻辑与
         */

        /**
         * 逻辑或
         */
        /**
         * n 		= 		00000000 00000000 00000000 10111001
         * m 		= 		00000000 00000000 10111101 00000000
         * k = n|m =        00000000 00000000 10111101 10111001
         */
        int n = 0xb9;
        int m = 0xbd00;
        int k = n | m;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));


    }
}
