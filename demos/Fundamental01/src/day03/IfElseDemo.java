package day03;

public class IfElseDemo {
    public static void main(String[] args) {
        // 偶数的判断
        int num = 9;
        if (num % 2 == 0) {
            System.out.println(num+"是偶数");
        } else {
            System.out.println(num+"是奇数");
        }
        System.out.println("over");

        // 满500打8折纸，否则打九折
        double price = 300;
        if (price >= 500) {
            price *= 0.8;
        } else {
            price *= 0.9;
        }
        System.out.println("最终结算金额为：" + price);
    }

}
