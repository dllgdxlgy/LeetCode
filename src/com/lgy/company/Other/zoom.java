package com.lgy.company.Other;

import java.util.Scanner;

public class zoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0;i<t;i++){
            arr[i] = sc.nextInt();
        }
//        int t=3;
//        int[]arr = new int[]{28,33,47};
        for (int i = 0;i<t;i++){
            int res = 0;
            int n = arr[i];
            for (int j = 1;j<=n;j++){
                int temp = Count(j);
                res += temp;
            }
            //int res = Count(arr[i]);
            System.out.println(res);
        }
    }
    public static int Count(int num){
        int count = 0;
        for (int i = 1;i<num;i++){
            if (!isPrime(i)){
                i++;
            }else {
                for (int j = 1;j<num;j++){
                    if (!isPrime(j)){
                        j++;
                    }else {
                        for (int k = 1;k<num;k++){
                            if (!isPrime(k)){
                                k++;
                            }else {
                                int sum = i*i+j*j*j+k*k*k*k;
                                if ((sum==num)&&isPrime(i)&&isPrime(j)&&isPrime(k)){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int num){
        boolean prime=true;
        if (num<=1){
            return false;
        }else {
            int k=(int)Math.sqrt(num);
            for (int i = 2;i<=k;i++){
                if (num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
