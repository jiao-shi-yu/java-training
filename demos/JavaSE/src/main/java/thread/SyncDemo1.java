package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源，用于线程切换实际不确定，导致操作顺序出现混乱。
 *
 * 临界资源：操作该资源的完整步骤，同一时刻只能有单一线程进行的资源。
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBean(); // 桌子上拿走一个豆子
                    Thread.yield();
                    System.out.println(getName() + "：" + bean);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBean(); // 桌子上拿走一个豆子
                    Thread.yield();
                    System.out.println(getName() + "：" + bean);
                }
            }
        };
        t1.start();
        t2.start();

    }
}


class Table {
    private int beans = 20; // 桌子上有20个豆子

    /**
     * 在该方法上使用synchronized修饰后，该方法称为同步方法，即：多个线程不能同时在方法内部执行。
     * 将多个线程并发"抢着"操作，改为同步"排队"操作，可以有效解决多线程并发安全问题。
     * @return
     */
    public synchronized int getBean() {
        if (beans == 0) {
            throw new RuntimeException("没有豆子了！");
        }
        Thread.yield(); // 主动放弃本次剩余时间片，模拟CPU执行到这里没有时间而发生切换
        return beans--;
    }
}