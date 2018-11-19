//package com.yishan.algorithm;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.LinkedList;
//import java.util.Queue;
//
//
//public class BFS {
//
//
//    public TreeNode() {
//        TreeNode tn = new TreeNode();
//        tn.root = new Node(1);
//        tn.root.left = new Node(3);
//        tn.root.right = new Node(2);
//        tn.root.left.left = new Node(5);
//        tn.root.left.right = new Node(3);
//        tn.root.right.right = new Node(9);
//    }
//
//    public List<Integer> largestValues(TreeNode root) {
//
//        if (root == null) {
//            return new ArrayList<>();
//        }
//
//        List<Integer> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int temp = queue.peek().val;
//            for (int i = 0; i <= temp; i++) {
//                TreeNode tn = queue.poll();
//
//                if (tn.val > temp) {
//                    temp = tn.val;
//                }
//                if (tn.right != null) {
//                    queue.offer((TreeNode) tn.right);
//                }
//                if (tn.left != null) {
//                    queue.offer((TreeNode) tn.left);
//                }
//
//            }
//            result.add(temp);
//        }
//        return result;
//    }
//
//        @Override
//    public String toString() {
//        return super.toString(largestValues((TreeNode) tn.val));
//    }
//
//    public static void main(String args[]) {
//        System.out.println(tn.val);
//
//    }
//}