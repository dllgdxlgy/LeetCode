package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Middle_order_traversal_of_binary_tree_94 {
    // 二叉树递归方法
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new LinkedList<>();
        inorder(root,list);
        return list;
    }

    // 递归遍历二叉树
    public void inorder(TreeNode root, List<Integer> res){
        if (root == null){
            return ;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }


    // 显示的使用栈
    public List<Integer> inorderTraversal_1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null){
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty() ){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
