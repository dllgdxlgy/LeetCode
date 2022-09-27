package com.lgy.company.yinyue;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-09-26 19:18
 */
public class T1_for_kcj {

//    public int res(int[] arr, int k) {
//        int num = (int) Math.pow(10,k);
//        int res = 0;
//        int n = arr.length;
//        //起始位置
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int sum = 1;
//                for (int c = i; c <= j; c++) {
//                    sum *= arr[c];
//                }
//                if(sum % num == 0){
//                    res +=(n-j);
//                    break;
//                }
//            }
//        }
//        return res % 1000000007;
//    }


//    public int res(int[] arr, int k) {
//        int num = (int) Math.pow(10, k);
//        int res = 0;
//        int n = arr.length;
//        //起始位置
//        for (int i = 0; i < n; i++) {
//            int sum = 1;
//            int j;
//            for (j = i ; j < n; j++) {
//                sum *= arr[j];
//            }
//            if (sum % num == 0) {
//                res += (n - j);
//                break;
//            }
//        }
//        return res;
//    }

//    public int res(int[] arr, int k) {
//        int num = (int) Math.pow(10, k);
//        int res = 0;
//        int n = arr.length;
//        //起始位置
//        for (int i = 0; i < n; i++) {
//            int sum = 1;
//            for (int j = i; j < n; j++) {
//
//                sum *= arr[j];
//                if (sum % num == 0) {
//                    res += (n - j);
//                    break;
//                }
//            }
//        }
//        return res % 1000000007;
//    }

    public static void main(String[] args) {

        T1_for_kcj t1_for_kcj = new T1_for_kcj();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(50);
        list.add(4);

        int res = t1_for_kcj.res_1(list, 2);
        System.out.println(res);

    }

    public int res_1(ArrayList<Integer> list, int k) {
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        long num = (long) Math.pow(10, k);
        int res = 0;
        int n = arr.length;
        //起始位置
        for (int i = 0; i < n; i++) {
            long sum = 1;
            for (int j = i; j < n; j++) {

                sum *= arr[j];
                if (sum % num == 0) {
                    res += (n - j);
                    break;
                }
            }
        }
        return res % 1000000007;
    }
}
