package com.lgy.leetcode;


import java.util.ArrayList;
import java.util.List;

public class Expand_binary_tree_into_linked_list_114 {

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);

        // 左右子树已经被拉平成一条链表
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;
        TreeNode p = root;
        while (p.right != null){
            p = p.right;
        }
        p.right = right;

    }


}

