package string.regex;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        // 将数字部分替换为"#number"
        str = str.replaceAll("[0-9]+", "#number");
        System.out.println(str);

        /**
         * 和谐用语
         */

        String regex = "(wqnmlgb|dsb|mdzz|nmsl|wrsndm|cnm|nc|djb)";
        String message ="wqnmlgb!你个dsb!你怎么这么的nc,你就是一个djb";
        message = message.replaceAll(regex, "***");
        System.out.println(message);
    }
}
