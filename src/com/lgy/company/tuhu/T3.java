package com.lgy.company.tuhu;

/**
 * @author LGY
 * @create 2022-09-07 20:00
 */
public class T3 {

    int res = 0;

    public int minVehiclePaintingCost(int[][] costs) {

        int n = costs.length;
        int i = 0;
        while (i < n) {
            int index = minValue(costs[i], -1);
            i++;
        }
        return res;
    }

    public int minValue(int[] arr, int in) {
        int index = -1;
        int value = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (in == j) {
                continue;
            }
            if (arr[j] < value) {
                value = arr[j];
                index = j;
            }
        }
        res += arr[index];
        return -1;
    }
}
