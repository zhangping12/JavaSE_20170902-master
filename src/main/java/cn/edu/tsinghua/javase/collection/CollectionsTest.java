package cn.edu.tsinghua.javase.collection;

import java.util.*;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:21 19 Oct 2017
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(99);
        list.add(1);

//        Collections.reverse(list); // reverse 反向\ [rɪ'vɜːs]
        Collections.sort(list); // sort 排序\ [sɔːt]

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(Collections.singletonList(list));
        System.out.println("->" + list);
        System.out.println(Arrays.asList(list));

        Map<Integer, String> map = new HashMap<>();
        map.put(-1, "hi");
        map.put(100, "hello");
        map.put(1, "abcd");

        System.out.println(Collections.singletonList(map));
        System.out.println("->" + map);
        System.out.println(Arrays.asList(map));

    }
}
