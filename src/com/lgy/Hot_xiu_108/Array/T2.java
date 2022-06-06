package com.lgy.Hot_xiu_108.Array;

/**
 *
 * 2. 斐波那契数列
 *
 https://www.nowcoder.com//pract
 ice/c6c7742f5ba7442aada113136ddea0c3?tpI
 d=190&&tqId=35364&rp=1&ru=/activity/oj&qru=/t
 a/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-06 21:08
 */
public class T2 {

    public int Fibonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);

    }
}
