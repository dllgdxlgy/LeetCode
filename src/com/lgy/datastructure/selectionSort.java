package com.lgy.datastructure;

import java.util.ArrayList;

/**
 *
 */
public class selectionSort {


    /**
     * 找到数组中最小的值
     *
     * @param arr
     */
    public int findSmallest(ArrayList arr) {
        int smallestValue = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(i) < smallestValue) {
                smallestValue = arr.indexOf(i);
            }
        }
        return smallestValue;
    }

    public ArrayList<Integer> selectionSort(ArrayList arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < arr.size(); j++) {
            int value = findSmallest(arr);
            arrayList.add(j,value);
            arr.remove(value);

        }
        return arrayList;
    }

    public static void main(String[] args) {
        selectionSort sort = new selectionSort();

        ArrayList<Integer> arrayList = new ArrayList<>();

        int[] arr = new int[]{1,4,2,1,6,8,9,2,4,5,7,8};
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
        System.out.println(sort.selectionSort(arrayList));

    }
}