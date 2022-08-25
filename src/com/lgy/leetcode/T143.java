package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-25 18:05
 */
public class T143 {


    /**
     * T143 重排链表
     * @param head
     */
    public void reorderList(ListNode head) {
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


    /**
     * 第二遍
     * @param head
     */
    public void reorderList_1(ListNode head) {
        if(head != null && head.next == null){
            return;
        }
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;

        ListNode mid = slow;
        ListNode list1 = reverse_1(mid);
        merge_1(head,list1);
    }

    public ListNode reverse_1(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode end = head;

        while(head != null){
            head = head.next;
            end.next = pre;
            pre = end;
            end = head;
        }
        return pre;
    }

    public ListNode merge_1(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(list1!=null && list2!=null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        if(list1!=null){
            temp.next = list1;
        }
        if(list2 !=null){
            temp.next = list2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        T143 t143 = new T143();
        ListNode root = new ListNode(1);
        ListNode root1 = new ListNode(2);
        ListNode root2 = new ListNode(3);
        ListNode root3 = new ListNode(4);
        ListNode temp = root;
        temp.next = root1;
        temp = temp.next;
        temp.next = root2;
        temp = temp.next;
        temp.next = root3;

        t143.reorderList_1(root);
    }
}
