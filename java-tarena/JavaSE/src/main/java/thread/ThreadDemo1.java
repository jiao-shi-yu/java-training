package thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();

        /*
        注意：启动线程，调用的是start()方法，而非直接调用run()
        线程调用start()方法后，该线程将会纳入线程调度器的统一管理中，当该线程获取到时间片段时，线程调度器会自动调用run()方法。
         */
        thread1.start();
        thread2.start();

    }
}

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊？");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是查水表的！");
        }
    }
}