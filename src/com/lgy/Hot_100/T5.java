package com.lgy.Hot_100;

/**
 * 最长回文子串
 *
 */
public class T5 {

    /**
     *  暴力解法
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        String res = "";
        if (s.length()<2){
            return s;
        }
        int longest = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j <=  s.length() ; j++) {
                String str = s.substring(i,j);
                if (s_if_Palindrom(str)&&str.length()>longest){
                    longest = str.length();
                    res = str;
                }
            }
        }

        return res;
    }
    public boolean s_if_Palindrom(String s){
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;
        if (s.length() == 1){
            return true;
        }
        while (i<j){
            if (chars[i] == chars[j]){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;

    }

    public String longestPalindrome_1(String s) {

        String res = "";
        if (s.length()<2){
            return s;
        }
        int longest = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j <=  s.length() ; j++) {
                String str = s.substring(i,j);
                if (isPalindromic_1(str)&&str.length()>longest){
                    longest = str.length();
                    res = str;
                }
            }
        }

        return res;
    }
    public boolean isPalindromic_1(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
