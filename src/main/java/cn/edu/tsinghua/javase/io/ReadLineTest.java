package cn.edu.tsinghua.javase.io;

import java.io.*;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:26 25 Oct 2017
 */
public class ReadLineTest {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/cn/edu/tsinghua/javase/io/ReadLineTest.java"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {

}

class SubClass extends SuperClass {

    public void method() {
    }

//    public static void main(String[] args) {
//        SuperClass subClass = new SubClass();
//        subClass.method();
//    }
}

