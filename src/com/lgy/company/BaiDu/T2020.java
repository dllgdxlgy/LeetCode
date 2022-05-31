package com.lgy.company.BaiDu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-05-31 21:44
 */
public class T2020 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Long[] arr = new Long[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextLong();
        }
        Arrays.sort(arr);//从小到大
        Long res = 0L;
        while(arr[n-1] >= n){
            long count = arr[n-1]/n;
            res+=count;
            for(int j = 0; j < n-1; j++){
                arr[j] += count;
            }
            arr[n-1] = arr[n-1]%n;
            Arrays.sort(arr);
            count=0;
        }
        System.out.println(res);
    }
}
