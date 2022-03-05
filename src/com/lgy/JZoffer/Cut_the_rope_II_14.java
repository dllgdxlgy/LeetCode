package com.lgy.JZoffer;

/**
 * 剪绳子
 */
public class Cut_the_rope_II_14 {

    public int cuttingRope(int n) {
        int p  = 1000000007;

        long res = 1L;
        // 特殊情况处理
        if (n<=3){
            return n-1;
        }
        while (n>4){
            res = res*3%p;
            n-=3;
        }
        return (int) (res*n%p);
    }

}
