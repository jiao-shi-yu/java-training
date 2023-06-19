package demo;

public class InversePlusOneDemo {
    public static void main(String[] args) {
        /**
         * 互补对称
         */

        int n = -9;
        int m = ~n + 1; // -9 -> 8 , (+1) -> 9

        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n));
        System.out.println(Integer.toBinaryString(~n+1));

        /* 解析
         * 11111111111111111111111111110111
         * 00000000000000000000000000001000    取反
         * 00000000000000000000000000001001    加一
         */
    }


}
