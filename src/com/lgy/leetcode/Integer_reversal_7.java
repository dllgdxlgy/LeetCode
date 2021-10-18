package com.lgy.leetcode;

public class Integer_reversal_7 {


    //方法一
    public int reverse(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }

    public int reverse_1(int x) {
        String s = Integer.toString(x);
        char[] chars=s.toCharArray();
        if(chars.length==1) return x;
        String s1="";
        for(int i=chars.length-1;i>=0;i--){
            if(chars[i]=='-') continue;
            s1+=chars[i];

        }

        double a=Double.parseDouble(s1);
        if(a>Math.pow(2,31)-1||a<-Math.pow(2,31))
            return 0;

        else {
            int a1=Integer.parseInt(s1);
            if(x<0)
                a1-=2*a1;

            return a1;
        }
    }



    public static void main(String[] args) {
       Integer_reversal_7 integer_reversal_7 = new Integer_reversal_7();
        int x =123;
        int res = integer_reversal_7.reverse(x);
        System.out.println(res);

        int i = integer_reversal_7.reverse_1(321);
        System.out.println(i);
    }
}
