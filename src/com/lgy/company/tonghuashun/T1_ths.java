package com.lgy.company.tonghuashun;

/**
 * @author LGY
 * @create 2022-09-29 16:58
 */
public class T1_ths {

    public static void main(String[] args) {
        T1_ths t1_ths = new T1_ths();
        int[] arr = new int[]{2, 1, 4, 12, 5, 6, 15, 9, 3, 10,3,3,3,3};
        t1_ths.sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public void sort(int[] arr, int i, int j) {
        int left = i;
        int right = j;

        int temp = arr[left];

        while (left < right) {

            while (left < right && arr[right] <= temp) {
                right--;
            }

            arr[left] = arr[right];

            while (left < right && arr[left] >= temp) {
                left++;
            }
            arr[right] = arr[left];

            arr[left] = temp;

            sort(arr, i, left - 1);
            sort(arr, left + 1, j);
        }


    }

}
