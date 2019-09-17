package com.yishan.stucture;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(){
    }


    public List<Integer> largestValue(TreeNode val){return null;}

    private int travese(){
        Queue<Integer> queue = new LinkedList();
        queue.offer(1221);
        while (!queue.isEmpty()){
           //int size = queue.size();
            Integer treeNode = queue.poll();
        }
        return val;
    }

    public static void main(String[] args){
            TreeNode t = new TreeNode();
            System.out.println(t.travese());
    }

}