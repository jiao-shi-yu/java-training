package demo;

public class Practice01 {
    public static void main(String[] args) {
        /**
         * 练习1：将一个int整数拆分为4个byte.
         * 		     	b1		b2 	     b3	    	b4
         * n  =     01100001 01001111 01111011 10111011
         */
        int n = 0x614f7bbb;
        int mask = 0xff;

        byte b1 = (byte)((n>>>24) & mask);
        byte b2 = (byte)((n>>>16) & mask);
        byte b3 = (byte)((n>>>8) & mask);
        byte b4 = (byte)(n & mask);


        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(b1));
        System.out.println(Integer.toBinaryString(b2));
        System.out.println(Integer.toBinaryString(b3));
        System.out.println(Integer.toBinaryString(b4));



    }
}
