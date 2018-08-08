package cn.edu.tsinghua.javase.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:50 03 Nov 2017
 */
public class OutputTest {
    public static void main(String[] args) {
        User user = new User(1, "Tom", 1.75, true);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user"))) {
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
