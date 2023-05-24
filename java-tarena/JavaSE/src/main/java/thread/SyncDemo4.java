package thread;

/**
 * 互斥锁
 * 使用多个 synchronized 锁定多个代码片段，并且指定相同的锁对象，就实现了互斥锁。
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Boo boo = new Boo();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                boo.methodA();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                boo.methodB();
            }
        };
        thread1.start();
        thread2.start();

    }
}

class Boo {

    public synchronized void methodA() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行A方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println(t.getName()+":A方法执行完毕");
    }
    public synchronized void methodB() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行B方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println(t.getName()+":B方法执行完毕");
    }
}