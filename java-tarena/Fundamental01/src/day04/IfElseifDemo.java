package day04;

import java.util.Scanner;

public class IfElseifDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = scanner.nextDouble();
        System.out.println("成绩为："+score);

        if (score > 100 || score < 0) {
            System.out.println("成绩不合法");
        } else if (score>=90) {
            System.out.println("A——优秀");
        } else if (score>=80) {
            System.out.println("B——良好");
        } else if (score>=60){
            System.out.println("C——中等");
        } else {
            System.out.println("D——不及格");
        }
    }
}
