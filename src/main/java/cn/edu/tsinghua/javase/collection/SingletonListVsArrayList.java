package cn.edu.tsinghua.javase.collection;

import java.util.*;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:05 20 Oct 2017
 */
public class SingletonListVsArrayList {
    public static void main(String[] args) {
        String[] strings = {"hi", "hello"};
        List<String> list = Arrays.asList(strings); // *****

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        list = Collections.singletonList("test");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.size());
     }
}
