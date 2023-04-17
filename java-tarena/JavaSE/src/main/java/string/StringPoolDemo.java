package string;

public class StringPoolDemo {
    public static void main(String[] args) {
        /**
         * 字符串常量池
         * Java 使用字符串常量池，复用字符串。
         */
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = "DEF";
        String s4 = "DEF";
        String s5 = "A" + "BC";
        System.out.println(s1 == s2);//true
        System.out.println(s3 == s4);//true
        System.out.println(s5 == s1);//true

        // 动态字符串不复用
        char[] chars = {'A', 'B', 'C'};
        String s6 = new String(chars);
        String s7 = new String("ABC");
        String s8 = "B";
        String s9 = "BC";
        String s10 = s8 + s9;
        System.out.println(s1 == s6);   //false
        System.out.println(s1 == s7);   //false
        System.out.println(s1 == s10);  //false




    }
}
