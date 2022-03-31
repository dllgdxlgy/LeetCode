package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-03-31 21:12
 */
public class T538 {

    public int sum =0;
    public TreeNode convertBST(TreeNode root) {

        traverse(root);

        return root;
    }
    public void traverse(TreeNode treeNode){

        if (treeNode == null){
            return;
        }

        traverse(treeNode.right);

        sum += treeNode.val;
        treeNode.val = sum;

        traverse(treeNode.left);

    }
}
