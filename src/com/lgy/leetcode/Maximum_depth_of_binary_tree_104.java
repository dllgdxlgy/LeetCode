package com.lgy.leetcode;

public class Maximum_depth_of_binary_tree_104 {

    int depth = 0;
    int res = 0;
    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    // 遍历二叉树
    void traverse(TreeNode root){
        if (root == null){
            return;
        }
        depth++;
        res = Math.max(res,depth);
        traverse(root.left);
        traverse(root.right);
        depth--;
    }
}
