package cn.edu.tsinghua.javase.collection;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:50 18 Oct 2017
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("北京");
        strings.add("你好");
        strings.add("广州");
        strings.add("上海");
        strings.add("一");

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("中");
        System.out.println(strings1.get(0));

        char c1 =  'a';
        char c2 =  'b';
        char c3 =  'c';
        char c4 =  'd';
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println((int)c3);
        System.out.println((int)c4);
        System.out.println((int)'a');
    }
}