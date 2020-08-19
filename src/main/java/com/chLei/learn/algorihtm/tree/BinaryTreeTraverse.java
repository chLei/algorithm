package com.chLei.learn.algorihtm.tree;

import com.chLei.learn.algorihtm.entity.BinaryTree;

/**
 * @Author: chenlei
 * @Date: 2020/8/13
 */
public class BinaryTreeTraverse {

    private static BinaryTree binaryTree = new BinaryTree();

    static {
        binaryTree.setVal(0);
        binaryTree.setLeft(BinaryTree.builder().val(1).left(BinaryTree.builder().val(3).build()).right(BinaryTree.builder().val(4).build()).build());
        binaryTree.setRight(BinaryTree.builder().val(2).left(BinaryTree.builder().val(5).build()).right(BinaryTree.builder().val(6).build()).build());
    }

    public static void main(String[] args) {
        qianxu(binaryTree);

        System.out.println("------------");

        zhongxu(binaryTree);

        System.out.println("------------");

        houxu(binaryTree);
    }

    /**
     * 前序遍历
     * @param root
     */
    public static void qianxu(BinaryTree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getVal());
        qianxu(root.getLeft());
        qianxu(root.getRight());
    }

    /**
     * 中序遍历
     * @param root
     */
    public static void zhongxu(BinaryTree root) {
        if (root == null) {
            return;
        }
        zhongxu(root.getLeft());
        System.out.println(root.getVal());
        zhongxu(root.getRight());
    }

    /**
     * 后序遍历
     * @param root
     */
    public static void houxu(BinaryTree root) {
        if (root == null) {
            return;
        }
        houxu(root.getLeft());
        houxu(root.getRight());
        System.out.println(root.getVal());
    }
}
