package string;

/**
 * 获取当前字符串的长度（字符个数）
 */
public class LengthDemo {
    public static void main(String[] args) {
        String string = "Thinking in Java是一部好书";
        System.out.println(string.length());
        char ch = string.charAt(2);
        System.out.println(ch);

        /**
         * length()和charAt()配合使用，可以实现遍历字符串中的字符。
         * 例子：统计string中'i'出现的次数
         */
        int times = 0;
        for (int i = 0; i < string.length();i++) {
            char c = string.charAt(i);
            if (c == 'i') {
                times ++;
            }
        }
        System.out.println(times);

    }
}
