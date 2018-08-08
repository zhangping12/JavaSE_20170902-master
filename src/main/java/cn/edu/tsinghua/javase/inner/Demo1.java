package cn.edu.tsinghua.javase.inner;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:06 06 Nov 2017
 */
public class Demo1 {
    public static void main(String[] args) {
//        Out1.In in = (new Out1()).new In();
//        in.print();

        Out1 out = new Out1();
        Out1.In in = out.new In();
        in.print();
    }
}

// Inner class

// class = field + method [+ inner class]

class Out1 {
    private int age = 17;

    class In {
        public void print() {
            System.out.println(age);
        }
    }
}