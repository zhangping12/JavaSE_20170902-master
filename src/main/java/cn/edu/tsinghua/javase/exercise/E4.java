package cn.edu.tsinghua.javase.exercise;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 16:15 23 Sep 2017
 */

// 将一个正整数分解质因数
// 例如：输入90，打印出 90=2*3*3*5
public class E4 {

    private void test(int n) {
        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0) {
                if (n == i) {
                    System.out.print(i);
                } else {
                    System.out.print(i + "*");
                    test(n / i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 121;

        E4 e4 = new E4();
        e4.test(n);
    }
}
