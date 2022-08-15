package com.lgy.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author LGY
 * @create 2022-05-05 15:38
 */
public class T56 {

    public int[][] merge(int[][] intervals) {

        // 创建 一个 链表
        LinkedList<int[]> res = new LinkedList<>();

        // 对数组中的第一个元素进行排序，从小到大
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        // 将一个元素存放到数组中
        res.add(intervals[0]);

        // 对其他进行遍历
        for (int i = 1; i < intervals.length; i++) {

            // 获取到待比较到一个元素
            int[] temp = intervals[i];
            // 获取到list 最后一个元素,这里是引用
            int[] last = res.getLast(); // 已经加入对
            // 进行判断，不符合条件就加入到 res 中。
            if (last[1] >= temp[0]){
                last[1] = Math.max(last[1],temp[1]);
            }else {
                res.add(temp);
            }
        }

        return res.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[][] arr = new  int[][]{{2,3},{1,6},{4,7},{0,3}};
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        System.out.println(1);
//        int[][] arr = new  int[][]{{2,3},{1,6},{4,7},{0,3},{8,9},{12,24}};
//        T56 t56 = new T56();
//        int[][] merge = t56.merge(arr);
//        System.out.println(111);
    }


}
