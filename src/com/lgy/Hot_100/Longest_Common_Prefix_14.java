package com.lgy.Hot_100;

/**
 * 14 最长公共前缀
 */
public class Longest_Common_Prefix_14 {

    public String longestCommonPrefix(String[] strs) {
        //特殊条件判断
        if (strs.length == 0 ||strs == null){
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
           prefix = comparison_string(prefix,strs[i]);
           if (prefix == ""){
               return "";
           }


        }
        return prefix;
    }
    public String comparison_string(String str1,String str2){
        int index = 0 ;
        int min_length = Math.min(str1.length(),str2.length());
        while (index<min_length && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "qsd";
        Longest_Common_Prefix_14 lc = new Longest_Common_Prefix_14();
        String s = lc.comparison_string(s1,s2);
        System.out.println(s);
    }
}
