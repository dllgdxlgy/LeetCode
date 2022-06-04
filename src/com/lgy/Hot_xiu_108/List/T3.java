package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 3. 判断链表是不是有环结构
 * 要求空间复杂度为 O（1），时间复杂度为O（n）
 *
 https://www.nowcoder.com/practice/650474
 f313294468a4ded3ce0f7898b9?tpId=188&&tqId=3
 8282&rp=1&ru=/activity/oj&qru=/ta/job-code-h
 igh-week/question-ranking
 * @author LGY
 * @create 2022-06-04 21:43
 */
public class T3 {

    /**
     * 投机取巧法(我的)
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head ==null){
            return false;
        }
        while(head != null){
            if(head.val == 10001){
                return true;
            }
            head.val = 10001;
            head = head.next;
        }
        return false;
    }

    /**
     * 快慢指针
     *
     * 推荐这种方法
     * @param head
     * @return
     */
    public boolean hasCycle_1(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
