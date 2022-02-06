package com.lgy.leetcode;

import java.util.Arrays;

/**
 * 无重复数字 435
 *
 * @author LGY
 * @create 2022-02-06 22:54
 */
public class Non_overlapping_interval_435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        int res = 1, end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                res++;
                end = intervals[i][1];
            }
        }
        return intervals.length - res;

    }
}
