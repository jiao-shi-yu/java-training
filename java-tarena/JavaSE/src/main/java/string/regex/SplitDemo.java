package string.regex;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        // 按照数字部分进行拆分，得到所有的字母部分
        String[] data = str.split("[0-9]+");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data)); //[abc, def, ghi]

        /**
         * 连续匹配到正则表达式，对于开头和中间，会拆出空字符串；对于末尾，会忽略掉。
         */
        str = ".a...b.c.d.e.f...";
        data = str.split("\\.");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data)); //[, a, , , b, c, d, e, f]

    }
}
