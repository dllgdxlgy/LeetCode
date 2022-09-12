package com.lgy.CodeTop_100;

/**
 * @author LGY
 * @create 2022-07-17 16:33
 */
public class T415 {

    /**
     * 第一遍 415. 字符串相加
     *
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();

        int len_num1 = num1.length() - 1;
        int len_num2 = num2.length() - 1;

        int carry = 0;
        while (len_num1 >= 0 || len_num2 >= 0) {
            int n = len_num1 >= 0 ? num1.charAt(len_num1) - '0' : 0;
            int m = len_num2 >= 0 ? num2.charAt(len_num2) - '0' : 0;
            int temp = n + m + carry;
            carry = temp / 10;
            sb.append(temp % 10);
            len_num1--;
            len_num2--;
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }


    public String addStrings_2(String num1, String num2) {

        StringBuilder sb = new StringBuilder();

        int num1_len = num1.length() - 1;
        int num2_len = num2.length() - 1;

        int carry = 0;
        while (num1_len >= 0 || num2_len >= 0) {
            int i = num1_len >= 0 ? num1.charAt(num1_len) - '0' : 0;
            int j = num2_len >= 0 ? num2.charAt(num2_len) - '0' : 0;
            int sum = i+j+carry;
            carry = sum/10;
            sb.insert(0,sum % 10);
            num1_len--;
            num2_len--;
        }
        if(carry == 1){
            sb.insert(0,1);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("fbhrhrh");
        stringBuilder.insert(0, "0000");

        System.out.println(stringBuilder.toString());
    }
}
