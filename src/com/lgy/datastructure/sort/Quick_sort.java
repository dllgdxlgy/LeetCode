package com.lgy.datastructure.sort;

import com.lgy.Hot_xiu_108.BFS.T1;

import java.util.ArrayList;
import java.util.Stack;

/**
 *  快速排序 (十分重要 )
 */
public class Quick_sort {
    /**
     * 递归快速排序
     * @param arr
     * @return
     */
    public void Quick_sort(int[] arr, int low, int high){

        //定义两个变量接受参数
        int left = low;
        int right = high;

        // 结束时间
        if (left >= right){
           return;
        }
        // 保存基准值
        int temp = arr[left];

        while (left < right){

            // 从后面向前找比基准值大的
            while(arr[right] >= temp && left < right) {
                right--;
            }
            //然后赋值
            arr[left] = arr[right];

            // 从前向后找
            while (arr[left] <= temp && left < right){
                left++;
            }
            // 把后的
            arr[right] = arr[left];
        }
        arr[left] = temp;
        Quick_sort(arr,low,left-1);
        Quick_sort(arr,left+1,high);
    }


    // 非递归快速排序
    public void Quick_sort_1(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(arr.length-1);
        while (!stack.isEmpty()){
            // 出栈进行划分
            int high = stack.pop();
            int low = stack.pop();
            int pivot = partition(arr,low,high);
            if (pivot > low){
                stack.push(low);
                stack.push(pivot-1);
            }
            if (pivot < high && pivot >= 0){
                stack.push(pivot+1);
                stack.push(high);
            }
        }


    }
    // 给出一个数组，还有左右指针，计算第一个该插入的位置
    public static int partition(int[] arr,int low ,int high){
        int left = low;
        int right = high;

        if (left >= right){
            return -1;
        }

        int temp = arr[left];
        while (left < right){
            while (left < right && arr[right] >= temp){
                right-- ;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        return left;
    }

    public static void main_1(String[] args) {
        int[] arr = new int[]{1,4,6,-1,-5,-10,4,6,3,1,7,-1,2,5,6};
        Quick_sort quick_sort = new Quick_sort();
        // 测试递归快速排序
        //quick_sort.Quick_sort(arr,0,arr.length-1);

        // 测试非递归快速排序
        quick_sort.Quick_sort_1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    /*
    -----------------------------------------------------------------------
     */
    public void quick_sort_1(int[] arr, int left,int right){
        if(left >= right){
            return;
        }
        int low =left;
        int high = right;

        int pivot = arr[low];
        while (low < high){
            while (low < high && arr[high] >= pivot){
                --high;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot){
                ++low;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        quick_sort_1(arr,left,low-1);
        quick_sort_1(arr,low+1,right);

    }

    public static void main_2(String[] args) {
        int[] arr = new int[]{40,38,46,56,79,84};
//        T1 t1 = new T1();
//        t1.quick_sort_1(arr,0,5);
        for (int i: arr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }


    public void quick_sort_2 (int[] arr, int left,int right){
        if(left >= right){
            return;
        }
        int pivotIndex = Partition(arr,left,right);
        quick_sort_2(arr,left,pivotIndex-1);
        quick_sort_2(arr,pivotIndex+1,right);
    }
    public int Partition(int[] arr, int left, int right){


        return 0;
    }


}
