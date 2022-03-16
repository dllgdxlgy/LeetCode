package com.lgy.Hot_100;

/**
 *  把数组排成最小的数
 */
public class T45 {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - 1; j++) {
                if ((strings[j]+strings[j+1]).compareTo(strings[j+1]+strings[j])>0){
                    String temp = strings[j+1];
                    strings[j+1] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length ; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();
    }

}
