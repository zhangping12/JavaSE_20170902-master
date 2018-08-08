package cn.edu.tsinghua.javase.exercise;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 13:08 23 Sep 2017
 */

// 判断[101,200]有多少个素数，并输出所有素数
// 素数：只能被1和它本身整除的正整数（1不是素数）
public class E2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 2; i < 201; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("counter: " + counter);
    }
}
