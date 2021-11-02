package com.lgy.leetcode;

import java.util.Arrays;

/**
 * 题目：给定一个包括n 个整数的数组nums和 一个目标值target。找出nums中的三个整数，
 * 使得它们的和与target最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 */
public class The_nearest_sum_of_three_16 {

    public int threeSumClosest(int[] nums, int target) {

        //给出一个数
        int best =100000;
        //对数组进行排序，使数组是有序的，这个数组是在原地进行排序
        Arrays.sort(nums);
        //思路:先固定一个数num[i],然后其他两个数的范围就确定了，这个时候就确定了
        //数组的下标，然后进行遍历
        for (int i =0;i<nums.length-2;i++){//i 的值没有必要全部遍历
            //去掉重复的num[i]
            //如果固定的数num[i]在循环过程中判断是不是和上面的数是不是相同，
            // 如果相同，那就可以跳过了。加速循环。
            if (i>0 && nums[i]==nums[i-1]){continue;}
            //w即为要进行另外两个数的target。这里相当于看谁更接近于w
            int w= target-nums[i];
            //两个指针
            int L =i+1, R=nums.length-1;
            //以指针作为判断条件
            while (L<R){//比的是数组的下标
                int sum = nums[L]+nums[R];
                if (sum==w){//进行对比，如果是相等，那就可以直接跳过。返回target
                    return target;
                }
                //这里是重点，如果比较的是差值的绝对值
                if (Math.abs(sum-w)<Math.abs(best-target)){
                    best=sum+nums[i];
                }
                if (sum<w){
                    int L0=L+1;
                    while (L0<R && nums[L0]==nums[L]){
                        ++L0;
                    }
                    L=L0;
                }else {
                    int R0=R-1;
                    while (R0>L && nums[R0]==nums[R]){
                        --R0;
                    }
                    R=R0;
                }
            }
        }
        return best;
    }
}
