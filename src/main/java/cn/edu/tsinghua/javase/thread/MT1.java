package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:36 30 Oct 2017
 */
public class MT1 extends Thread {

    public static void main(String[] args) {
        MT1 mt1 = new MT1();
        mt1.start(); //
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        System.out.println("main...");
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
