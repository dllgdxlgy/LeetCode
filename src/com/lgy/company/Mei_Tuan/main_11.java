package com.lgy.company.Mei_Tuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-03-26 17:26
 */
public class main_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        List list = new ArrayList();
        int sum = 0;
        for (int i = n-1; i <=0 ; i--) {
            sum +=arr[i];
            if ((sum % 7)==0){
                list.add(sum);
            }
        }

    }

    public static void main_1(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int[] cnt = new int[30];
        for (int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
        }
        int ans= cnt[0]-1;
        ans = Math.min(ans, cnt[1]);
        ans = Math.min(ans, cnt[2]/3);
        System.out.println(ans);

    }
    public static void main_2(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int l=a[0],r=a[n-1];
        Arrays.sort(a);
        int ans=Math.abs(r-l);
        for(int i=0;i<n;i++){
            int x = Math.abs(l-a[i]);
            int y = Math.abs(r-a[i]);
            ans = Math.min(ans,Math.abs(x-y));
        }
        System.out.println(ans);
    }
    public static void main_3(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, (i,j)->(j-i));
        int dp[]=new int[7];
        for(int i=0;i<n;i++){
            int a0=dp[0]+arr[i];
            int a1=dp[1]+arr[i];
            int a2=dp[2]+arr[i];
            int a3=dp[3]+arr[i];
            int a4=dp[4]+arr[i];
            int a5=dp[5]+arr[i];
            int a6=dp[6]+arr[i];
            dp[a0%7] = Math.max(dp[a0%7],a0);
            dp[a1%7] = Math.max(dp[a1%7],a1);
            dp[a2%7] = Math.max(dp[a2%7],a2);
            dp[a3%7] = Math.max(dp[a3%7],a3);
            dp[a4%7] = Math.max(dp[a4%7],a4);
            dp[a5%7] = Math.max(dp[a5%7],a5);
            dp[a6%7] = Math.max(dp[a6%7],a6);
        }
        System.out.println(dp[0]);


    }
}
