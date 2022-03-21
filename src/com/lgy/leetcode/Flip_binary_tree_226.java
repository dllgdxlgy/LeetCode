package com.lgy.leetcode;

public class Flip_binary_tree_226 {
    public TreeNode invertTree(TreeNode root) {
        // 特殊条件判断
        if (root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
