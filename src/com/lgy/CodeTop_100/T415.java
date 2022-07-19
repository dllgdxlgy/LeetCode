package com.lgy.CodeTop_100;

/**
 * @author LGY
 * @create 2022-07-17 16:33
 */
public class T415 {

    public String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();

        int len_num1 = num1.length()-1;
        int len_num2 = num2.length()-1;

        int carry = 0;
        while (len_num1 >= 0 || len_num2 >=0){
            int n = len_num1>=0? num1.charAt(len_num1)-'0':0;
            int m = len_num2>=0?num2.charAt(len_num2)-'0':0;
            int temp = n+m+carry;
            carry = temp/10;
            sb.append(temp%10);
            len_num1--;
            len_num2--;
        }
        if(carry == 1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

}
