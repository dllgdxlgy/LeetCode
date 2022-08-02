package com.lgy.company.Other;

import com.lgy.company.leetcodecom.T;

import java.util.*;

/**
 * @author LGY
 * @create 2022-08-02 07:36
 */

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(int x) {
        this.val = x;

    }

}

public class Tree_prac {


    /**
     * 构建树
     * @return
     */
    public static TreeNode returnTreeNode() {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(4);
        TreeNode root4 = new TreeNode(5);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        return root;
    }

    public static void preOrder(TreeNode treeNode, List<Integer> list) {

        if (treeNode == null) {
            return;
        }

        list.add(treeNode.val);
        preOrder(treeNode.left, list);
        preOrder(treeNode.right, list);

    }

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        TreeNode root = returnTreeNode();
//        preOrder(root, list);
//        for (int integer : list) {
//            System.out.println(integer);
//        }

        TreeNode root = returnTreeNode();

//        List<Integer> list = preorderTraversal(root);
        List<Integer> list = levelorderTraversal(root);
        for(int i : list){
            System.out.print(i);
        }
    }


    public static List<Integer> preorderTraversal(TreeNode root){

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);

            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return list;
    }

    public static List<Integer> postorderTraversal(TreeNode root){

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);

            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static List<Integer> levelorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();

        if(root == null){
            return list;
        }

        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!= null){
                    queue.add(node.left);
                }
                if(node.right!= null){
                    queue.add(node.right);
                }
            }
        }
        return list;
    }


}
