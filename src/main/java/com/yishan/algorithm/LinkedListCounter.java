package com.yishan.algorithm;

    class Node{

        private int val;
        Node next;
        Node(int d){
            this.val=d;
            this.next=null;
        }
    }

    class Counter{
        public int counter(Node val){
            int count = 0;
            while (val.next != null){
                count++;
                val=val.next;
            }
            return count;
        }
    }
public class LinkedListCounter {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(4);
        n1.next = n2;
        Counter sol = new Counter();
        int res = sol.counter(n1);
        System.out.println(res);

    }
}
