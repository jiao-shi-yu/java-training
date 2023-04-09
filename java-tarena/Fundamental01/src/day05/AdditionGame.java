package day05;

import java.util.Scanner;

public class AdditionGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (int i = 1; i <= 10; i++) {
            // 系统出题
            int num1 = getRandomInt();
            int num2 = getRandomInt();
            int answer = num1 + num2;

            String questionText = "Question" + i + ": " + num1 + " + " + num2 + " = ?"/*+ answer*/;
            System.out.println(questionText);
            // 用户答题
            int userAnswer = scanner.nextInt();
            // 判题计分
            if (userAnswer == answer) {
                score += 10;
                System.out.println("你答对了");
            } else {
                System.out.println("不对哦");
            }

        }
        System.out.println("总计得分：" + score);
    }

    private  static int getRandomInt() {
        return (int) (Math.random() * 100) + 1;
    }
}
