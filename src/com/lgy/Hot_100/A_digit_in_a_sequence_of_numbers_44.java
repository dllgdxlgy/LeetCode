package com.lgy.Hot_100;

public class A_digit_in_a_sequence_of_numbers_44 {
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n>count){
            digit++;
            n -=count;
            start *=10;
            count = digit * start *9;
        }
        long num = start + (n-1)/digit;
        int res = Long.toString(num).charAt((n-1)%digit)-'0';
        return res;
    }
}
