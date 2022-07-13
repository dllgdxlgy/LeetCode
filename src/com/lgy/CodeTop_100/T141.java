package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

import java.util.HashSet;

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
public class T141 {

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
     * 写完快慢指针，就可能会继续问，是不是可以继续优化，应该问是不是时间上的优化，如果是，
     * 那就使用hashset 来做，应该就可以了。
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

    /**
     * 借助 HashSet
     * @param head
     * @return
     */
    public boolean hasCycle_2(ListNode head) {

        HashSet<ListNode> set  = new HashSet<>();
        while(head != null){
            if(set.contains(head)){ // 注意 set.contains() 方法
                return true;
            }
            set.add(head);// 添加元素是 add() 方法
            head = head.next;

        }
        return false;

    }

}
