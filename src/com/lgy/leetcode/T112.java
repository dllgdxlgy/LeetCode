package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.List;

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


    /**
     * 第二遍
     */
    boolean isFlag = false;
    public boolean hasPathSum_2(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return isFlag;
    }

    int sum = 0;
    public void dfs(TreeNode node, int targetSum){
        if (node == null) {
            return;
        }
        sum+=node.val;

        if(node.left == null && node.right == null&& sum == targetSum){
            isFlag = true;
        }
        dfs(node.left,targetSum);
        dfs(node.right,targetSum);
        sum-=node.val;
    }


    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        node.left = node1;
        node.right = node2;
        T112 t112 = new T112();
        boolean b = t112.hasPathSum_2(node, 5);
        System.out.println(b);

        List<Integer> list = new LinkedList<>();
        list.size();
    }
}
