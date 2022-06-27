package com.lgy.company.BaiDu;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-06-01 09:41
 */
public class T2020_20_t1 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int res = Integer.MIN_VALUE;
//        for(int i =1;i<=n;i++){
//            for(int j =i;j<=n;j++){
//                res = Math.max((lcm(i,j)-gcd(i,j)),res);
//            }
//        }
//        System.out.println(res);
//    }

    // 最小公倍数
    public static int lcm(int a, int b){
        int p = a*b;
        int x = gcd(a,b);
        int res =  p/x;
        return res;
    }

    // 最小公因数
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        int t = a%b;
        return gcd(b,t);
    }

    public static void main(String[] args) {
        int gcd = T2020_20_t1.gcd(30, 80);
        System.out.println(gcd);
    }



}
