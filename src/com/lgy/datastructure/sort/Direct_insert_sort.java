package com.lgy.datastructure.sort;

/**
 * 直接插入排序
 */
public class Direct_insert_sort {

    //直接插入排序
    public int[] InsertSort(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
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
