package cn.edu.tsinghua.javase.generic;

import java.io.Serializable;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:57 20 Oct 2017
 */
public class Test<T extends Serializable> {

    public T test(T x) {
        // ...
        return x; // true + false = ?
    }

    public static void main(String[] args) {
        Test<A> ta = new Test<>();
        System.out.println(ta.test(new A()));

//        Test<A> aTest = new Test<>();
//        System.out.println(aTest.test(new A()));

//        Test<C> tc = new Test<>();
//        System.out.println(tc.test(new C()));
    }
}

class A implements Serializable {

}

class C {

}
