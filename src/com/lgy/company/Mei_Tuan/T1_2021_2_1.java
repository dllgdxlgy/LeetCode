package com.lgy.company.Mei_Tuan;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-03 08:54
 */
public class T1_2021_2_1 {

//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            int order_num = sc.nextInt();
//            int re_num = sc.nextInt();
//        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = new String[n][2];
        sc.nextLine();
        for(int i = 0; i < n; i++){

            String[] temp = sc.nextLine().trim().split(" ");
            arr[i][0] = temp[0];
            arr[i][1] = temp[1];
        }
        int res = 0;
        for(int i = 0;i<n-1;i++){
            String s = arr[i][1];
            String s1 = arr[i+1][0];
            if(!s.equals(s1)){
                res++;
            }
        }
        System.out.println(++res);
    }

}
