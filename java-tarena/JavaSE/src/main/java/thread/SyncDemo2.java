package thread;

/**
 * 同步块
 * 有效地缩小同步范围，可以再保证并发安全的前提下，提高并发效率。
 *
 * 语法：
 * synchronized(同步监视器对象) {
 *     需要多线程同步执行的代码片段
 * }
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread thread1 = new Thread("范传奇") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        Thread thread2 = new Thread("小红") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        thread1.start();
        thread2.start();

    }
}

class Shop {
    public void buy() {
        Thread thread = Thread.currentThread();
        try {
            System.out.println(thread.getName()+":正在挑衣服...");
            Thread.sleep(5000);
            /*
            同步块可以更灵活、更准确地锁定需要排队的代码片段。
            使用同步块需要指定：同步监视器对象，他可以是java中任何引用类型的实例。
            只要保证需要同步执行该代码块的多个线程，看到的这个对象，是同一个即可。
             */
            synchronized (this) {
                System.out.println(thread.getName()+":正在试衣服...");
                Thread.sleep(5000);
            }
            System.out.println(thread.getName()+":结账离开");

        } catch (Exception e) {

        }
    }
}