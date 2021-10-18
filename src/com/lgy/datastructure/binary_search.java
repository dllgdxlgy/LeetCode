package com.lgy.datastructure;

/**
 * 二分查找算法
 */
public class binary_search {

    /**
     *
     * @param arr:待排序的有序数组，必须是有序的
     * @param item，要查询的数值
     * @return 如果数组中有返回该值在数组的位置，没有返回-1
     * version【1.0】
     */
   public int binary_search(int[] arr, int item){
       //记录中间位置位置，
       int mid = 0;
       //指针指向最低点
       int low =0;
       //最高点
       int high = arr.length-1;
       //每一次取到中间的值
       int guess;
       while (low<=high){
           mid = (low + high)/2;
           guess = arr[mid];
           if (guess == item){
               return mid;
           }
           if (guess>item){
               high = mid -1;
           }else {
               low = mid+1;
           }
       }
       return -1;
   }
    /**
     *
     * @param arr:待排序的有序数组，必须是有序的
     * @param item，要查询的数值
     * @return 如果数组中有返回该值在数组的位置，没有返回-1
     * version【2.0】
     */
    public int binary_search1(int[] arr, int item){
        //记录中间位置位置，
        int mid = 0;
        //指针指向最低点
        int low =0;
        //最高点
        int high = arr.length-1;
        //每一次取到中间的值
        while (low<=high){
            mid = (low + high)/2;
            if (arr[mid] == item){
                return mid;
            }
            if (arr[mid]>item){
                high = mid -1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    /**
     *
     * @param arr:待排序的有序数组，必须是有序的
     * @param item，要查询的数值
     * @return 如果数组中有返回该值在数组的位置，没有返回-1
     * version【3.0】
     */
    public int binary_search3(int[] arr, int item){
        //记录中间位置位置，
        int mid = 0;
        //指针指向最低点
        int low =0;
        //最高点
        int high = arr.length-1;

        if (item < arr[low] || item > arr[high]){
            return -1;
        }
        //每一次取到中间的值
        while (low<=high){
            mid = (low + high)/2;
            if (arr[mid] == item){
                return mid;
            }
            if (arr[mid]>item){
                high = mid -1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       binary_search bs =  new binary_search();
       //要查询的数组
       int[] arr = new int[]{1,3,5,7,8,9,12,14,16,17,17,28};
       //要查询的数值
       int item = 28;

       int result = bs.binary_search3(arr,item);

       System.out.println(result);
    }
}
