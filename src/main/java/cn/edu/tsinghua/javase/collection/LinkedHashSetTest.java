package cn.edu.tsinghua.javase.collection;

import java.util.LinkedHashSet;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:46 18 Oct 2017
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
            strings.add(i + "");
        }

        System.out.println(strings.size());
//        System.out.println(strings.get);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
