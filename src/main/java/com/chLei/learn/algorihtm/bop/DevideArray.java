package com.chLei.learn.algorihtm.bop;

/**
 * 写一个函数，返回一个数组中所有元素被第一个元素除的结果
 *
 * @author chenlei
 * @description
 * @date 2020-02-15 17:49
 */
public class DevideArray {

    public static void main(String[] args) {

        int[] arrs = new int[]{2, 2, 3, 4, 5};

        for (int i = arrs.length - 1; i >= 0; i--) {
            arrs[i] /= arrs[0];
        }

        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
    }
}
