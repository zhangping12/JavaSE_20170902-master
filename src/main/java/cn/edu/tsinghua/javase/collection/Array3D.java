package cn.edu.tsinghua.javase.collection;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 11:00 15 Oct 2017
 */
public class Array3D {
    public static void main(String[] args) {
        int[][][] vector = new int[3][5][7];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                for (int k = 0; k < vector[i][j].length; k++) {
                    vector[i][j][k] = i + j + k;
                    System.out.println(vector[i][j][k]);
                } // 255
            }
        }
    }
}
