package demo;

public class EncodingDemo {
    public static void main(String[] args) {
        /**
         * 编码
         */
        int number = -3;
        System.out.println(Integer.toBinaryString(number));

        // 最大值最小值
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(max)); // max + 1 -> min
        System.out.println(Integer.toBinaryString(min));

        // Long类型也是同样的
        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(Long.toBinaryString(lmax));
        System.out.println(Long.toBinaryString(lmin));

        // 看看 -1
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(Long.toBinaryString(-1));

        for (int i = -200; i < 0; i++) {
            System.out.println(Integer.toBinaryString(i));
        }

        /**
         * 强制类型转换的进一步理解
         */
        System.out.println(Long.toBinaryString(-8));
        System.out.println(Integer.toBinaryString(-8));
        //1111111111111111111111111111111111111111111111111111111111111000
        //11111111111111111111111111111000
    }
}
