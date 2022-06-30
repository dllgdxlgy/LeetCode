package com.lgy.Hot_xiu_108.Double_pointer;

import com.lgy.JZoffer.entity.ListNode;

/**
 * T11. 划分链表
 https://www.nowcoder.com/practice/1dc1036be38f45f19000e48abe00b12f?tpId=190&&tqId=3
 6639&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-28 22:25
 */
public class T11 {

    public ListNode partition (ListNode head, int x) {
        // write code here

        ListNode root = new ListNode(0);
        ListNode temp = root;
        ListNode node = head;
        while(node != null){
            if(node.val < x){
                temp.next = new ListNode(node.val);
                temp = temp.next;
            }
            node = node.next;
        }
        node = head;
        while(node != null){
            if(node.val >= x){
                temp.next = new ListNode(node.val);
                temp = temp.next;
            }
            node = node.next;
        }
        return root.next;
    }

    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        ListNode node = root;
        root.next = new ListNode(4);
        root = root.next;
        root.next=new ListNode(3);
        root = root.next;
        root.next=new ListNode(2);
        root = root.next;
        root.next=new ListNode(5);
        root = root.next;
        root.next=new ListNode(2);
        T11 t11 = new T11();
        t11.partition_1(node,3);

    }

    /**
     * 方法 2
     * @param head
     * @param x
     * @return
     */
    public ListNode partition_1 (ListNode head, int x) {
        // write code here

        ListNode root = new ListNode(0);
        ListNode temp = root;
        ListNode node = new ListNode(0);
        ListNode temp1 = node;
        while(head != null){
            if(head.val < x){
                temp.next = head;
                temp = temp.next;
            }else{
                temp1.next = head;
                temp1 = temp1.next;
            }
            head = head.next;
        }
        temp.next = node.next;
        return root.next;
    }
}
