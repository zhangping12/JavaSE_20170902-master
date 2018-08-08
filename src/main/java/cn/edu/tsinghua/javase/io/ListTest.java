package cn.edu.tsinghua.javase.io;

import java.io.File;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:04 27 Oct 2017
 */
public class ListTest {
    public static void main(String[] args) {
        File file = new File("/"); // unix linux

        String[] files = file.list();
        if (files != null) {
//            System.out.println(files.length);
            for (String filenName : files) {
                System.out.println(filenName);
            }
        }
    }

    /*

    / |-f1
      |-f2
      |-d1
          |-f11
          |-f22

     */
}
