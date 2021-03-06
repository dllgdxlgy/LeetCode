package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

import java.util.HashSet;

/**
 *2.寻找链表的环节点
 *
 https://www.nowcoder.com/practice/6e630519bf8648
 0296d0f1c868d425ad?tpId=188&&tqId=38324&rp=1&ru=/a
 ctivity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-04 21:34
 */
public class T2 {

    /**
     * 我的做法
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }
        HashSet<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }

        return null;
    }


    /**
     *
     * @param head
     * @return
     */
    public ListNode detectCycle_2(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next ==null){
            return null;
        }
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
