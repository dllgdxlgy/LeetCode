package com.lgy.company.BIanLiFeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-14 16:47
 */
public class T2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int wigth = scanner.nextInt();
//        List<int[]> goods = new ArrayList<>();
//        String str = scanner.next;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int temp = 0;
//        int maxHeight = 0;
//        int heightSum = 0;
//        for (int i = 0; i < ; i++) {
//
//        }
        Scanner scanner = new Scanner(System.in);
        int wigth = scanner.nextInt();
        List<int[]> goods = new ArrayList<>();
        String str = scanner.next();
        String[] arr = str.split(" ");
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = Integer.parseInt(arr[i]);

        }
        goods.add(a);
        System.out.println(print(goods,2));
    }
    public static int print(List<int[]> nums, int width){
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp = 0;
        int maxHeight = 0;
        int heightSum = 0;
        for (int i = 0; i < nums.size(); i++) {
            map.put(nums.get(i)[0],nums.get(i)[0]);
        }
        for (int i = 0; i < nums.size(); i++) {
            while (temp <= width){
                temp+=nums.get(i)[0];
                maxHeight = Math.max(maxHeight,nums.get(i)[0]);
            }
            heightSum+=maxHeight;
        }
        return heightSum;
    }
}
