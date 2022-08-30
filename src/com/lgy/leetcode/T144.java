package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author LGY
 * @create 2022-08-30 17:37
 */
public class T144 {

    /**
     * 递归
     */
    List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        res.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal_1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();

            res.add(temp.val);
            if(temp.right!=null){
                stack.add(temp.right);
            }
            if(temp.left!=null){
                stack.add(temp.left);
            }
        }

        return res;
    }
}
