package com.lgy.company.Mei_Tuan;

import java.util.HashMap;
import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String s1=  scanner.next();
        String s2=  scanner.next();
        if (n < m){
            System.out.println("NO");
        }
        long sum = 0;
        int index_1 = 0;
        int index_2 = 0;
        while (index_1 < n){
            if (s1.charAt(index_1) == s2.charAt(index_2)){
                sum += index_1;
                sum++;
                if (index_2 == m-1){

                    System.out.println("Yes");
                    System.out.println(sum);
                }
                index_2++;
            }
            index_1++;
        }
        if(index_2 < m){
            System.out.println("No");
        }


    }
}
