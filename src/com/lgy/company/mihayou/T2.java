package com.lgy.company.mihayou;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-14 20:57
 */
public class T2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
//        System.out.println(1);

        if(x == 0|| y == 0){
            System.out.println("infinity");
            return;
        }
        Arrays.sort(arr);
        int low = arr[y-1];
        int hight = arr[y];
        System.out.println(hight-low);


    }

}
