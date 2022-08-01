package com.lgy.company.Other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-29 07:27
 */
public class T1_for_xinghuan {

    public static int swapNum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] - 1 != i) {
                swap_1(arr, i, arr[i] - 1);
                res++;
            }
        }
        return res == 0 ? 0 : res;
    }

    public static void swap_1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main_0(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<ArrayList<Integer>> listList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(swapNum(arr));
        }
    }

    public static void main_1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }
            System.out.println(slove(nums));
        }
    }

    public static int slove(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (i != nums[i] - 1) {
                swap(nums, i, nums[i] - 1);
                count++;
            }
        }
        return count;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> minlist = new ArrayList<>();
        ArrayList<Integer> maxlist = new ArrayList<>();
        int left = 0;
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                minlist.add(i);
                maxlist.add(max_num(arr, left, i));
                left = i;
            }
        }
        maxlist.add(max_num(arr, left, arr.length));
        if (minlist.get(0) < maxlist.get(0)) {
            minlist.remove(0);
        }
        if (minlist.get(minlist.size() - 1) > maxlist.get(maxlist.size() - 1)) {
            minlist.remove(minlist.size() - 1);
        }
        Iterator<Integer> iterator = maxlist.iterator();
        while (iterator.hasNext()) {
            res += arr[iterator.next()];
        }
        Iterator<Integer> iterator1 = minlist.iterator();
        while (iterator1.hasNext()) {
            res -= arr[iterator1.next()];
        }


        System.out.println(res);

    }

    public static int max_num(int[] arr, int index, int j) {
        int res = arr[index];
        int num = index;
        for (int i = index; i < j; i++) {
            if (arr[i] > res) {
                res = arr[i];
                num = i;
            }
        }
        return num;
    }

}