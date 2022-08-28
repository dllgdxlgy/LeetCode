package com.lgy.company.Zi_Jie;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-28 10:05
 */
public class T1_2022_0828 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().trim().split(" ");
        int len = arr.length;
        int[] arr_num = new int[len];

        int max_val = Integer.MIN_VALUE;
        int min_val = Integer.MAX_VALUE;
        for(int i = 0 ;i < len; i++){
            arr_num[i] = Integer.parseInt(arr[i]);
            max_val = Math.max(max_val,arr_num[i]);
            min_val = Math.min(min_val,arr_num[i]);
        }
        int num = scanner.nextInt();
        scanner.close();;

        Boolean isFlag = true;

        for(int i = 0 ;i < (len-1)/2;i++){
            if(arr_num[i] == -1){
                if(arr_num[i*2+1] >= 0 || arr_num[i*2+2] >= 0)
                isFlag = false;
            }
        }
        if(max_val>5 || min_val <-1){
            isFlag = false;
        }
        if(num<0 || num>100){
            isFlag = false;
        }
        if(!isFlag){
            System.out.println(false);
            System.out.println(0);
            return;
        }
        int temp = 0;
        int index_num  = 0;
        for(int i = 0;i<len;i++){
            if(arr_num[i] == -1){
                continue;
            }
            temp+=arr_num[i];
            index_num++;
        }

        if(num > index_num*5-temp){
            System.out.println(true);
            System.out.print(num-(index_num*5-temp));
        }else {
            System.out.println(true);
            System.out.print(0);
        }

    }
}
