package com.lgy.JZoffer;

/**
 * 不用加减乘除做加法 65
 * @author LGY
 * @create 2022-01-10 20:37
 */
public class No_addition_subtraction_multiplication_and_division_65 {

    /**
     * 看的解释
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        while(b!=0) { // 当进位为 0 时跳出
            int carry = a & b; //进位
            a = a^b; //计算本位
            b = carry <<1; //每次求到的进位数要成为下一个累加器的输入
        }
        return a;
    }




}
