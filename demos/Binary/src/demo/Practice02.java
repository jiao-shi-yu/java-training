package demo;

public class Practice02 {
    public static void main(String[] args) {
        /**
         * 练习2：将4个byte合并为一个int.
         * 		     	b1		b2 	     b3	    	b4
         * n  =     01100001 01001111 01111011 10111011
         *            6  1    4   f    7   b    b   b
         */

        int b1 = 0x61;
        int b2 = 0x4f;
        int b3 = 0x7b;
        int b4 = 0xbb;
        // 逻辑或 不就是 逻辑加法吗
        int number = (b1 << 24) | (b2 << 16) | (b3 << 8) | b4;
        System.out.println(Integer.toHexString(number));



    }
}
