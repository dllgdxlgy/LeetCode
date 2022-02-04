package com.lgy.leetcode;

/**
 * 分发糖果
 *
 * @author LGY
 * @create 2022-02-04 23:09
 */
public class Distribute_candy_135 {

    /**
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {

        if (ratings.length == 1) {
            return 1;
        }
        //创建一个数组
        int[] arr = new int[ratings.length];

        //赋值为1
        for (int i = 0; i < ratings.length; i++) {
            arr[i] = 1;
        }

        int i =0;
        while ( i < ratings.length - 1) {
            if (ratings[i] > ratings[i + 1])
                arr[i] = arr[i+1]+1;
            ++i;
        }
        int j = ratings.length - 1;
        while (j >= 1) {
            if (ratings[j] > ratings[j - 1])
                arr[j] = arr[j-1]+1;
            --j;
        }

        int res = 0;
        for (int w = 0; w <arr.length; w++){
            res +=arr[w];
        }

        return res;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 2, 1};
        Distribute_candy_135 distribute_candy_135 = new Distribute_candy_135();
        int res = distribute_candy_135.candy(arr);
        System.out.println(res);
    }
}
