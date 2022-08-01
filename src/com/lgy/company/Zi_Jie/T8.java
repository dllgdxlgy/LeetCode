package com.lgy.company.Zi_Jie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-31 12:08
 */
public class T8 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max_dis = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        if(num < 3){
            System.out.println(0);
            return;
        }

        dfs(arr,0,3,max_dis);
        System.out.println(res.size());

    }
    public static void dfs(int[] arr,int index,int x,int max_dis){

        if(list.size() == x){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if(list.size()>=1 && arr[i] -list.get(0)>= max_dis){
                return;
            }
            list.add(arr[i]);

            dfs(arr,i+1,x,max_dis);

            list.remove(list.size()-1);

        }




    }
}
