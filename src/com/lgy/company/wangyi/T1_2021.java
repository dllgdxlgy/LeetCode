package com.lgy.company.wangyi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author LGY
 * @create 2022-04-16 10:10
 */
public class T1_2021 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        HashMap<String,Double> map = new HashMap<>();
//
//        String[] strings = new String[n];
//        for (int i = 0; i < n; i++) {
//            strings[i] = scanner.next().trim();
//            char[] arr = strings[i].toCharArray();
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j]<91){
//                    arr[j] +=32;
//                }
//            }
//            String s = String.valueOf(arr);
//            map.put(s,map.getOrDefault(s,0.00)+1);
//        }
//        int count = 0;
//        double res = 0.00;
//        for (String s:map.keySet()) {
//            res = (double)map.get(s)/n;
//            if (res >= 0.01) {
//                count++;
//            }
//        }
//        System.out.println(count);

StringBuffer stringBuffer = new StringBuffer("abcdef");
StringBuffer stringBuffer1 = new StringBuffer(stringBuffer.substring(0,3)).reverse();
        System.out.println(stringBuffer1);
    }


}
