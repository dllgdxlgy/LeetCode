package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-01-14 22:07
 */
public class The_last_remaining_number_in_the_circle_62 {

    public int lastRemaining(int n, int m) {
        int p=0;
        for(int i=2;i<=n;i++)
        {
            p=(p+m)%i;
        }
        return p;

    }


}
