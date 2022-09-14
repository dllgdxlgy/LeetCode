package com.lgy.company.Guanglianda;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-14 19:16
 */
public class T1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i= 0;i<n;i++){
            arr[i] = sc.next();
        }
        for(int i = 0;i<n;i++){
            state(arr[i]);
        }
    }
    public static void state(String sb){

        int left = 1;
        int right = sb.length()-1;
        int res = 0;
        while(left <= right){
            if(sb.charAt(left)!=sb.charAt(left-1)){
                left++;
                continue;
            }else{
                int temp_l = left-2;
                int temp_r = left+1;
                while(temp_l >= 0 && temp_r <= right && sb.charAt(temp_l) == sb.charAt(temp_r)){
                    temp_l--;
                    temp_r++;
                }
                res = Math.max(res,temp_r-temp_l-1);
                left++;
            }
        }
        res = res/2;
        if(res%2 == 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }

//    public static  void  state(String s){
//        // write code here
//        int res = 1;
//        char[] arr = s.toCharArray();
//        int len = arr.length;
//        int max = 1;
//        String ss = s.substring(0,1);
//        for(int i = 0; i < len;i++){
//            int left = i-1;
//            int right = i+1;
//
//            while(left >= 0 && right < len && arr[left] == arr[right]){
//                res += 2;
//
//                if(res>max){
//                    ss = s.substring(left,right+1);
//                    max = Math.max(max,res);
//                }
//
//                left--;
//                right++;
//            }
//            res = 1;
//        }
//
//        res = 0;
//        for(int i = 0 ; i < len; i++){
//            int left = i;
//            int right = i+1;
//            while(left >= 0 && right < len && arr[left] == arr[right]){
//                res+=2;
//
//                if(res > max){
//                    ss = s.substring(left,right+1);
//                    max = Math.max(max,res);
//                }
//                left--;
//                right++;
//            }
//            res=0;
//        }
//        int l = ss.length();
//        l = l/2;
//        if(l%2 == 0){
//            System.out.println("NO");
//        }else{
//            System.out.println("Yes");
//        }
//    }
}
