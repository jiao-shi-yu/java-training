package string;

public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "Thinking in Java是一部好书";
        int i = str.indexOf('i');
        int n = str.indexOf('X');
        System.out.printf("i=%d, n=%d%n", i, n);

        // 从3位置查找字符'i'

        i = str.indexOf('i', 3);
        System.out.printf("i now equals %d%n", i);
        // 查找字符串同理
        i = str.indexOf("in", 6);
        System.out.printf("i now equals %d%n", i);

        i = str.lastIndexOf("in");
        System.out.printf("i now equals %d%n", i);


    }
}
