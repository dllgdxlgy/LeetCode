package com.lgy.JZoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-25 16:08
 */
public class T57_II {

    public List<List<Integer>> findContinuousSequence(int target) {
        int n = (target+1)/2;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum+=j;
                arr.add(j);
                if (sum < target){
                    continue;
                }else if(sum == target){
                    Integer[] integers = arr.toArray(new Integer[arr.size()]);
                    lists.add(new ArrayList<>(arr));
                    arr.clear();
                }else {
                    arr.clear();
                }
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        T57_II t57Ii = new T57_II();
        List<List<Integer>> continuousSequence = t57Ii.findContinuousSequence(9);
        for (List<Integer> l: continuousSequence) {
            System.out.println(l.toString());
        }
    }


    /**
     * leetcode 的题目，返回值不一样。
     * @param target
     * @return
     */
    public int[][] findContinuousSequence_2(int target) {

        List<int[]> res = new ArrayList<>();
        int i = 1,j=2,sum = 3;

        while(i < j){
            if(sum == target){
                int[] arr = new int[j-i+1];
                for(int k = i;k <= j;k++){
                    arr[k-i] = k;
                }
                res.add(arr);
            }
            if(sum >= target){
                sum-=i;
                i++;
            }else{
                j++;
                sum+=j;
            }
        }
        return res.toArray(new int[0][]);

    }
}
