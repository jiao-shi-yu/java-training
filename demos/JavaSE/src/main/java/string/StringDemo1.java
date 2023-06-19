package string;

public class StringDemo1 {
    public static void main(String[] args) {
        /**
         * 字符串对象不可改变
         * 字符串变量的引用可以改变
         */
        String s1 = "ABC";
        String s2 = s1;
        s1 = s1 + "DEF";
        System.out.println(s2); //ABC
        System.out.println(s1); //
    }
}
