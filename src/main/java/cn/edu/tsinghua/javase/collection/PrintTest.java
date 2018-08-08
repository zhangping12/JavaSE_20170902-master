package cn.edu.tsinghua.javase.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PrintTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map);
        System.out.println(Arrays.asList(map)); // method 1
        System.out.println(Collections.singletonList(map)); // method 2
    }
}
