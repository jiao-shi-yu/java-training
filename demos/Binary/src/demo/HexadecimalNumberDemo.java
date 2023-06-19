package demo;

public class HexadecimalNumberDemo {
    public static void main(String[] args) {
        /**
         * 16进制：缩写2进制
         * - 0X 是16进制字面量前缀，0x开头则编译器按照16进制进行编译
         * - Java 7 提供了2进制字面量前缀 0b
         * - 前缀0表示8进制，不常用，但考试可能有
         *    8进制数字：0 1 2 3 4 5 6 7 没有7以上的数字
         */
        // 0100_1111_0000_0101_0111_1010_1111_1110
        //   4    f    0    5    7    a    f    e
        int num1 = 0x4f057afe;
        int num2 = 0b0100_1111_0000_0101_0111_1010_1111_1110;
        if (num1 == num2) {
            System.out.println(num1 + "=" + num2);

        }

//        int x = 068; // 没有8
        int y = 67;
    }
}
