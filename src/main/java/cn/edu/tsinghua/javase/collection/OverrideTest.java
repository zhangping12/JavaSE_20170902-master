package cn.edu.tsinghua.javase.collection;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:37 17 Oct 2017
 */
public class OverrideTest extends Object {


    public static void main(String[] args) {
        OverrideTest overrideTest = new OverrideTest();
        System.out.println(overrideTest.toString()); // 隐式
    }

    @Override
    public String toString() {
        return "zhangsan";
    }

    // Object hashCode() equals() toString()
}
