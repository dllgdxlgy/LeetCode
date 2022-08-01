package com.lgy.Hot_xiu_108;

import com.lgy.JZoffer.entity.ListNode;
import com.lgy.JZoffer.entity.TreeNode;
import com.lgy.datastructure.sort.Quick_sort;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 练习专用
 *
 * @author LGY
 * @create 2022-07-04 15:35
 */
public class Practise {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode root = new ListNode(0);
        ListNode temp = null;
        ListNode left = head;
        ListNode right = head;


        Stack<ListNode> stack = new Stack<>();


        return null;
    }

    public int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int len = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (i + len > haystack.length()) {
                break;
            }
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + len).equals(needle))
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Practise practise = new Practise();
//        int i = practise.strStr("mississippi", "issipi");
//
//        String str = "mississippi";
//        String substring = str.substring(4,10);
//        String s = "mississippi";
//        String s1 = "issipp";
//        System.out.println(substring.equals(s1));
        //System.out.println(substring);
//        System.out.println(i);
//        ConcurrentHashMap map = new ConcurrentHashMap();
////
//        int[] arr = new int[]{4,2,9,1,0,-1,6,3,8};
//        sortByStack(arr);
//        for(int c : arr){
//            System.out.println(c);
//        }

    }

//    class singleton{
//        private static volatile singleton INSTANCE ;
//
//        private singleton(){}
//
//        public singleton getInstance(){
//            if(INSTANCE == null){
//                synchronized(singleton.class){
//                    if(INSTANCE == null){
//                        INSTANCE = new singleton();
//                    }
//                }
//            }
//            return INSTANCE;
//        }
//    }



    public static void QuickSort(int[] arr, int low, int high) {
        int left = low;
        int right = high;


        if (left >= right){
            return;
        }
        int temp = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];
            while (left<right && arr[left]<=temp){
                left++;
            }
            arr[right] = arr[left];

        }
        arr[left] = temp;
        QuickSort(arr,low,left-1);
        QuickSort(arr,left+1,high);
    }


    public static void sortByStack(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = arr.length-1;
        stack.push(left);
        stack.push(right);
        while(!stack.isEmpty()){
            int high = stack.pop();
            int low = stack.pop();
            int index = patition(arr,low,high);

            if(low < index){
                stack.push(low);
                stack.push(index-1);
            }
            if(index < high && index >=0){
                stack.push(index+1);
                stack.push(high);
            }
        }

    }

    public static int patition(int[] arr, int i , int j ){
        int left = i;
        int right = j;

        int temp = arr[left];
        while(left < right){
            while(left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = temp;
        return left;
    }




}
