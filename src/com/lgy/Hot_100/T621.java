package com.lgy.Hot_100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T621 {
    public int leastInterval(char[] tasks, int n) {

        int length = tasks.length;
        if (n == 0){
            return length;
        }
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < length ; i++) {
//            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
//        }
        int[] arr = new int[26];
        for (int i = 0; i < length; i++) {
            arr[tasks[i]-'A']++;
        }
        Arrays.sort(arr);
        int max = arr[25];
        int res = (max-1) * (n+1)+1;
        int i = 24;
        while (i>=0 && arr[i] == max){
            res++;
            i--;
        }
        return Math.max(res,length);

    }
}
