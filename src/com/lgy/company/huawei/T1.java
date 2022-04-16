package com.lgy.company.HuaWei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-13 19:43
 */
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().trim().split("");
        int M =Integer.parseInt(s[0]);

        String[] strings = new String[M];
        int[][] arr = new int[M][5];
        for (int i = 0; i < M; i++) {
            strings[i] = scanner.nextLine().trim();
        }


        for (int i = 0; i < M; i++) {
            String[] split = strings[i].split(",");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(split[j]);
            }
        }


//        String[] strings = new String[M];
//        int[][] arr = new int[M][];
//        for (int i = 0; i < M; i++) {
//            strings[i] = scanner.nextLine().trim();
//            String[] split = strings[i].split(",");
//            for (int j = 0; j < split.length; j++) {
//                arr[i][j] = Integer.parseInt(split[j]);
//            }
//        }

        int max_N = scanner.nextInt();
        int strategy = scanner.nextInt();
        int cpu_Count = scanner.nextInt();
        int memSize = scanner.nextInt();
        int cpuArch = scanner.nextInt();
        int supportNp = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < M ; i++) {
            if (arr[i][1] >= cpu_Count && arr[i][2] >= memSize && arr[i][3] == cpuArch && arr[i][4] == supportNp) {
                list.add(arr[i][0]);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        if (strategy == 1){

            for (int i = 0; i < list.size(); i++) {
                if (arr[i][1] == cpu_Count && arr[i][2] == memSize){
                    list1.add(arr[i][0]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (arr[i][1] == cpu_Count && arr[i][2] > memSize){
                    list1.add(arr[i][0]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (arr[i][1]>cpu_Count && arr[i][2] == memSize){
                    list1.add(arr[i][0]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (arr[i][1] > cpu_Count && arr[i][2] > memSize){
                    list1.add(arr[i][0]);
                }
            }

            if (list1.size()>=max_N){
                System.out.print(max_N+" ");
                for (int i = 0; i < max_N; i++) {
                    System.out.println(list1.get(i)+" ");
                }
            }else {
                System.out.print(list1.size()+" ");
                for (int i = 0; i < list1.size(); i++) {
                    System.out.println(list1.get(i)+" ");
                }
            }
        }else {
            for (int i = 0; i < list.size(); i++) {
                if ( arr[i][2] == memSize && arr[i][1] == cpu_Count ){
                    list1.add(arr[i][0]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (arr[i][2] == memSize && arr[i][1]>cpu_Count ){
                    list1.add(arr[i][0]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (arr[i][2] > memSize && arr[i][1]==cpu_Count ){
                    list1.add(arr[i][0]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (arr[i][2] > memSize && arr[i][1]>cpu_Count ){
                    list1.add(arr[i][0]);
                }
            }

            if (list1.size()>=max_N){
                System.out.print(max_N+" ");
                for (int i = 0; i < max_N; i++) {
                    System.out.print(list1.get(i)+" ");
                }
            }else {
                System.out.print(list1.size()+" ");
                for (int i = 0; i < list1.size(); i++) {
                    System.out.print(list1.get(i)+" ");
                }
            }
        }

    }
}
