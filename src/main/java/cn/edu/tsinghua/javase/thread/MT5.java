package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:22 31 Oct 2017
 */
public class MT5 implements Runnable {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MT5(), "thread1");
        Thread thread2 = new Thread(new MT5(), "thread2");

        thread1.start();
        thread2.start();

        System.out.println("main...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "\t:" + Thread.currentThread().getName() + " is running...");
            if (i % 10 == 0) {
                Thread.yield(); //
            }
        }
    }
}
