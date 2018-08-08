package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:31 30 Oct 2017
 */
public class MT3 implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new MT3());
        thread.setName("new thread");
        thread.start();

        try {
            thread.join(); // 并入主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
