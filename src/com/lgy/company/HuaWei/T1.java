package com.lgy.company.HuaWei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class T1 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        int M = Integer.parseInt(s[0]);
        String[] s1 = br.readLine().trim().split(" ");
        int N = Integer.parseInt(s1[0]);
        String[] strings = br.readLine().trim().split(" ");
        int A_num = 0;
        int B_num = 0;
        int xin_num = 0;
        for (int i = 0; i < N; i++) {
            if (strings[i].equals("A")){
                A_num++;
            }else {
                B_num++;
            }
        }
        if (strings[N-1] .equals("B")){
            //统计数量
            if((A_num % 4 ) != 0){
                xin_num= A_num / 4 + 1;
            }else {
                xin_num= A_num / 4;
            }
            xin_num += B_num-1;
            if (xin_num <= M-1){
                System.out.println(xin_num+1);
                System.out.println(1);
            }else {
                System.out.println(0);
                System.out.println(0);
            }
        }else {
            int index = (A_num -1)/4;
            int A = index * 4;
            int B_count = 0;
            int A_count = 0;
            for (int i = 0; i < N; i++) {
                if (A_count < A){
                    if (strings[i].equals("A")){
                        A_count++;
                    }else {
                        B_count++;
                    }
                }
            }
            int xin_num1 = B_count + index;
            System.out.println(xin_num1);
            System.out.println(A_num % A);
        }
    }
}
