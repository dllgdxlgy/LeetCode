package com.lgy.company.wangyi;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/question/next?pid=27977161&qid=1262901&tid=57022261
 * @author LGY
 * @create 2022-06-03 21:18
 */
public class T1_wangyi_2021_T1 {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String[] s_a = sc.nextLine().trim().split(" ");
//        String[] s_b = sc.nextLine().trim().split(" ");
//        int[] arr_A = new int[s_a.length];
//        int[] arr_B = new int[s_b.length];
//        for(int i = 0;i<s_a.length;i++){
//            arr_A[i] = Integer.parseInt(s_a[i]);
//        }
//        for(int j = 0;j<s_b.length;j++){
//            arr_B[j] = Integer.parseInt(s_b[j]);
//        }
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for(int k = 0; k < n; k++){
//            arr[k][0] = sc.nextInt();
//            arr[k][1] = sc.nextInt();
//        }

        int[] arr = new int[]{1,0,0,0,0,0,1,0,0,0,1,1,1,1};
        T1_wangyi_2021_T1 t1 = new T1_wangyi_2021_T1();
        int i = t1.max_L(arr);
        System.out.println(i);

    }

    public  int max_L(int[] arr){
        if(arr==null){
            return -1;
        }
        int left = 0;
        int right = arr.length-1;
        int temp = 0;
        while(left <= right){
            if(arr[left] == 1){
                left++;
            }else{
                int tem = left;
                while(left < arr.length && arr[left] == 0){
                    left++;
                }
                temp = Math.max(temp,left-tem);
            }
        }

        return temp;
    }
}
