package com.lgy.Hot_xiu_108.List;

import java.util.LinkedList;
import java.util.Queue;

/**
 *10. 环形链表的约瑟夫问题
 *
 *  https://www.nowcoder.com/practice/41c399fdb60
 *  04b31a6cbb047c641ed8a?tpId=188&&tqId=38296&rp=1&r
 *  u=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 *
 * 相当于Leetcode 上的 1823 和  Leetcode 的 剑指 Offer 62. 圆圈中最后剩下的数字，题目一样。
 *
 * @author LGY
 * @create 2022-06-05 21:14
 */
public class T10 {

    /**
     * 参考 leetcode
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining(int n, int m) {
        //数组索引是从0开始的
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }


    /**
     * 传统解法二 ：使用队列, 如果是在 剑指 offer 上，那就可能已经超时。
     * @param n
     * @param k
     * @return
     */

    //相关知识

    //queue.poll() 推出队列元素
    //queue.add() 添加元素
    public int findTheWinner(int n, int k) {

        Queue<Integer> queue = new LinkedList<>(); // 注意队列的创建方式

        for(int i = 1; i <= n;i++){
            queue.add(i);
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < k; j++){
                queue.add(queue.poll());
            }
            queue.poll();
        }
        return queue.poll();
    }
}
