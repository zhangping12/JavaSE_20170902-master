package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:47 31 Oct 2017
 */
public class MT6 implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "\t:\t" + thread.getPriority());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MT6(), "thread1");
        Thread thread2 = new Thread(new MT6(), "thread2");
        Thread thread3 = new Thread(new MT6(), "thread3");

        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.NORM_PRIORITY); // 5
        thread3.setPriority(Thread.MAX_PRIORITY); // 10

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
