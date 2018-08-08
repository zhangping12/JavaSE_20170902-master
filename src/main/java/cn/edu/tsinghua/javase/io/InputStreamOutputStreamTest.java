package cn.edu.tsinghua.javase.io;

import java.io.*;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:09 25 Oct 2017
 */
public class InputStreamOutputStreamTest extends FileInputStream {

    private static final String FILE = "src/main/java/cn/edu/tsinghua/javase/io/InputStreamOutputStreamTest.java";

    public InputStreamOutputStreamTest(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void close() throws IOException {
        super.close();
        System.out.println("closed...");
    }

    public static void main(String[] args) {

        // try with resources JDK7.0
        try (
                InputStreamOutputStreamTest inputStream = new InputStreamOutputStreamTest(FILE);
                OutputStream outputStream = new FileOutputStream("test")
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



//        try {
//            int x = 1 / 0;
//            System.out.println("hi".charAt(2));
//        } catch (ArithmeticException | StringIndexOutOfBoundsException e) { // JDK7.0 Multi-catch
//            e.printStackTrace();
//        } // close(); ?
    }
}
