package cn.edu.tsinghua.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:43 19 Oct 2017
 */
public class IteratorTest {
    public static void main(String[] args) {
//        ListIterator
//        Iterator 迭代器\ [ɪtə'reɪtə]

//        List Set

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(0));
        }
        System.out.println("---");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("---");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(iterator);
    }
}
