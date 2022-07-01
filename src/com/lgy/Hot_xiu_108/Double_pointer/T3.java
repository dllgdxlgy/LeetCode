package com.lgy.Hot_xiu_108.Double_pointer;

import com.lgy.JZoffer.entity.ListNode;

import java.util.HashSet;

/**
 * T3. 链表中环的入口节点
 https://www.nowcoder.com/practice/6e630519bf86480296d0f1c868d425ad?tpId=190&&tqId=351
 78&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-01 23:13
 */
public class T3 {


    public ListNode detectCycle(ListNode head) {
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
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode detectCycle_1(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null){
            slow = slow.next;
            if(fast.next !=null){
                fast = fast.next.next;
            }else{
                return null;
            }
            if(fast == slow){
                ListNode pre = head;
                while(pre != slow){
                    slow = slow.next;
                    pre = pre.next;
                }
                return slow;
            }
        }
        return null;
    }



}
