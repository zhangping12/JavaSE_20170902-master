package cn.edu.tsinghua.javase.inner;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:17 06 Nov 2017
 */
public class Demo2 {
    public static void main(String[] args) {
        Out2.In in = new Out2.In();
        in.print();
    }
}

class Out2 {
    private static int age = 17;

    static class In {
        public void print() {
            System.out.println(age);
        }
    }
}

