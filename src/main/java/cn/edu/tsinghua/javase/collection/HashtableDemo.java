package cn.edu.tsinghua.javase.collection;

import java.util.Hashtable;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:16 19 Oct 2017
 */
public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(1, "hi");
//        hashtable.put(null, "hi");
//        hashtable.put(1, null);

        System.out.println(hashtable.size());
    }
}
