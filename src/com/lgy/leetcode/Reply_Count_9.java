package com.lgy.leetcode;

public class Reply_Count_9 {


    //方法一
    public boolean isPalindrome(int x) {

        if (x + 1 <= 0) {
            return false;
        }
        int i = reverse(x);
        if (i == x){
            return true;
        }else return false;

    }

    /**
     * 此函数将一个整数进行反转
     * @param x
     * @return
     */
    public int reverse(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            //2的32次方是2 147 483 648
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

    public static void main(String[] args) {

        //方法一测试
        Reply_Count_9 reply_count_9 = new Reply_Count_9();
        int x = 121;
        System.out.println(reply_count_9.isPalindrome(x));

        System.out.println("****************************************");
        //方法二测试
        System.out.println(reply_count_9.isPalindrome2(12451421));

//        String s1 = "11";
//        String s2 = "22";
//
//        String concat = s2.concat(s1);
//        System.out.println(concat);
//        String str = "12hello34world5java7891mysql456";
////把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
//        String string = str.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
//        System.out.println(string);


    }
    //方法二
    public boolean isPalindrome2(int x) {

        if (x + 1 <= 0) {
            return false;
        }
        String str = x+"";
        int low = 0;
        int high = str.length() - 1;
        while (low<high){
            if (str.charAt(low) == str.charAt(high)){
                low++;
                high--;
            }else {
                return false;
            }

        }
        return true;

    }



}
