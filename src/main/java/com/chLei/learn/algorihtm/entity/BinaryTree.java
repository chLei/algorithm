package com.chLei.learn.algorihtm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: chenlei
 * @Date: 2020/8/13
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BinaryTree {

    private int val;

    private BinaryTree left, right;
}
