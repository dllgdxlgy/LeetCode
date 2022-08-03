package com.lgy.company.Mei_Tuan;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-02 21:41
 */
public class T1_2021_1_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().trim().split(" ");
        int n = arr.length;
        if(n == 0){
            System.out.println(0.0);
            return;
        }
        double sum = 0;
        for(int i =0;i<n;i++){
            sum+=Integer.parseInt(arr[i]);
        }
        String s = String.valueOf(sum / n);
        System.out.println(s.substring(0, 3));

    }


}
