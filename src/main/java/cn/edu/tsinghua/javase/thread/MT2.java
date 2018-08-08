package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:40 30 Oct 2017
 */
public class MT2 implements Runnable {

    public static void main(String[] args) {
        MT2 mt2 = new MT2();
        Thread thread = new Thread(mt2);
        thread.start();
        System.out.println("main...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
