package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LGY
 * @create 2022-08-31 13:51
 */
public class T239 {
    class MyQueue {

        private List<Integer> list = new ArrayList<>();

        public void push(int n){
            while(!list.isEmpty() && list.get(list.size()-1) < n){
                list.remove(list.size()-1);
            }
            list.add(n);
        }

        public int max(){
            return list.get(0);
        }

        public void pop( int n){
            if(list.get(0) == n){
                list.remove(0);
            }
        }
    }

    /**
     * 滑动窗口最大值
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {

        MyQueue queue = new MyQueue();
        List<Integer> list = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (i < k - 1){
                queue.push(nums[i]);
            }else {
                queue.push(nums[i]);
                list.add(queue.max());
                queue.pop(nums[i-k+1]);
            }
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;

    }

    public static void main(String[] args) {
        T239 t239 = new T239();
        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        int[] ints = t239.maxSlidingWindow(arr, 3);


    }
}
