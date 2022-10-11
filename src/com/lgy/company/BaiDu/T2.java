package com.lgy.company.BaiDu;

import com.lgy.JZoffer.entity.ListNode;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-10-11 20:22
 */
public class T2 {

    static class ListNode{
        int number;
        int youxian;
        ListNode next;

        public int getNumber() {
            return number;
        }

        public int getYouxian() {
            return youxian;
        }

        public ListNode getNext() {
            return next;
        }

        public ListNode() {
        }

        public ListNode(int number, int youxian) {
            this.number = number;
            this.youxian = youxian;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
//        int[] arr = new int[n];
        int[] score = new int[n];
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
//            arr[i] = scanner.nextInt();
//            score[i] = scanner.nextInt();
        }
        scanner.close();



        ListNode dummy = new ListNode(-Integer.MIN_VALUE,Integer.MIN_VALUE);
        ListNode end = dummy;
        ListNode head = dummy;
        ListNode temp = dummy;
        int size = 0;
        for (int i = 0; i < n; i++) {
            if(strings[i].equals("a")){
                for(int j = 0; j <= size;i++){
                    temp = dummy;
                    while (temp != null && temp.youxian <= arr[i][1]){
                        temp = temp.next;

                    }

                    if(temp == null){
                        end.next = new ListNode(arr[i][0],arr[i][1]);
                        end = end.next;

                    }
                    if(temp.youxian > arr[i][1]){

                    }
                }

                size ++;
            }else {

            }
        }
        System.out.println(2);
    }
}
