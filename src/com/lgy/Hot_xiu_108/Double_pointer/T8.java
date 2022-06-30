package com.lgy.Hot_xiu_108.Double_pointer;

import com.lgy.JZoffer.entity.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * T8. 判断一个链表是否为回文结构
 https://www.nowcoder.com/practice/3fed228444e740c8be66232ce8b87c2f?tpId=190&&tqId
 =35218&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-30 21:08
 */
public class T8 {


    public boolean isPail (ListNode head) {
        // write code here

        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;

        }
        Integer[] integers = list.toArray(new Integer[]{});
        int left = 0;
        int right = integers.length-1;
        while (left<=right){
            if (!integers[left].equals(integers[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(-401261);
        ListNode temp = node;
        temp.next = new ListNode(-449050);
        temp = temp.next;
        temp.next = new ListNode(-456674);
        temp = temp.next;
        temp.next = new ListNode(-456674);
        temp = temp.next;
        temp.next = new ListNode(-449050);
        temp = temp.next;
        temp.next = new ListNode(-401261);
        temp = temp.next;


        T8 t8 = new T8();
        boolean pail = t8.isPail(node);
    }
}
