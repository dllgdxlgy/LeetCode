package com.lgy.datastructure.sort;

/**
 * 冒泡排序
 */
public class Bubble_sorting {

    public int[] Bubble_sorting(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            // 记录是不是交换了，没有交换则说明后面有序了
            boolean flag = false;
            int temp = 0;
            for (int j = arr.length-1; j >i; j--) {
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,6,1,6,2,3,7,4};
        Direct_insert_sort dt = new Direct_insert_sort();
        int[] a =  dt.InsertSort(arr);
        for (int res: a) {
            System.out.println(res);
        }
    }
}
