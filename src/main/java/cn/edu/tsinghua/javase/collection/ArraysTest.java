package cn.edu.tsinghua.javase.collection;

import java.util.Arrays;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:31 19 Oct 2017
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] ints = {1, -1, 100, 1000, -10000};
        Arrays.sort(ints); // *****
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.binarySearch(ints, -10000)); // 二分查找

//        Arrays.fill(ints, 1); // fill 填满\ [fɪl]
        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        System.out.println(Arrays.toString(ints));

        int[][] ints1 = {
                {1, -1, 10},
                {-2, -3},
                {3, 2, 1, 0}
        };
        System.out.println(Arrays.deepToString(ints1));
    }
}
