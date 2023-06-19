package thread;

/**
 * 线程的优先级
 * 线程有10个优先级，分别对应整数1-10， 其中1为最低，10为最高，5为默认。
 * 线程start()方法调用后，便纳入线程调度器中并发运行，线程只能被分配时间片进行并发，
 * 而调度器会尽可能均匀分配时间片。
 * 通过调整线程的优先级，可以最大程度地改善获取时间片的效率。优先级越高的线程，获取时间片的次数最多。
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("min");
                }
            }
        };
        Thread nor = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("nor");
                }
            }
        };
        Thread max = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("max");
                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        nor.start();
        max.start();
    }
}
