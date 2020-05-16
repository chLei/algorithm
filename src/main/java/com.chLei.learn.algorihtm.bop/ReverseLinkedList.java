package com.chLei.learn.algorihtm.bop;

/**
 * 单链表逆置
 *
 * @author chenlei
 * @description
 * @date 2020-04-25 12:02
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        a.setNext(b);
        b.setNext(c);
        c.setNext(null);

        Node ne = reverse(a);

        while (ne != null) {
            System.out.println(ne.getData());
            ne = ne.getNext();
        }

    }

    public static Node reverse(Node head) {
        Node pre = null;
        Node cur = head;

        while (cur != null) {
            Node tmp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = tmp;
        }

        return pre;
    }

    private static class Node {
        public Node(String data) {
            this.data = data;
        }

        public Node() {
        }

        private String data;
        private Node next;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
