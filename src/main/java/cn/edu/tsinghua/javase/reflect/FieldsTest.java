package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Field;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:13 27 Oct 2017
 */
public class FieldsTest {
    public static void main(String[] args) {
        for (Field field : Human.class.getFields()) {
            System.out.println(field.getName());
        }
        System.out.println("---");
        for (Field field : Human.class.getDeclaredFields()) {
            // 宣布\ [dɪ'kleəd]
            System.out.println(field.getName());
        }
    }
}
