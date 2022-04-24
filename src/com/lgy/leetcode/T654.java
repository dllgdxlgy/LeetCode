package com.lgy.leetcode;

import java.util.Collections;

public class T654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return maxnum(nums, 0, nums.length-1);
    }

    TreeNode maxnum(int[] arr,int left,int right) {
        if (left > right) {
            return null;
        }

        int index = -1;
        int number = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            if (arr[i] > number) {
                number = arr[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(number);
        node.left = maxnum(arr, left, index-1);
        node.right = maxnum(arr, index+1, right);
        return node;
    }
}
