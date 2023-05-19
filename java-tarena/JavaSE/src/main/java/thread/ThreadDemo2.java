package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 创建Runnable实例
        Runnable runnable1 = new MyRunnable1();
        Runnable runnable2 = new MyRunnable2();
        // 使用Runnable实例子创建线程
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        // 启动线程
        thread1.start();
        thread2.start();
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊？");
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是查水表的！");
        }
    }
}