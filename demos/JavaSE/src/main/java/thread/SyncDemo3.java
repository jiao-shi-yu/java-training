package thread;

/**
 * 若静态方法上使用synchronized修饰，则该方法一定具有同步效果。
 * 静态方法上的同步监视器对象不是this,而是当前类的类对象(Class的实例)
 *
 * 注：JVM中每个被加载的类，都有且只有一个Class实例与之对应。后面反射知识点我们会详细说明。
 */
public class SyncDemo3 {

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                Foo.doSome();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                Foo.doSome();
            }
        };
        thread1.start();
        thread2.start();
    }
}

class Foo {
//    public synchronized static void dosome() {
    public static void doSome() {
        /**
         * 在静态方法中使用同步块，同步监视器对象通常指定为当前类的类对象，即：类名.class
         */
        synchronized (Foo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行dosome()方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println(t.getName()+":执行dosome()完毕");
        }
    }
}