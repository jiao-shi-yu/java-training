package string;

public class StartsEndsWithDemo {
    public static void main(String[] args) {
        /**
         * 检查字符串的开头和结尾
         */
        String url = "https://doc.canglaoshi.org/index.html";

        boolean b1 = url.startsWith("https");
        boolean b2 = url.endsWith(".html");

        if (b1 && b2) {
            System.out.println("OK，网址没问题");
        }

    }
}
