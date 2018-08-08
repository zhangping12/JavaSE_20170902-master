package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:20 27 Oct 2017
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            strings.add("hi");
        }
        strings.add("hello");

        System.out.println(strings.size());

//        Field field = strings.getClass().getDeclaredField("elementData"); // method1
//        Field field = ArrayList.class.getDeclaredField("elementData"); // method2
        Class clazz = Class.forName("java.util.ArrayList");
        Field field = clazz.getDeclaredField("elementData"); // method3
        field.setAccessible(true);
        int capacity = ((Object[]) field.get(strings)).length;
        System.out.println(capacity);
    }
}
