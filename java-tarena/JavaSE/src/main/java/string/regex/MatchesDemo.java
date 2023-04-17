package string.regex;

/**
 * `boolean matches(正则表达式)`  --- 匹配
 *
 * 将一个字符串与正则表达式进行匹配，如果匹配成功就返回 true ，否则返回 false
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email = "fan_cq@tedu.cn";

        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+";
        boolean matches = email.matches(regex);
        if (matches) {
            System.out.println("是邮箱");
        } else {
            System.out.println("不是邮箱");
        }
    }
}
