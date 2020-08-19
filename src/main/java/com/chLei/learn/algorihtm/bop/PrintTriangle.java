package com.chLei.learn.algorihtm.bop;

/**
 * 打印等腰三角形
 *
 * @author chenlei
 * @description
 * @date 2020-03-30 21:57
 */
public class PrintTriangle {

    public static void main(String[] args) {
        print(3);
    }

    /**
     * 打印实心的三角形
     *
     * @param rows
     */
    public static void printShiXin(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= 2 * i - 1; x++) {
                System.out.print("1");
            }

            System.out.println();
        }
    }

    /**
     * 打印空心的三角形
     *
     * @param rows
     */
    public static void print(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= 2 * i - 1; x++) {
                if (x % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
