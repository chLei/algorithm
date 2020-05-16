package com.chLei.learn.algorihtm.bop;

/**
 * 打印对角线数组
 *
 * @author chenlei
 * @description
 * @date 2020-04-02 08:43
 */
public class PrintDiagonalArray {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int n = arr.length;
        int iStart = 0;
        int jStart = n - 1;

        while (iStart != n) {
            for (int i = iStart, j = jStart; i <= n - 1 && j <= n - 1; i++, j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            if (jStart > 0) {
                jStart--;
            } else {
                iStart++;
            }
            System.out.println();
        }
    }

}
