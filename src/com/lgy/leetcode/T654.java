package com.lgy.leetcode;

import java.util.Collections;

public class T654 {


    /**
     * 第二遍
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree_1(int[] nums) {

        return dfs(nums,0,nums.length-1);

    }
    public TreeNode dfs(int[] arr , int l ,int r){
        if(l>r){
            return null;
        }
        int val = Integer.MIN_VALUE;
        int index = l;
        for(int i = l;i<=r;i++){
            if(arr[i] > val){
                val = arr[i];
                index = i;
            }
        }

        TreeNode node = new TreeNode(val);
        node.left = dfs(arr,l,index-1);
        node.right = dfs(arr,index+1,r);
        return node;
    }




    /**
     * 第一遍
     * @param nums
     * @return
     */
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
