package cn.edu.tsinghua.javase.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:43 15 Oct 2017
 */

// 随机生成[1， 20]数 10000 次，使用两种方法实现（java.lang.Math，java.util.Random）
// 并判断两种方法的 效率 和 分布 (Hashtable)
public class E34 {
    public static void main(String[] args) {
        /*
            1 - 500
            2 - 500
            .
            .
            .
            20 -500
         */

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(i + 1, 0);
        }

        /*
        * 1 - 0
        * 2 - 0
        * .
        * .
        * .
        * 20 - 0
        * */

        Random random = new Random();

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            int r = (int) (Math.random() * 20) + 1;
            int r = random.nextInt(20) + 1;
            map.put(r, map.get(r) + 1); // *****
        }
        System.out.println(System.currentTimeMillis() - begin);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
