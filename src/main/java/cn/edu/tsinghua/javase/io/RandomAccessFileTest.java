package cn.edu.tsinghua.javase.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:46 25 Oct 2017
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5); // 0, 0.5, 1, 1.5, ..., 4.5
            }
            randomAccessFile.seek(8*9); // seek I Seek You ICQ OICQ QQ
            System.out.println(randomAccessFile.readDouble()); // EOFException End Of File
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
