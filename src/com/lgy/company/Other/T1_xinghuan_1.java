package com.lgy.company.Other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-07-30 13:41
 */
public class T1_xinghuan_1 {

    public static int totalSteps(int[] nums) {
        // write code here
        int res = 0;

        List<Integer> list_arr  = new LinkedList<>();

        for(int i = 0; i < nums.length;i++){
            list_arr.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            for (int i = 1; i < list_arr.size(); i++) {
                if (list_arr.get(i - 1) > list_arr.get(i)) {
                    list.add(i);
                }
            }
            if (list.size() == 0) {
                break;
            }
            int t = 0;
            for(int i = 0; i < list.size();i++){
                int temp = list.get(i);
                list_arr.remove(temp-t);
                t++;
            }
            list.clear();
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,3,4,4,7,3,6,11,8,5,11};
        int i = T1_xinghuan_1.totalSteps_2(arr);
        System.out.println(i);
    }

    public static int totalSteps_1(int[] nums) {
        // write code here
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            for (int i = 1; i < nums.length; i++) {
                while(nums[i - 1] > nums[i] && nums[i - 1] != -1) {
                    list.add(i);
                }
            }
            if (list.size() == 0) {
                break;
            }

            for(int i = 0; i < list.size();i++){
                nums[list.get(i)] = -1;
            }
            list.clear();
            res++;
        }
        return res;
    }

    public static int steps(int[] nums) {
        int res = 0;
        int len = nums.length;
//LinkedList linklist=new LinkedList(ArraysasList(nums));

        for (int i = 1; i < len; i++) {
            if (nums[i - 1] > nums[i]) {
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                res++;
            }
        }
        return res;
    }

    public static int totalSteps_2(int[] nums) {
        // write code here
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] ==-1){
                    continue;
                }
                int temp = i-1;
                while(temp >=0 && nums[temp] ==-1){
                    temp--;
                }
                if(nums[temp]>nums[i]){
                    list.add(i);
                }
            }
            if (list.size() == 0) {
                break;
            }

            for(int i = 0; i < list.size();i++){
                nums[list.get(i)] = -1;
            }
            list.clear();
            res++;
        }
        return res;
    }
}
