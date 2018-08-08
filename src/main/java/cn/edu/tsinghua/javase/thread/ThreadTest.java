package cn.edu.tsinghua.javase.thread;

/**
 * 线程 A 循环 5 次后等待并放弃锁，让线程 B 执行
 */
class ThreadA extends Thread {
    private final Object oa;

    ThreadA(Object o) {
        this.oa = o;
    }

    public void run() {
        //线程同步区域，需要申请公共数据的锁
        synchronized (oa) {
            System.out.println("Thread A is running...");
            for (int i = 0; i < 10; i++) {
                System.out.println("\tThread A value is: " + i);
                if (i == 5) {
                    try {
                        //当前线程等待
                        oa.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

/**
 * 线程 B 等待线程 A 放弃锁，然后获得锁并执行，完成后唤醒线程 A
 */
class ThreadB extends Thread {
    private final Object ob;

    ThreadB(Object o) {
        this.ob = o;
    }

    public void run() {
        //线程同步区域，需要申请公共数据的锁
        synchronized (ob) {
            System.out.println("Thread B is running...");
            for (int i = 0; i < 10; i++) {
                System.out.println("\tThread B value is: " + i);
            }
            //唤醒等待的线程
            ob.notify();
        }
    }
}

//测试
public class ThreadTest {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        threadA.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        threadB.start();
    }
}