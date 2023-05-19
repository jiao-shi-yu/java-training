package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 1) 继承Thread类，重写run()方法
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    System.out.println("I'M THREAD, WHO ARE YOU?");
                }
            }
        };

        // 2) 实现Runnable接口，单独定义任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("HI I'M RUNNABLE.");
                }
            }
        };
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
