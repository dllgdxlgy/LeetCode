package com.lgy.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_Of_three_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<Integer> list = new ArrayList<>();

        List<List<Integer>> listList = new ArrayList<>();

        for (int i=0;i<=nums.length-2;i++){
            for (int j = i+1; j <nums.length-1;j++){
                for (int w =j+1;w<nums.length;w++){
                    if (isLing(nums[i],nums[j],nums[w])){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[w]);
                        listList.add(list);
                        list.clear();
                    }
                }
            }
        }

        return listList;
    }

    public boolean isLing(int a,int b,int c){
        if (0==a+b+c){
            return true;
        }
       return false;
    }

   
    public static void main(String[] args) {
        Sum_Of_three_15 sot = new Sum_Of_three_15();
        int[] arr =new int[]{-1,0,1,2,-1,4};
//        List<List<Integer>> listList = sot.threeSum(arr);
//        System.out.println(listList);

    }
}
