package com.lgy.company.Other;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-30 10:12
 */
public class T2_xinghuan {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        long sum = 0;  // 下标
        int lastNum = 1; // 下一个要添加的值
        while(sum<n){
            sb.append(lastNum++);
            sum += sb.length();
        }
        int pos = sb.length()-1;
        while(sum>n){
            pos--;
            sum--;
        }
        System.out.println(sb.charAt(pos));
    }


}
