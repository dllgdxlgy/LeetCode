package com.lgy.company.Zi_Jie;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-31 10:39
 */
public class T7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(correct_String(arr[i]));
        }
    }
    public static String correct_String(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1;i < sb.length()-2; i++){
            int left = i-1;
            if(sb.charAt(left)!=sb.charAt(i)){
                continue;
            }
            while(i+2 < sb.length() && sb.charAt(i+1) == sb.charAt(i+2)){
                sb.deleteCharAt(i+1);
            }
        }
        for(int i = 1; i < sb.length()-1;i++){
            if(sb.charAt(i) == sb.charAt(i-1) && sb.charAt(i) == sb.charAt(i+1)){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
