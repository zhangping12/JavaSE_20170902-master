package cn.edu.tsinghua.javase.exception;

import java.io.FileNotFoundException;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:08 24 Oct 2017
 */
public class ThrowsTest {

    public void method() throws FileNotFoundException {
        // ...
        int x = 1/0;
    }

    public void test() {
        try {
            method();
        } catch (FileNotFoundException e) {

        }
    }
}
