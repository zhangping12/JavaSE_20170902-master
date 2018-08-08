package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:46 14 Oct 2017
 */
public class StringTest {

    private static void test(String s) {
        s = "hello";
    }

    private static void m(Integer integer) {
        integer ++;
    }

    public static void main(String[] args) {
        String s = "hi";
        test(s);
        System.out.println(s); // hi

        Integer integer = new Integer(0);
        m(integer);
        System.out.println(integer); // 0

//        boolean
//        Boolean

//        byte
//        Byte

//        char
//        Character

//        short
//        Short

//        int
//        Integer

//        long
//        Long

//        float
//        Float

//        double
//        Double
    }


}
