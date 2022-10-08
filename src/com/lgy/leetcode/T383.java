package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-10-08 14:50
 */
public class T383 {


    /**
     * T383、赎金信
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] arr = new int[26];
        int[] arr_1 = new int[26];

        for(int i = 0;i<ransomNote.length();i++){
            arr[ransomNote.charAt(i)-'a']++;
        }
        for(int i = 0;i<magazine.length();i++){
            arr_1[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(arr[i]>arr_1[i]){
                return false;
            }
        }
        return true;
    }
}
