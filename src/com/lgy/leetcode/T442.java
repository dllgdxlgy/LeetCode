package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组中重复的数据
 * @author LGY
 * @create 2022-06-18 10:45
 */
public class T442 {

    /**
     * 理解错题意了，求了不重复的数字
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {


        List<Integer> List = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);

        int left = 0;
        int right = 0;

        while (right < len){
            if(nums[left] == nums[right] && left != right) {
                right++;
                left = right;
            }else if (nums[left] == nums[right] && left == right){
                right++;
            }else {
                List.add(nums[left]);
                left = right;
            }
        }
        if (nums[len-1] != nums[len-2]){
            List.add(nums[len-1]);
        }

        return List;

    }


    public List<Integer> findDuplicates_1(int[] nums) {
        List<Integer> List = new ArrayList<>();
        int len = nums.length;
        if (len < 2){
            return List;
        }
        Arrays.sort(nums);

        int right = 1;
        while (right < len){
            if (nums[right] == nums[right-1]){
                List.add(nums[right]);

            }
            right++;
        }
        return List;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        T442 t442 = new T442();
        t442.findDuplicates(arr);
    }


    /**
     * 推荐的方法
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates_2(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();
        int n = nums.length;
        //对每一个元素进行遍历
        for (int i = 0; i < n; i++) {
            // 获取元素的值
            int num = nums[i];
            //获取值 -1 后的索引
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                //如果大于0，那就值为相反数，也就是第一次
                nums[index] = -nums[index];
            } else {
                //如果是小于 0,那就是第二次，可以加入到List中了。
                duplicates.add(index + 1);
            }
        }
        return duplicates;
    }
}
