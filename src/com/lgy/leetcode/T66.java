package com.lgy.leetcode;

import com.lgy.company.leetcodecom.T;

/**
 * @author LGY
 * @create 2022-05-05 17:28
 */
public class T66 {

    public int[] plusOne(int[] digits) {

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < digits.length; i++) {
            stringBuffer.append(Integer.valueOf(digits[i]));
        }
        Long i = Long.parseLong(stringBuffer.toString());
        long res = i+1;
        String s  = Long.toString(res);
        int[] arr = new int[s.length()];



        for (int j = 0; j < s.length(); j++) {
            arr[j] =Integer.parseInt(String.valueOf(s.charAt(j)));
        }

        return arr;
    }

    public int[] plusOne_1(int[] digits) {

        int length = digits.length-1;
        int num = 0;

        for (int i = length; i >=0; i--) {
            if (digits[i] == 9){
                num++;
            }else {
                digits[i]++;
                for (int j = i+1; j <= length ; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        if (num == length+1){
            int[] arr = new int[length+2];
            arr[0] = 1;
            return arr;
        }


        return null;
    }

    public static void main(String[] args) {
//        int[] num = new int[]{9,8,7,6,5,4,3,2,1,0};
//        T66 t66 = new T66();
//        int[] ints = t66.plusOne(num);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
        int[] num = new int[]{9};
        T66 t66 = new T66();
        int[] ints = t66.plusOne_1(num);
    }
}
