package thread;

import java.util.Scanner;

/**
 * 线程提供了一个静态方法：
 * static void sleep(long ms)
 * 可以使执行该方法的线程堵塞指定毫秒
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        /*
        倒计时程序：
        程序启动后，输入一个数字，从该数字开始，每秒递减，到0时输出时间到
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字，从此数字开始倒计时：");
        int num = scanner.nextInt();
        try {
            while (num > 0) {
                System.out.println(num--);
                Thread.sleep(1000);
            }
            System.out.println("时间到！");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("程序结束了...");
    }
}
