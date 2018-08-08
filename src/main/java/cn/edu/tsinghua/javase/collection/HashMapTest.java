package cn.edu.tsinghua.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:19 19 Oct 2017
 */
public class HashMapTest {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hi");
        map.put(null, "hi");
        map.put(1, null);
        map.put(null, null);

        System.out.println(map.size());

        System.out.println(map.get(null));
        System.out.println(map.get(1));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + "->" + map.get(integer));
        }

        for (String s : map.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
