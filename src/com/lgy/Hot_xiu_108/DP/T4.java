package com.lgy.Hot_xiu_108.DP;

import sun.misc.Unsafe;

import java.util.concurrent.locks.ReentrantLock;

/**
 * T4.最长上升子序列(三)
 https://www.nowcoder.com/practice/9cf027bf54714ad889d4f30ff0ae5481?tpId=18
 8&&tqId=38281&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking

 * @author LGY
 * @create 2022-06-20 09:20
 */
public class T4 {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                lock.lock();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            });
            thread.start();
        }
    }

}
