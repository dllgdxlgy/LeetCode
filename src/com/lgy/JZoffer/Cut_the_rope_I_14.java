package com.lgy.JZoffer;

/**
 * 剪绳子
 */
public class Cut_the_rope_I_14 {
    public int cuttingRope(int n) {

        // 特殊情况处理
        if (n<=3){
            return n-1;
        }

        if (n%3 == 2){
            return (int) (Math.pow(3,n/3)*2);
        }else if (n%3 == 1){
            return (int) (Math.pow(3,(n/3)-1)*4);
        }else {
            return (int) Math.pow(3,(n/3));
        }
    }

}
