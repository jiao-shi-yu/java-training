package thread;

/**
 * Java中所有的代码，都是靠线程执行的，main()方法也不例外。
 * JVM启动后会创建一条线程来执行main()方法，这条线程被取名为"main"，俗称：主线程。
 * 我们自己创建的线程，也可以取名字，但通常默认值，格式为:"Thread-X"(X是一个数字，由系统分配）
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        // 获取主线程
        Thread main = Thread.currentThread();
        System.out.println("主线程：" + main);
        
        dosome();
        System.out.println("main方法执行完了," + main + "执行完毕了");
    }

    private static void dosome() {
        Thread t = Thread.currentThread();
        System.out.println("执行dosome方法的线程是" + t);
    }
}
