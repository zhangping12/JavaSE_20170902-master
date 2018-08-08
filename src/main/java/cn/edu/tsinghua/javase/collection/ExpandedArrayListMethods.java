package cn.edu.tsinghua.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:33 18 Oct 2017
 */
public class ExpandedArrayListMethods {
    public static void main(String[] args) {
        // equals - Object
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
//        list2.add(2);
//        list2.add(3);

        System.out.println(list1.equals(list2));
        System.out.println(list1 == list2); // ?

//        List list3 = list1.subList(0, 2); // view 视图
//        System.out.println(list3);

        list1.remove(1);
//        System.out.println(list3);

        System.out.println(list1.containsAll(list2));

//        list1.removeIf() // JDK 1.8 Lambda

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.retainAll(list2));
        System.out.println(list1);

    }
}
