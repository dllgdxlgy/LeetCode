package com.lgy.Hot_100;

public class T739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {

            int temp = temperatures[i];
            for (int j = i; j < length; j++) {
                if (temperatures[j] > temp){
                    arr[i] = j-i;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
