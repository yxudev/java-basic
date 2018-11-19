package com.yishan.algorithm;

import com.yishan.stucture.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    public TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        return root;
    }

    public List<TreeNode> largestValues(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<TreeNode> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int s = queue.size();
            TreeNode temp = queue.peek();

            for (int i = 0; i < s; i++) {
                TreeNode tn = queue.poll();

                if (tn.val >= temp.val) {
                    temp = tn;
                }
                if (tn.right != null) {
                    queue.offer(tn.right);
                }
                if (tn.left != null) {
                    queue.offer(tn.left);
                }

            }
            result.add(temp);
        }
        return result;
    }
    public static void main(String args[]) {
        Bfs bfs = new Bfs();
        TreeNode root = bfs.buildBinaryTree();
        System.out.println(bfs.largestValues(root));

    }
}
