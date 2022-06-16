package com.lgy.leetcode;

import java.util.ArrayList;

/**
 * @author LGY
 * @create 2022-06-16 09:19
 */
public class T1545 {

    /**
     * 超时
     */
    ArrayList<String> res = new ArrayList<>();

    public char findKthBit(int n, int k) {

        res.add("0");
        caozuo(n);
        String st = res.get(res.size()-1);
        return st.charAt(k-1);


    }
    public void caozuo(int n){
        for(int i = 1; i < n; i++){
            String s = "";
            String res_i_1 = res.get(res.size()-1);
            String ver = rev_inv(res.get(res.size()-1));
            s += res_i_1+"1"+ver;
            res.add(s);
        }
    }

    public String rev_inv(String s){
        int n = s.length();
        String res = "";
        for(int i = n-1; i >= 0; i--){
            char c = s.charAt(i)=='1'? '0':'1';
            res += c;
        }
        return res;
    }

    public static void main(String[] args) {
        T1545 t1545 = new T1545();
        t1545.findKthBit(3,4);
    }

    /**
     * 递归
     * @param n
     * @param k
     * @return
     */
    public char findKthBit_1(int n,int k){
        if(k ==1){
            return '0';
        }

        int mid = 1 << (n-1);

        if(mid == k){
            return '1';
        }else if (k < mid){
            return findKthBit(n-1,k);
        }else {
            k = mid * 2 - k;
            return invert(findKthBit(n - 1, k));
        }
    }
    public char invert(char bit){
        return (char)('0'+'1'-bit);
    }
}
