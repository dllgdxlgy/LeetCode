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
        List<int[]> lists = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum+=j;
                arr.add(j);
                if (sum < target){
                    continue;
                }else if(sum == target){
                    Integer[] integers = arr.toArray(new Integer[arr.size()]);

                    arr.clear();
                }else {
                    arr.clear();
                }
            }
        }

        Integer[] integers = lists.toArray(new Integer[lists.size()]);
        return null;
    }

    public static void main(String[] args) {
        T57_II t57Ii = new T57_II();
        List<List<Integer>> continuousSequence = t57Ii.findContinuousSequence(9);
        for (List<Integer> l: continuousSequence) {
            System.out.println(l.toString());
        }
    }
}
