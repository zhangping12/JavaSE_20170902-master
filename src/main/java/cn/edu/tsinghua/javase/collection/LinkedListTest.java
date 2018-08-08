package cn.edu.tsinghua.javase.collection;

import java.util.LinkedList;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:03 18 Oct 2017
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        // linked v.\ 连接；串联（link的过去分词）
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers.get(9));
    }
}
