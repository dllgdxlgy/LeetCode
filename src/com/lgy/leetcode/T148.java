package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  T148 排序链表
 * @author LGY
 * @create 2022-08-25 15:55
 */
public class T148 {

    public ListNode sortList(ListNode head) {

        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        //
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(arr);

        ListNode dummy = new ListNode(-1);
        temp = dummy;

        for(int i = 0 ;i<arr.length;i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return dummy;

    }
}
