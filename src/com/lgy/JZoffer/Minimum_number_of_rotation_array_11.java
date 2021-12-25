package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2021-12-25 09:58
 */
public class Minimum_number_of_rotation_array_11 {

    public int minArray(int[] numbers) {

        int res=numbers[0];
        int i =0;
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[0]<=numbers[j]){

            }else {
                res= numbers[j];
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Minimum_number_of_rotation_array_11 m = new Minimum_number_of_rotation_array_11();
        int[] arr = new int[]{2,2,2,0,1};
         int res = m.minArray(arr);
        System.out.println(res);
    }
}
