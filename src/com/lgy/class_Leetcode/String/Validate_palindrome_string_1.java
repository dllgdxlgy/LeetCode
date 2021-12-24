package com.lgy.class_Leetcode.String;

//验证回文串

/**
 * https://leetcode-cn.com/leetbook/read/top-interview-questions/xah8k6/
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
   说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 *
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 *
 */
public class Validate_palindrome_string_1 {

    /**
     * 知识点记录：
     * Character.isLetterOrDigit(char c) 判断是不是字母和数字，是为 true，不是为 false
     * Character中有静态方法 toLowerCase 忽略大小写
     *
     * String 中 s.charAt(index) 能取出第 index 的字符
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){return true;}
        int left =0;
        int right = s.length()-1;
        while (left<right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        //知识点记录2：此方法可以将大写转化为小写
        String s = "shufMdh";
        String s1 = s.toLowerCase();
        System.out.println(s1);
        System.out.println("---------------------------");


        /**
         * 运用了正则表达式，用空字符串代替
         * s2.replaceAll("[^A-Za-z0-9]", ""); 用后面的参数代替欠摸不满足的情况。
         */
        String s2 = "a,f,r,g,HD,h,@,s";
        String actual = s2.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(actual);
        //字符串大写转小写
        String s3 = actual.toLowerCase();
        System.out.println(s3);
        StringBuffer stringBuffer = new StringBuffer(s3);
        System.out.println(stringBuffer);
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);


        String s4 = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(s4).reverse().toString();
        actual.equals(rev);





    }





















}
