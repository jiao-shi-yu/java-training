package thread;

/**
 * 协调线程同步运行可以使用线程的join方法
 * 该方法允许一个线程在另一个线程上等待，直到该线程结束后才会结束等待，继续后续工作。
 *
 * 同步运行：多个线程执行存在了先后顺序。 （同步与异步）
 */
public class JoinDemo {
    // 标识图片是否下载完毕
    private static boolean isFinish = false;
    public static void main(String[] args) {
        Thread download = new Thread() {
            @Override
            public void run() {
                System.out.println("down:开始下载图片...");
                for (int i = 0; i <= 100; i++) {
                    System.out.println("down:" + i + "%");
                    try {
                        Thread.sleep(50);
                    }catch (InterruptedException e) {
                    }
                }
                System.out.println("down:下载完成");
                isFinish = true;
            }
        };
        download.start();

        Thread show = new Thread() {
            @Override
            public void run() {
                System.out.println("开始显示商品列表...");
                System.out.println("显示列表中的文字...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {

                }
                System.out.println("列表中的文字显示完毕");
                // 等待download执行完毕
                try {
                    /*
                    show线程执行到这里，会进入堵塞状态，直到download线程结束执行，show线程才会结束堵塞。
                     */
                    download.join();
                } catch (InterruptedException e) {

                }
                // 下载完成后才会显示图片
                System.out.println("开始显示图片...");

                if (!isFinish) { // 如果图片没有下载完毕
                    throw new RuntimeException("图片加载失败！");
                }
                System.out.println("显示图片完毕");
            }
        };
        show.start();

    }
}
