package com.lgy.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_Of_three_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        //先创造一个盛放list<Integer>类型的listList
        List<List<Integer>> listList = new ArrayList<>();
        //数组进行排序
        Arrays.sort(nums);

        //特殊筛选
//        if (nums.length<3||nums[0]==0){
//            return listList;
//        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]>=0){
                return listList;
            }
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int L=i+1, R=nums.length-1;
            while (L<R){
                int sum =nums[i]+nums[L]+nums[R];
                if (sum==0){
                    List<Integer> list = new ArrayList<>();
//                   Arrays.asList(nums[i],nums[L],nums[R]);
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    listList.add(list);//将三元组加入到 listList
                    while(L < R && nums[L+1] == nums[L]) ++L;
                    while (L < R && nums[R-1] == nums[R]) --R;
                }else if (sum<0){
                    ++L;
                }else{
                    --R;
                }
            }
        }
        return listList;
    }
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for(int i = 0;i < len;++i) {
            if(nums[i] > 0) return lists;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int curr = nums[i];
            int L = i+1, R = len-1;
            while (L < R) {
                int tmp = curr + nums[L] + nums[R];
                if(tmp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while(L < R && nums[L+1] == nums[L]) ++L;
                    while (L < R && nums[R-1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if(tmp < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }
        return lists;

    }
    public static void main(String[] args) {
        Sum_Of_three_15 sot = new Sum_Of_three_15();
        int[] arr =new int[]{-1,0,1,2,-1,4};
//        Arrays.sort(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        List<List<Integer>> listList = new ArrayList<>();
//        System.out.println(listList);
//        int[] arr1 = new int[]{1,2,3,3,4};
//        List<List<Integer>> listList = sot.threeSum(arr);
//        System.out.println(listList);

        List<List<Integer>> listList = sot.threeSum(arr);
        System.out.println(listList);


    }
}
