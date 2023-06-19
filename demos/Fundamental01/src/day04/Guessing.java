package day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        int theRightNumber = (int) (Math.random() * 1000) + 1; // 1到1000中的一个整数

//        int theRightNumber = 250;
        int timesTried = 0;
        System.out.println("在1-1000范围内，系统选择了一个整数，现在请你猜测这个整数：");
        Scanner scanner = new Scanner(System.in);
        int userGuessingNumber = scanner.nextInt();
        timesTried ++;
        while (userGuessingNumber != theRightNumber) {
            if (userGuessingNumber < theRightNumber) {
                System.out.println("你猜的数字太小了");
            } else {
                System.out.println("你猜的数字太大了");
            }
            System.out.println("请继续猜：");
            userGuessingNumber = scanner.nextInt();
            timesTried ++;
        }
        System.out.println("恭喜你猜对了！ 数字确实是" + theRightNumber + "，一共猜了" + timesTried + "次。");


    }
}
