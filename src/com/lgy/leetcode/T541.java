package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-10-08 19:39
 */
public class T541 {


    /**
     * T541. 反转字符串 II
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int c = 2 * k;
        int n = s.length() /c;

        for (int j = 0; j < n; j++) {
            sb.append(reverse(s.substring(j*c,j*c+k)));
            sb.append(s.substring(j*c+k,(j+1)*c));
        }
        int len = s.length() - n *c;
        if(len < k){
            sb.append(reverse(s.substring(n*c,s.length())));
        }else {
            sb.append(reverse(s.substring(n*c,n*c+k)));
            sb.append(s.substring(n*c+k,s.length()));
        }

        return sb.toString();
    }

    public String reverse(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length-1;

        while (i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "abcdefghijk";
        T541 t541 = new T541();
        String s1 = t541.reverseStr(s, 2);
        System.out.println(s1);
    }
}
