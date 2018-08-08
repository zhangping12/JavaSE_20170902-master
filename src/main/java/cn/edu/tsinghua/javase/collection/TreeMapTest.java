package cn.edu.tsinghua.javase.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:34 19 Oct 2017
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "hi");
        map.put(-1, "hello");
        map.put(99, "abcd");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
