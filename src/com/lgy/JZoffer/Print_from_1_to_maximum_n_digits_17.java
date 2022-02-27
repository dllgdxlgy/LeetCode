package com.lgy.JZoffer;

/**
 * 打印从1到最大的n位数
 * @author LGY
 * @create 2022-01-03 15:27
 */
public class Print_from_1_to_maximum_n_digits_17 {

    public int[] printNumbers(int n) {


        int num = (int)Math.pow(10,n);

        int[] res = new int[num-1]; //res = 999
        for (int i = 0; i < num-1 ; i++) {
            res[i] = i+1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = new int[9];
        for (int i = 0; i < res.length; i++) {
            res[i] = i+1;
            System.out.println(res[i]);

        }
        System.out.println(10^3);
    }
}
