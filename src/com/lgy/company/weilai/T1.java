package com.lgy.company.weilai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author LGY
 * @create 2022-07-31 07:32
 */
public class T1 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int res = 0;
        for(int i = 1;i <= n;i++){
            if(i % 7 == 0|| isture(i)){
                res++;
            }
        }
        System.out.println(res);
    }
    public static boolean isture(int n){
        int num = n;
        int t = 0;
        while(num!=0){
            t = num % 10;
            num = num / 10;

            if(num == 7 || t ==7){
                return true;
            }
        }

        return false;
    }

}
