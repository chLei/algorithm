package com.chLei.learn.algorihtm.leetcode;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= matrix.length <= 100
 * 0 <= matrix[i].length <= 100
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof
 *
 * @Author: chenlei
 * @Date: 2020/5/16
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] res = spiralOrder(matrix);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++) {
                // left to right.
                res[x++] = matrix[t][i];
                System.out.println("x=" + (x - 1) + ", v=" + res[x - 1]);
            }
            if (++t > b) break;
            for (int i = t; i <= b; i++) {
                // top to bottom.
                res[x++] = matrix[i][r];
                System.out.println("x=" + (x - 1) + ", v=" + res[x - 1]);
            }
            if (l > --r) break;
            for (int i = r; i >= l; i--) {
                // right to left.
                res[x++] = matrix[b][i];
                System.out.println("x=" + (x - 1) + ", v=" + res[x - 1]);
            }
            if (t > --b) break;
            for (int i = b; i >= t; i--) {
                // bottom to top.
                res[x++] = matrix[i][l];
                System.out.println("x=" + (x - 1) + ", v=" + res[x - 1]);
            }
            if (++l > r) break;
        }
        return res;
    }
}