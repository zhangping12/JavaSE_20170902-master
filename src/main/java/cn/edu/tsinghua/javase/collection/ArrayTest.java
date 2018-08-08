package cn.edu.tsinghua.javase.collection;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:13 15 Oct 2017
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] ints;
        boolean[] booleans;

        ints = new int[10];

        booleans = new boolean[10];

        String[] strings = new String[5];

//        double doubles[] = new double[10];

        double[] doubles = {1.2, 3.4, 5.6};

        System.out.println("---" + doubles.length);

        System.out.println(ints[0]);
        System.out.println(booleans[0]);
        System.out.println(strings[0]);

        ints[0] = 123;
        System.out.println(ints[0]);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                System.out.println(ints[i]);
            }
        } // fori + Tab

        for (double aDouble : doubles) {
            System.out.println(aDouble);
        } // iter + Tab

        char[] chars = new char[10];
//        chars[0] = 1.2;

        Object[] array = new Object[10];
        array[0] = 1;
        array[1] = "hi";
    }
}
