package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author LGY
 * @create 2022-07-18 15:51
 */
public class T94 {


    ArrayList<Integer> res = new ArrayList<>();

    /**
     * 树的中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal_1(TreeNode root) {

            ArrayList<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            while(root != null || !stack.isEmpty()){
                while(root != null){
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
            return res;
    }
    public List<Integer> inorderTraversal_2(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(root!=null && !stack.isEmpty()){
            while(root!=null){
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
