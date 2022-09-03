package com.lgy.company.kedaxunfei;

import java.util.*;

/**
 * @author LGY
 * @create 2022-09-03 20:32
 */
public class T1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        list.add(arr[0]);

        for (int i = 1; i < n; i++) {
            int[] temp = list.get(list.size()-1);
            int[] a = arr[i];

            if(temp[1] > a[0]){
                temp[1] = Math.max(temp[1],a[1]);
            }else {
                list.add(arr[i]);
            }

        }
        for (int i = 1; i < list.size(); i++) {
            int[] temp  = list.get(i);
            int[] temp1  = list.get(i-1);

            if(temp[0]-1 > temp1[1]){
                System.out.println("fail");
            }

        }



    }
}
