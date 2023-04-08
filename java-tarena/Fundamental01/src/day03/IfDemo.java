package day03;

public class IfDemo {
    public static void main(String[] args) {
        // 偶数的判断
        int num = 6;
        if (num % 2 == 0) {
            System.out.println(num+"是偶数");
        }
        System.out.println("over");

        // 满500打8折纸
        double price = 500;
        if (price >= 500) {
            price *= 0.8;
        }
        System.out.println("最终结算金额为：" + price);

    }

}
