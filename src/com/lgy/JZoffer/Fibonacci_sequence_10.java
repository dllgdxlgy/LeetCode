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




    public int fib_2(int n){

        int a = 0;
        int b = 1;
        int sum ;

        for (int i = 0; i < n; i++) {
            sum = (a+b) % 1000000007;
            a = b;
            b = sum;
        }

        return a;
    }

    /**
     * 二刷
     * @param n
     * @return
     */
    public int fib_3(int n) {
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] arr = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < n+1;i++){
            arr[i] = (arr[i-1]+arr[i-2])%1000000007;
        }
        return arr[n];
    }

    public int Fibonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);

    }

    public static void main(String[] args) {
        Fibonacci_sequence_10 fibonacci_sequence_10 = new Fibonacci_sequence_10();
//        int res = fibonacci_sequence_10.fib_2(4);
//        System.out.println(res);
        int fibonacci = fibonacci_sequence_10.Fibonacci(8);
        System.out.println(fibonacci);

    }
}
