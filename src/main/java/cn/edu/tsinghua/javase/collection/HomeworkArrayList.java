package cn.edu.tsinghua.javase.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:52 17 Oct 2017
 */
public class HomeworkArrayList {
    // 求得 ArrayList 对象的容量？

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("hi");
        }
        strings.add("hello");

        System.out.println(strings.size()); // 11

        // Object[] elementData;
        // length -> capacity;

        // class = field + method
        Field field = ArrayList.class.getDeclaredField("elementData");// java.lang.reflect
        field.setAccessible(true);

        strings.trimToSize();

        System.out.println(((Object[]) field.get(strings)).length);
//        ensure 确保\ [ɪn'ʃɔː\;\ -'ʃʊə\;\ en-]
/*
        int n = 10000000;

        ArrayList<Integer> list = new ArrayList<>(n);
//        list.ensureCapacity(n);
        int capacity = ((Object[]) field.get(list)).length;
        System.out.println("capacity: " + capacity);

        long begin = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println(System.currentTimeMillis() - begin);*/
    }
}
