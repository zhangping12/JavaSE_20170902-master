package cn.edu.tsinghua.javase.collection;

import java.util.HashSet;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:43 18 Oct 2017
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            strings.add(i + "");
        }
        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }

//        System.out.println(strings.get());
    }
}
