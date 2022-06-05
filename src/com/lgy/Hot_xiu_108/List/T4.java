package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 4.链表中倒数最后k个结点
 *
 *
 https://www.nowcoder.com/practice/886370fe
 658f41b498d40fb34ae76ff9?tpId=188&&tqId=38298
 &rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-05 13:31
 */
public class T4 {

    /**
     * 自己做的
     * @param pHead
     * @param k
     * @return
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {

        ListNode temp = pHead;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(k > len){
            return null;
        }
        int i = 0;
        temp = pHead;
        while(i< (len-k)){
            temp = temp.next;
            i++;
        }

        return temp;
    }

    /**
     * 快慢指针
     * @param pHead
     * @param k
     * @return
     */
    public ListNode FindKthToTail_1 (ListNode pHead, int k) {

        ListNode fast = pHead;
        ListNode slow = pHead;
        int i = k;
        while(i > 0){
            if(fast == null){
                return null;
            }
            fast = fast.next;
            i--;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
