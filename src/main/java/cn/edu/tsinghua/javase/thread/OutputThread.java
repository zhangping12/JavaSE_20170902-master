package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:46 03 Nov 2017
 */
public class OutputThread implements Runnable {

    private int num;
    private final Object lock;

    private OutputThread(int num, Object lock) {
        this.num = num;
        this.lock = lock;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {
            synchronized (lock) {
                System.out.println(num);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread1 = new Thread(new OutputThread(1, lock));
        Thread thread2 = new Thread(new OutputThread(2, lock));

        thread1.start();
        thread2.start();
    }
}
