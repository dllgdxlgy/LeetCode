package com.lgy.Hot_100;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * @author LGY
 * @create 2022-02-20 22:50
 */
public class T14 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode listNode = head;
//        int num = 0;
//        while (head != null) {
//            listNode = listNode.next;
//            num++;
//        }
//        listNode.next = head;


        ListNode listNode =head;
        ListNode listNode2 = head;
        for (int i = 0; i < n; i++) {
            listNode = listNode.next;
        }
        while (listNode != null){
            listNode = listNode.next;
            listNode2 = listNode2.next;
        }

        listNode2.next = listNode2.next.next;



        return head;
    }

}
