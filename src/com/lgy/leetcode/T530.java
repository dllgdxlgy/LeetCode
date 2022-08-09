package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-08-07 12:14
 */
public class T530 {

    List<Integer> list = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        isAdd(root);
        for(int i =1;i<list.size();i++){
            int num = list.get(i)-list.get(i-1);
            if(num < res){
                res = num;
            }
        }
        return res;
    }

    public void isAdd(TreeNode node){
        if(node == null){
            return;
        }
        isAdd(node.left);
        list.add(node.val);
        isAdd(node.right);
    }


    /**
     * blabuladong
     * @param root
     * @return
     */
    public int getMinimumDifference_1(TreeNode root) {
        traverse(root);
        return res;
    }

    TreeNode prev = null;
    int res = Integer.MAX_VALUE;

    // 遍历函数
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        // 中序遍历位置
        if (prev != null) {
            res = Math.min(res, root.val - prev.val);
        }
        prev = root;
        traverse(root.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;

        T530 t530 = new T530();
        int minimumDifference_1 = t530.getMinimumDifference_1(node);
    }
}
