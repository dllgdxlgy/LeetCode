package com.lgy.company.Mei_Tuan;

import java.util.Arrays;
import java.util.Scanner;

//https://www.nowcoder.com/test/question/10661f4d02564ba686bcba4645e0a029?pid=28665338&tid=53389097
public class T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int light = scanner.nextInt();
        int heavy = scanner.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        if (light>heavy){
            int temp = light;
            light = heavy;
            heavy = temp;
        }
        Arrays.sort(arr);
        T5 t5 = new T5();
        Boolean b= t5.id_Divide_the_cake(n,m,light,heavy,arr);
        System.out.println(b);


    }
    public boolean id_Divide_the_cake(int n ,int m, int
            light, int heavy, int[] arr){

        if (light <= arr[0] && heavy >= arr[m-1]&& n-m >=2){
            return true;
        }
        if (arr[0]<light){
            return false;
        }
        for (int j = 0; j < m; j++) {
            if (arr[j]>heavy) {
                return false;
            }
        }
        if (light < arr[0] && heavy > arr[m-1]&& n-m < 2){
            return false;
        }
        if (light>=arr[0] && arr[m-1]>=heavy){

        return false;
    }
        return false;
    }
}
