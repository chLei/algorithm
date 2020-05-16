package com.chLei.learn.algorihtm.bop;

import java.util.concurrent.TimeUnit;

/**
 * 让电脑cpu占用在一个直线上
 * @author chenlei
 * @description
 * @date 2020-02-15 18:15
 */
public class CpuUse {
    public static void main(String[] args) throws InterruptedException {
        for(;;){
            for (int i = 0; i < 9600000; i++)
                ;
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}
