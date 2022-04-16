package com.lgy.leetcode;

public class Removing_Elements_27 {
    public int removeElement(int[] nums, int val) {
        int length =  nums.length;
        int sum = 0;
        for (int i = 0; i < length-sum; i++) {
            if (val == nums[i]){
                swapnums(nums,i);
                sum++;
                i =-1;
            }
        }
        for (int j = length-1; j > length-1-sum; j--) {
            nums[j] = 0;
        }
        return length-sum;
    }

    public void swapnums(int[] arr, int index){
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};
        Removing_Elements_27 r = new Removing_Elements_27();
        r.removeElement(arr,3);
        System.out.println(arr.length);
    }
}
