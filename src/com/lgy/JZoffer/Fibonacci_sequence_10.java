package com.lgy.JZoffer;

/**
 *
 * 递归超时了
 *
 * @author LGY
 * @create 2022-01-09 15:54
 */
public class Fibonacci_sequence_10 {

    public int fib(int n) {

        if( n == 1 )return 1;
        if( n == 0 )return 0;

        int res = 0;
        res = fib(n-1) + fib(n-2);

        return res;
    }

    public static void main(String[] args) {
        Fibonacci_sequence_10 fibonacci_sequence_10 = new Fibonacci_sequence_10();
        int res = fibonacci_sequence_10.fib(0);
        System.out.println(res);
    }

}
