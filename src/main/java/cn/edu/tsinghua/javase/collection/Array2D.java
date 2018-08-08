package cn.edu.tsinghua.javase.collection;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 10:50 15 Oct 2017
 */
public class Array2D {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];

        System.out.println(ints.length);
        System.out.println(ints[0].length);
        System.out.println(ints[1].length);
        System.out.println(ints[2].length);

        System.out.println("---");
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("---");

        String[][] strings = new String[3][];
        strings[0] = new String[5];
        strings[1] = new String[4];
        strings[2] = new String[3];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i + "" + j;
                System.out.print(strings[i][j] + "\t");
            }
            System.out.println();
        }

        double[][] doubles = {
                {1d, 2d, 3d},
                {4d, 5d},
                {7d}
        };

    }
}
