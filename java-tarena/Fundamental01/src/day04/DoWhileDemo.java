package day04;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        int theRightNumber = (int) (Math.random() * 1000) + 1; // 1到1000中的一个整数
        // 作弊
//        System.out.println(theRightNumber);
        int timesTried = 0;
        System.out.println("在1-1000范围内，系统选择了一个整数，现在请你猜测这个整数：");
        Scanner scanner = new Scanner(System.in);
        int userGuessingNumber;
        do {
           userGuessingNumber = scanner.nextInt();
           timesTried++;
           if (userGuessingNumber == theRightNumber) {
               System.out.println("恭喜你猜对了！ 数字确实是" + theRightNumber + "，一共猜了" + timesTried + "次。");
           } else if (userGuessingNumber < theRightNumber) {
               System.out.println("你猜的数字太小了");
           } else {
               System.out.println("你猜的数字太大了");
           }
        } while (userGuessingNumber != theRightNumber);



    }
}
