package com.lgy.company.safe360;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-09 16:07
 */
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int q = scanner.nextInt();
        int[][] arr = new int[q][2];

        for (int i = 0; i < q; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        scanner.close();
        ArrayList<long[]> arrayList = new ArrayList<>();
        arrayList.add(new long[]{1,n});
        int index = 0;
        while (index < q){
            n = num_black(n,arr,q);
            System.out.println(n);
            index++;
        }
//        while (q > 0){
//            n = num_black(n,arrayList,arr);
//            System.out.println(n);
//            q--;
//        }
    }

    public static long num_black(long black_num,int[][] arr,int index){
        if(index == 0){
            return black_num-(arr[0][1]-arr[0][0])+1;
        }
        if(arr[index][0] > arr[index-1][1]){
            return black_num-(arr[index][1]-arr[index][0])+1;
        }else {
            return black_num + arr[index-1][1]-arr[index][0] + arr[index][1]-arr[index-1][1];
        }

    }
}
