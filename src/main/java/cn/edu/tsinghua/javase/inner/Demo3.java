package cn.edu.tsinghua.javase.inner;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:25 06 Nov 2017
 */
public class Demo3 {
    public static void main(String[] args) {
        Out3 out3 = new Out3();
        out3.print(18);
    }
}

class Out3 {
    private int age = 17;

    public void print(final int x) {
        class In {
            private void inPrint() {
                System.out.println(age);
                System.out.println(x);
            }
        }
//        new In().inPrint();
        In in = new In();
        in.inPrint();
    }
}
