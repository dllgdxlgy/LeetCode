package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 1.反转链表
 * 链接地址：
 https://link.zhihu.com/?target=https%3A//www.nowcoder.com/practice/7
 5e878df47f24fdc9dc3e400ec6058ca%3FtpId%3D188%26%26tqId%3D38308%26rp%3D1%2
 6ru%3D/activity/oj%26qru%3D/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-04 21:21
 */
public class T1 {

    /**
     *  最优解法
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {

        if(head==null)
            return null;
        //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
        ListNode pre = null;
        ListNode next = null;
        //当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
        //所以需要用到pre和next两个节点
        //1->2->3->4->5
        //1<-2<-3 4->5
        while(head!=null){
            //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
            //如此就可以做到反转链表的效果
            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
            next = head.next;
            //保存完next，就可以让head从指向next变成指向pre了，代码如下
            head.next = pre;
            //head指向pre后，就继续依次反转下一个节点
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            pre = head;
            head = next;
        }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表
        return pre;
    }

    /**
     * 我的解法
     * @param head
     * @return
     */
    public ListNode reverseList_1(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode next  = null;
        while(head!=null){

            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }

    /**
     * 二刷
     * @param head
     * @return
     */
    public ListNode ReverseList_2(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode next = null;
        ListNode pre = null;

        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
