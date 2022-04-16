package com.lgy.company.BIanLiFeng;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-04-14 18:53
 */
import javafx.util.Pair;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class T5 {


        public static int bf(int[] arr, int tar){
            int l = 0, r = arr.length;
            while(l<r){
                int mid = l+((r-l)>>1);
                if(arr[mid]<=tar){
                    l = mid+1;
                }else{
                    r = mid;
                }
            }
            return l;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String line_a = sc.nextLine();
            String[] str_a = line_a.split(" ");
            int[] a = new int[str_a.length];
            for(int j = 0; j<a.length;j++) {
                a[j] = Integer.parseInt(str_a[j]);
            }
            String line_b = sc.nextLine();
            String[] str_b = line_b.split(" ");
            int[] b = new int[str_b.length];
            for(int j = 0; j<b.length;j++) {
                b[j] = Integer.parseInt(str_b[j]);
            }
            String line_c = sc.nextLine();
            String[] str_c = line_c.split(" ");
            int[] c = new int[str_c.length];
            for(int j = 0; j<c.length;j++) {
                c[j] = Integer.parseInt(str_c[j]);
            }
            int x = sc.nextInt();
            int ans = 0;
            int mod = (int) 1e9+9;
            int[] sum = new int[a.length * b.length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b.length; j++){
                    sum[i*b.length+j]=a[i]+b[j];
                }
            }
            Arrays.sort(sum);
            for(int i=0;i<c.length;i++){
                int t = bf(sum, x-c[i]);
                ans = (ans+t)%mod;
            }
            if(ans==0)
                System.out.println("-1");
            else
                System.out.println(ans);


            ConcurrentHashMap map = new ConcurrentHashMap();
        }

    }
/*
1 2
3 4
5 6
5
10
*/

