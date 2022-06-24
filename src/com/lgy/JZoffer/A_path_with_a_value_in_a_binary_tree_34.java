package com.lgy.JZoffer;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树中和为某一值的路径
 *
 * @author LGY
 * @create 2022-01-09 14:30
 */
public class A_path_with_a_value_in_a_binary_tree_34 {

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {

        recur(root, target);
        return res;
    }

    private void recur(TreeNode root, int target) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        recur(root.left, target);
        recur(root.right, target);
        path.removeLast();
    }


    /**
     * 内部类
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
