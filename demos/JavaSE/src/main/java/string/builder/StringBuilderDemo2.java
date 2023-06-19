package string.builder;

/**
 * 对StringBuilder修改字符串的性能进行测试
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        String str = "a";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10_000_000;i++) {
            builder.append("a");
        }
        System.out.println("执行完毕！");
    }
}
