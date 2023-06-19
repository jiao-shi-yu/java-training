package thread;

public class TheardInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        // 获取线程的名字
        String name = main.getName();
        System.out.println(name);
        // 获取线程的唯一标识
        long id = main.getId();
        System.out.println("id:"+id);
        // 获取线程的优先级
        int priority = main.getPriority();
        System.out.println("优先级:" + priority);


        // 查看线程是否还活着
        boolean isAlive = main.isAlive();
        System.out.println("isAlive:"+isAlive);
        // 查看线程是否为守护线程
        boolean isDaemon = main.isDaemon();
        System.out.println("isDaemon:" + isDaemon);
        // 查看线程是否被中断了
        boolean isInterrupted = main.isInterrupted();
        System.out.println("isInterrupted: " + isInterrupted);

    }
}
