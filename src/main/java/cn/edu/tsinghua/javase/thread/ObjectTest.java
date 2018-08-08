package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:47 02 Nov 2017
 */
public class ObjectTest {
    public static void main(String[] args) throws InterruptedException {
//        wait notify notifyAll
//        Object o = new Object();
//        System.out.println(o);
//        o.wait();
//        o.notify();
//        o.notifyAll();

//        String s = "test";
//        s.wait();
//        s.notify();
//        s.notifyAll();

        Object o = new Object();
//        Object lock = new Object();

//        synchronized (o) {
//            o.wait();
//        }

        synchronized (o) {
//            o.notify();
            o.notifyAll();
            System.out.println("test...");
            o.wait();
        }
    }
}
