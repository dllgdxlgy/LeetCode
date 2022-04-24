package com.lgy.leetcode;

public class T112 {
    int target ;
    boolean found = false;
    int cursum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {

       if (root == null){
           return false;
       }
       this.target = targetSum;
       reverse(root);
       return found;
    }
    void reverse(TreeNode node){
        if (node == null){
            return;
        }
        cursum+=node.val;
        if (cursum == target && node.right == null && node.left == null){
            found = true;
        }
        reverse(node.left);
        reverse(node.right);
        cursum -= node.val;
    }

}
