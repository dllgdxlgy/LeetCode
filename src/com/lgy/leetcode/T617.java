package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-06 17:42
 */
public class T617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 != null){
            return root2;
        }
        if(root1 != null && root2 == null){
            return root1;
        }
        if(root1 == null && root2 == null){
            return null;
        }
        root1.val+=root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        return root1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(3);
        node.left = node1;
        node1.left = node2;
        node3.right = node4;
        node4.right = node5;
        T617 t617 = new T617();
        TreeNode treeNode = t617.mergeTrees(node, node3);

    }
}
