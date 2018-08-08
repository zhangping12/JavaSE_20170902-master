package cn.edu.tsinghua.javase.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:32 19 Oct 2017
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "hi");
        map.put(-1, "hello");
        map.put(999, "hi");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
