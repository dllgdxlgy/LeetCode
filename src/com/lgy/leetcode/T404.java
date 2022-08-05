package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-05 11:04
 */
public class T404 {


    /**
     * 递归
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);

        int midValue = 0;
        if(root.left != null && root.left.left == null && root.left.right ==null){
            midValue += root.left.val;
        }
        return midValue+left+right;
    }

    /**
     * 左叶子之和(第一遍)
     * @param root
     * @return
     */
    int num = 0;
    public int sumOfLeftLeaves_1(TreeNode root) {

        if(root.left == null && root.right == null){
            return 0;
        }
        dfs(root);
        return num;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null && root.left.left == null && root.left.right ==null){
            num+=root.left.val;
        }
        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node.left = node1;
        node.right = node2;
        node2.left = node3;
        node2.right = node4;
        T404 t404 = new T404();
        int i = t404.sumOfLeftLeaves(node);

    }
}
