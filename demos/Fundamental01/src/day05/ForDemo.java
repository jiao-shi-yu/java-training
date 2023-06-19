package day05;

public class ForDemo {
    public static void main(String[] args) {
        /*
        向控制台输出5次，行动是成功的阶梯
         */
        for (int times = 0; times < 5; times++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("over");

        for(int i = 1; i > 0 ;i ++) {
            System.out.println("陷入了死循环");
        }

    }
}
