package com.lgy.company.leetcodecom;

import java.util.*;

public class T {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        List<List<Integer>> listList = new LinkedList<>();
//        List<Integer> list = finddeff(nums1, nums2);
//        List<Integer> list1 = finddeff(nums2, nums1);
//        listList.add(list);
//        listList.add(list1);
//        return listList;
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }
        Set<Integer> set1 = new HashSet<>(set);

        for (int i = 0; i < nums2.length; i++) {
            set.remove(nums2[i]);
        }
        Object[] objects = set.toArray();
        Integer[] arr = new Integer[objects.length];
        for (int i = 0; i < objects.length; i++) {
            arr[i] = (Integer) objects[i];
        }

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }


        for (int i = 0; i < nums1.length; i++) {
            set1.remove(nums1[i]);
        }
        Object[] objects1 = set1.toArray();
        Integer[] arr1 = new Integer[objects1.length];
        for (int i = 0; i < objects1.length; i++) {
            arr1[i] = (Integer) objects1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }

        List<List<Integer>> listList = new LinkedList<>();
        listList.add(list);
        listList.add(list1);
        return listList;

    }

//    public List<Integer> finddeff(int[] num1,int[] num2){
//
//        List<Integer> list = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//
//        int left = 0;
//        while (left<num1.length){
//            for (int i = 0; i < num2.length; i++) {
//                if (num1[left] == num2[i]){
//                    continue;
//                }
//            }
//            left++;
//        }
//
//
//        Object[] objects = set.toArray();
//        for (int i = 0; i < objects.length; i++) {
//            list.add((Integer) objects[i]);
//        }
//        return list;
//    }
public static void main(String[] args) {
    int[] nums1= new int[]{1,2,3};
    int[] nums2= new int[]{2,4,6};
    T t = new T();
    List<List<Integer>> difference = t.findDifference(nums1, nums2);
    System.out.println(difference);
}
}
