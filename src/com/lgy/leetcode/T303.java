package com.lgy.leetcode;

public class T303 {
    private int[] nums;
    public T303(int[] nums) {

        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        while (left<right){
            sum+=nums[left];
            sum+=nums[right];
            left++;
            right--;
        }
        while(left == right){
            sum +=nums[left];
            left++;
        }
        return sum;
    }

    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
}
