package com.lgy.leetcode;

import sun.reflect.generics.tree.Tree;

public class T106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    TreeNode build(int[] inorder, int in_left, int in_right, int[] postorder, int post_left, int post_right) {

        if (in_left > in_right) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[post_right]);
        int index = 0;
        for (int i = in_left; i <= in_right; i++) {
            if (inorder[i] == root.val) {
                index = i;
                break;
            }
        }
        int temp = index - in_left;
        root.left = build(inorder, in_left, index - 1, postorder, post_left, temp + post_left - 1);
        root.right = build(inorder, index + 1, in_right, postorder, temp + post_left, post_right - 1);
        return root;
    }


}
