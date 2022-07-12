package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

import java.util.*;

/**
 * 11. 重排列表（共两种方法）
 *
 https://www.nowcoder.com/practice/3d281d
 c0b3704347846a110bf561ef6b?tpId=188&&tqId=38321&
 rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking

 * @author LGY
 * @create 2022-06-05 21:26
 */
public class T11 {

    /**
     * 第一遍
     * @param head
     */
    public void reorderList(ListNode head) {

        if(head == null){
            return;
        }
        List<ListNode> list = new ArrayList<>();

        while(head != null){
            list.add(head);
            head = head.next;
        }

        int left = 0;
        int right = list.size()-1;
        while(left < right){
            list.get(left).next = list.get(right);
            left++;
            if(left == right){
                break;
            }
            list.get(right).next = list.get(left);
            right--;
        }
        list.get(left).next = null;

    }


    /**
     * 第二种方法
     * @param head
     */
    public void reorderList_1(ListNode head) {
        /** 给出的例子 **/
        // ListNode middel = middle(head);
        // ListNode l1 = head;
        // ListNode l2 = middel.next;
        // middel.next = null;
        //  l2 = reverse(l2);
        // mergeList( l1, l2);

        /**自己做的**/
        ListNode middel = middle(head);
        ListNode l1 = head;
        ListNode temp = middel.next;
        middel.next = null;
        ListNode head1 = reverse(temp);
        mergeList( l1, head1);
    }

    public ListNode middle(ListNode root){

        if(root == null){
            return root;
        }
        ListNode left = root;
        ListNode right = root;
        while (right != null && right.next != null){
            left = left.next;
            right = right.next.next;
        }
        return left;
    }

    public ListNode reverse(ListNode root){
        if(root == null){
            return root;
        }
        ListNode pre = null;
        ListNode end = null;
        while (root != null){
            end = root.next;
            root.next = pre;
            pre = root;
            root = end;
        }
        return pre;
    }

    public void mergeList(ListNode l1, ListNode l2){
        ListNode l1_tmp = l1;
        ListNode l2_tmp = l2;

        while (l1_tmp != null && l2_tmp != null) {
            ListNode temp1 = l1_tmp.next;
            ListNode temp2 = l2_tmp.next;
            l1_tmp.next = l2_tmp;
            l2_tmp.next = temp1;
            l1_tmp = temp1;
            l2_tmp = temp2;
        }
    }
}
