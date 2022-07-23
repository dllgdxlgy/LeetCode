package com.lgy.datastructure.sort;

/**
 * @author LGY
 * @create 2022-07-23 21:45
 */
//public class Merge {
//
//    private static int[] aux;
//
//    public static void sort(int[] a) {
//        aux = new int[a.length];
//        sort(a, 0, a.length - 1);
//    }
//
//    public static void sort(int[] a, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        int mid = (left + right) / 2;
//        sort(a, left, mid);
//        sort(a, mid + 1, right);
//        merge(a, left, mid, right);
//    }
//
//    public static void merge(int[] arr, int left, int mid, int right) {
//        int i = left;
//        int j = mid + 1;
//        for (int k = left; k <= right; k++) {
//            aux[k] = arr[k];
//        }
//
//        for (int k = left; k <= right; k++) {
//            if(i > mid)
//
//        }
//
//    }
//}

public class Merge {

    //归并所需的辅助数组
    private static int[] aux;

    public static void sort(int[] a) {
        //一次性分配空间
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        //将左半边排序
        sort(a, low, mid);
        //将右半边排序
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    /**
     * 该方法先将所有元素复制到aux[]中，然后在归并会a[]中。方法咋归并时(第二个for循环)
     * 进行了4个条件判断：
     * - 左半边用尽(取右半边的元素)
     * - 右半边用尽(取左半边的元素)
     * - 右半边的当前元素小于左半边的当前元素(取右半边的元素)
     * - 右半边的当前元素大于等于左半边的当前元素(取左半边的元素)
     * @param a
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] a, int low, int mid, int high) {
        //将a[low..mid]和a[mid+1..high]归并
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,1,3};
        Merge.sort(arr);
    }
}

