package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2022-01-01 21:11
 */
public class Number_of_1_in_binary_15 {


    /**
     *  方法 1
     * @param n
     * @return
     */
//    public int hammingWeight1(int n) {
//
//        int num = 0;
//        while (n != 0){
//            num = num +(n&1);
//            n>>>=1;
//        }
//        return num;
//    }


    /**
     *  方法 2
     * @param n
     * @return
     */
//    public int hammingWeight(int n) {
//        int res = 0;
//        while(n != 0) {
//            res++;
//            n &= n - 1;
//        }
//        return res;
//    }
    public int hammingWeight(int n) {

        int res = 0;
        while (n != 0){
            if ((n & 1)==1){
                res++;
                n>>>=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Number_of_1_in_binary_15 number = new Number_of_1_in_binary_15();
        number.hammingWeight(5);
    }


}
