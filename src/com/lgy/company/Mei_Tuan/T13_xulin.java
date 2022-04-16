package com.lgy.company.Mei_Tuan;

import java.util.Scanner;

public class T13_xulin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<2){
            System.out.println("-1");
            return;
        }
        long sum = n*(n-1)*(n-1)+n*(n-1)*(n-2)*(n-2);
        System.out.println(sum%1000000007);
    }
}
