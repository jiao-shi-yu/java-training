package thread;

/**
 * 守护线程
 * 也称为后台线程，守护线程是通过普通线程调用setDaemon(true)设置而来的。
 * 守护线程与普通线程在结束时机上有一点不同：进程结束时
 *
 * 当java进程中所有的普通线程都结束时，该进程就会结束，此时会杀死所有还在运行的守护线程。
 *
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++ ) {
                    System.out.println("Rose: Let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("Rose: 啊啊啊啊啊~~~");
                System.out.println("噗通");

            }
        };
        rose.start();

        Thread jack = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Jack:You jump, I jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }

        };
        /*
        设置守护线程——这件事——必须在线程启动前进行。
         */
        jack.setDaemon(true);
        jack.start();
        System.out.println("main方法执行完毕了");

        /*
        主线程也是普通线程，如果主线程在这里死循环，也就是说主线程会一直活着，那么jack作为守护线程，也不会被杀死。
         */
//        while (true);
    }

}
