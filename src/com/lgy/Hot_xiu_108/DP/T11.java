package com.lgy.Hot_xiu_108.DP;

/**
  T11. 最长公共子序列(二)
 https://www.nowcoder.com/practice/6d29638c85bb4ffd80c020fe244baf11?tpId=188&
 &tqId=38338&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking

 *
 * @author LGY
 * @create 2022-06-20 13:55
 */
public class T11 {


    /**
     * 自己干出来的，加油吧，小屌丝。呜呜呜。
     * @param s1
     * @param s2
     * @return
     */
    public String LCS (String s1, String s2) {
        // write code here
        int len_s1 = s1.length();
        int len_s2 = s2.length();

        if(len_s1 == 0 || len_s2 == 0){
            return "-1";
        }

        String[][] dp = new String[len_s1+1][len_s2+1];

        for(int i = 0; i<=len_s1;i++){
            dp[i][0] = "";
        }
        for(int i = 0; i<=len_s2;i++){
            dp[0][i] = "";
        }

        for(int i = 1;i<=len_s1;i++){
            for(int j = 1; j<=len_s2;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+s1.charAt(i-1);
                }else{
                    if(dp[i-1][j].length()>= dp[i][j-1].length()){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }

        return dp[len_s1][len_s2]==""?"-1":dp[len_s1][len_s2];
    }
}
