package com.lgy.leetcode;

/**
 * 5. 最长回文子串
 * @author LGY
 * @create 2022-06-14 14:15
 */
public class T5 {

    public String longestPalindrome (String s) {
        // write code here
        int res = 1;
        char[] arr = s.toCharArray();
        int len = arr.length;
        int max = 1;
        String ss = s.substring(0,1);
        for(int i = 0; i < len;i++){
            int left = i-1;
            int right = i+1;

            while(left >= 0 && right < len && arr[left] == arr[right]){
                res += 2;

                if(res>max){
                    ss = s.substring(left,right+1);
                    max = Math.max(max,res);
                }

                left--;
                right++;
            }
            res = 1;
        }

        res = 0;
        for(int i = 0 ; i < len; i++){
            int left = i;
            int right = i+1;
            while(left >= 0 && right < len && arr[left] == arr[right]){
                res+=2;

                if(res > max){
                    ss = s.substring(left,right+1);
                    max = Math.max(max,res);
                }
                left--;
                right++;
            }
            res=0;
        }
        return ss;
    }

}
