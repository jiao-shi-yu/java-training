package string;

public class ToUppercaseDemo {
    public static void main(String[] args) {
        String str = "Thinking in Java是一部好书";
        str = str.toUpperCase();
        System.out.println(str);


        /**
         * 利用大小写转换 进行不区分大小写的查找
         */
        int i = str.toLowerCase().indexOf("java");
        System.out.println(i);
    }
}
