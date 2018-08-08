package cn.edu.tsinghua.javase.oop;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 13:28 14 Oct 2017
 */
public class Mankind {

    static {
        System.out.println("static block");
    }

    private static String earth;
    private String name;

    private static final int ONE_TWO_THREE = 123; // constant 常量

//    public Mankind(String name, double pi) {
//        this.name = name;
//        this.pi = pi;
//    }

    public static void method() {
//        name = "";
        earth = "";
        Mankind mankind = new Mankind();
        mankind.name = "";
    }

    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "Tom";
        Mankind.earth = "tom 种了一棵树";

        System.out.println(tom.name);
        System.out.println(Mankind.earth); // 1

        Mankind jerry = new Mankind();
        jerry.name = "Jerry";

        System.out.println(jerry.name);
        System.out.println(Mankind.earth); // 0
    }
}
