package cn.edu.tsinghua.javase.reflect;

import java.lang.reflect.Method;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:17 27 Oct 2017
 */
public class MethodsTest {
    public static void main(String[] args) {
        for (Method method : Human.class.getMethods()) {
            System.out.println(method.getName());
        }
        System.out.println("---");
        for (Method method : Human.class.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
