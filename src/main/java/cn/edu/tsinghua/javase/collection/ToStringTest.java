package cn.edu.tsinghua.javase.collection;

import java.util.Scanner;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:24 17 Oct 2017
 */
public class ToStringTest {
    public static void main(String[] args) {
//        toString()

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.toString()); // ?

        ToStringTest toStringTest = new ToStringTest();
        System.out.println(toStringTest.hashCode()); // 对象的哈希码
        System.out.println(Integer.toHexString(toStringTest.hashCode()));
        System.out.println(toStringTest.toString());
        // cn.edu.tsinghua.javase.collection.ToStringTest@66d3c617
        // FQN@HEX

        int[] ints = {1, 2, 3};
        System.out.println(ints);
    }
}
