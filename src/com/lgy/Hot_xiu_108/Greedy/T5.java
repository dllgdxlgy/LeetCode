package com.lgy.Hot_xiu_108.Greedy;

/**
 * T5. 判断子序列
 * https://leetcode-cn.com/problems/is-subsequence/
 * @author LGY
 * @create 2022-06-22 16:55
 */
public class T5 {


    /**
     * 自己做的
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int s_n = s.length();
        int t_n = t.length();

        if(s_n > t_n){
            return false;
        }
        int l = 0;
        int l_t = 0;
        while(l_t <= t_n){
            if(l == s_n){
                return true;
            }
            if(l_t < t_n && s.charAt(l) == t.charAt(l_t)){
                l++;
            }
            l_t++;
        }
        return false;
    }

    /**
     * 优化后的
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence_1(String s, String t) {
        int s_n = s.length();
        int t_n = t.length();

        if(s_n > t_n){
            return false;
        }
        int l = 0;
        int l_t = 0;
        while(l < s_n && l_t < t_n){
            if(s.charAt(l) == t.charAt(l_t)){
                l++;
            }
            l_t++;
        }
        return l == s_n;
    }
}
