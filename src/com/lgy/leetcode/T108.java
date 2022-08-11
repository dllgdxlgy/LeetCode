package com.lgy.leetcode;

public class T108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);

    }
    TreeNode build(int[] arr, int start, int end){
        if (start>end){
            return null;
        }
        int mid = (start + end)/2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = build(arr,start,mid-1);
        node.right = build(arr,mid+1,end);
        return node;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        T108 t108 = new T108();
        TreeNode node = t108.sortedArrayToBST(arr);
    }


    /**
     * 第二遍
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST_1(int[] nums) {

        return ArraytoBST(nums,0,nums.length-1);

    }

    public TreeNode ArraytoBST(int[] arr, int i, int j){
        int left = i;
        int right = j;
        if(left > right){
            return null;
        }
        int temp = (left + right)/2;
        TreeNode root = new TreeNode(arr[temp]);
        root.left = ArraytoBST(arr,left,temp-1);
        root.right = ArraytoBST(arr,temp+1,right);

        return root;
    }
}
