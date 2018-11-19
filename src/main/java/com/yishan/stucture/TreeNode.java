package com.yishan.stucture;

public class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }

}
