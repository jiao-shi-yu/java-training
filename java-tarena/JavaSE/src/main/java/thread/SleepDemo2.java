package thread;

/**
 * sleep方法要求必须处理InterruptedException
 * 当一个线程调用sleep方法处于睡眠阻塞的状态下，该线程调用interrupt()方法会中断其睡眠堵塞，这个时候就会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread() {
            @Override
            public void run() {
                System.out.println("林：刚美完容~睡一会吧~~");
                try {
                    Thread.sleep(5000000);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢！干嘛呢！干嘛呢！都破了相了！");
                }
                System.out.println("林：醒了");
            }
        };

        Thread huang = new Thread() {
            @Override
            public void run() {
                System.out.println("黄：大锤80，小锤40，开始砸墙！");
                for(int i = 0; i < 5; i++) {
                    System.out.println("黄：80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("咣当！");
                System.out.println("黄：大哥！搞定！");
                lin.interrupt();
            }

        };

        lin.start();
        huang.start();
    }
}
