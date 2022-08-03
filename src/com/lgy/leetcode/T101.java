package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-02 12:57
 */
public class T101 {

    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode left_node, TreeNode right_node){
        if(left_node == null && right_node == null){
            return true;
        }
        if(left_node == null && right_node != null){
            return false;
        }
        if(left_node != null && right_node == null){
            return false;
        }

        if(left_node.val != right_node.val){
            return false;
        }
        return dfs(left_node.left,right_node.right)&&dfs(left_node.right,right_node.left);
    }
}
