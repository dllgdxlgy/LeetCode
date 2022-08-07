package com.lgy.leetcode;

import com.lgy.company.leetcodecom.T;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-08-05 15:36
 */
public class T113 {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return res;
        }

        dfs(root, targetSum);
        return res;
    }

    public void dfs(TreeNode root, int targetSum) {

        list.add(root.val);

        if (root.left == null && root.right == null) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if (targetSum == sum) {
                res.add(new ArrayList<>(list));
            }
            return;

        }

        if (root.left != null) {
            dfs(root.left, targetSum);
            list.remove(list.size() - 1);
        }
        if (root.right != null) {
            dfs(root.right, targetSum);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
//        TreeNode node = new TreeNode(5);
//        TreeNode node1 = new TreeNode(4);
//        TreeNode node2 = new TreeNode(8);
//        TreeNode node3 = new TreeNode(11);
//        TreeNode node4 = new TreeNode(13);
//        TreeNode node5 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(7);
//        TreeNode node7 = new TreeNode(2);
//        TreeNode node8 = new TreeNode(5);
//        TreeNode node9 = new TreeNode(1);
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(-2);
        TreeNode node2 = new TreeNode(-3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(-2);
        TreeNode node6 = new TreeNode(-1);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node3.left = node6;


        T113 t113 = new T113();
        List<List<Integer>> lists = t113.pathSum(node, 22);
        for (List<Integer> i : lists) {
            Integer[] ts = i.toArray(new Integer[0]);
            for (int i1 = 0; i1 < ts.length; i1++) {
                System.out.println(i1);
            }
            System.out.println();
        }


    }
}
