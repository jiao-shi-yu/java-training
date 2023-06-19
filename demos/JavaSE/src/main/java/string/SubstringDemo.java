package string;

import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        /**
         * 任意输入一个邮箱地址，从邮箱地址中截取用户名
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个邮箱：");
        String mail = scanner.nextLine();
        // 获取'@'的位置
        int index = mail.indexOf("@");
        // 截取用户名
        String name = mail.substring(0, index);
        System.out.println(name);
    }
}
