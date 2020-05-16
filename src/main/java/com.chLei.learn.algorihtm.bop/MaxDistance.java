package com.chLei.learn.algorihtm.bop;

import lombok.Data;

/**
 * 求二叉树两个节点最远距离
 *
 * @author chenlei
 * @description
 * @date 2020-04-11 15:17
 */
public class MaxDistance {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.setPLeft(new Node(2));
        node.setPRight(new Node(3));

        FindMaxLen(node);

        System.out.println(nMaxLen);
    }

    @Data
    private static class Node {
        Node pLeft;        // 左子树
        Node pRight;       // 右子树
        int nMaxLeft;       // 左子树中的最长距离
        int nMaxRight;      // 右子树中的最长距离
        int value;       // 该节点的值

        public Node(int value) {
            this.value = value;
        }

        public Node() {
        }
    }

    private static int nMaxLen = 0;

    // 寻找树中最长的两段距离
    private static void FindMaxLen(Node pRoot) {
        // 遍历到叶子节点，返回
        if (pRoot == null) {
            return;
        }

        // 如果左子树为空，那么该节点的左边最长距离为0
        if (pRoot.getPLeft() == null) {
            pRoot.setNMaxLeft(0);
        }

        // 如果右子树为空，那么该节点的右边最长距离为0
        if (pRoot.getPRight() == null) {
            pRoot.setNMaxRight(0);
        }

        // 如果左子树不为空，递归寻找左子树最长距离
        if (pRoot.getPLeft() != null) {
            FindMaxLen(pRoot.getPLeft());
        }

        // 如果右子树不为空，递归寻找右子树最长距离
        if (pRoot.getPRight() != null) {
            FindMaxLen(pRoot.getPRight());
        }

        // 计算左子树最长节点距离
        if (pRoot.getPLeft() != null) {
            pRoot.setNMaxLeft(((pRoot.getPLeft().getNMaxLeft() > pRoot.getPLeft().getNMaxRight()) ? pRoot.getPLeft().getNMaxLeft() : pRoot.getPLeft().getNMaxRight()) + 1);
        }

        // 计算右子树最长节点距离
        if (pRoot.getPRight() != null) {
            pRoot.setNMaxRight(((pRoot.getPRight().getNMaxLeft() > pRoot.getPRight().getNMaxRight()) ? pRoot.getPRight().getNMaxLeft() : pRoot.getPRight().getNMaxRight()) + 1);
        }

        // 更新最长距离
        if (pRoot.getNMaxLeft() + pRoot.getNMaxRight() > nMaxLen) {
            nMaxLen = pRoot.getNMaxLeft() + pRoot.getNMaxRight();
        }
    }
}
