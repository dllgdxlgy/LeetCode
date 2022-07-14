package com.lgy.CodeTop_100;

/**
 * @author LGY
 * @create 2022-07-13 20:09
 */
public class T5 {

    /**
     * 中心扩散法
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }

        return res;
    }

    public String palindrome(String s, int i, int j) {
        int left = i;
        int right = j;

        if (right >= s.length()) {
            return "";
        }
        if (s.charAt(left) != s.charAt(right)) {
            return "";
        }

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        //注意：这里substring()要回写。
        return s.substring(left + 1, right); // 注意，这里是left分别减了一次和加了一次。

    }

    public static void main(String[] args) {
        String s = "012345678";
        String s1 = s.substring(2, 5);
        System.out.println(s1);
    }


    /**
     * 动态规划，效果不好。
     * 这里应该注意矩阵上半部分的遍历写法。
     * 
     * @param s
     * @return
     */
    public String longestPalindrome_1(String s) {
        if (s.length() < 2) {
            return s;
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        int res_len = 1;
        int begin = 0;

        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && j - i + 1 > res_len) {
                    res_len = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, res_len + begin);
    }

}
