package com.chLei.learn.algorihtm.bop;

/**
 * 打印array里面n个元素的组合
 *
 * @author chenlei
 * @description
 * @date 2020-04-01 10:01
 */
public class GetCombination {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] result = new int[4];
        combine_decrease(arr, 0, result, 2, 2, 4);
    }

    private static void combine_decrease(int[] arr, int start, int[] result, int count, int NUM, int length) {
        int i = 0;
        for (i = start; i < length + 1 - count; i++) {
            result[count - 1] = i;
            if (count - 1 == 0) {
                for (int j = NUM - 1; j >= 0; j--) {
                    System.out.print(arr[result[j]]);
                }

                System.out.println();
            } else {
                combine_decrease(arr, i + 1, result, count - 1, NUM, length);
            }

        }

    }
}
