package com.lgy.Hot_xiu_108.DP;

/**
 * T10. 最长公共子串
 *
 https://www.nowcoder.com/practice/f33f5adc55f444baa0e0ca87ad8a6aac?tpI
 d=188&&tqId=38329&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-19 22:01
 */
public class T10 {


    /**
     * 自己做的,这个是借助的 String 类型的数组。
     *
     * @param str1
     * @param str2
     * @return
     */
    public String LCS (String str1, String str2) {
        // write code here
        int len_str1 = str1.length();
        int len_str2 = str2.length();

        String[][] dp = new String[len_str1+1][len_str2+1];

        for(int i = 0; i<=len_str1;i++){
            dp[i][0] = "";
        }
        for(int i = 0; i<=len_str2; i++){
            dp[0][i] = "";
        }
        int row = 0;
        int low = 0;
        String res = "";
        for(int i = 1;i<=len_str1;i++){
            for(int j = 1; j<=len_str2;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + str1.charAt(i-1);
                }else{
                    dp[i][j] = "";
                }
                if(dp[i][j].length() > res.length()){
                    res = dp[i][j];
                    row = i;
                    low = j;
                }
            }
        }
        return dp[row][low];
    }

    /**
     * 用的 是 int[] 数组
     * @param str1
     * @param str2
     * @return
     */
    public String LCS_1 (String str1, String str2) {
        int len_str1 = str1.length();
        int len_str2 = str2.length();
        int[][] dp = new int[len_str1+1][len_str2+1];

        int row = 0;
        int col = 0;
        int res = 0;

        for(int i = 1;i <= len_str1; i++){
            for(int j = 1; j <= len_str2; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = 0;
                }
                if(dp[i][j] > res){
                    res = dp[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return str1.substring(row-res,row);
    }

    /**
     * LCS_1 优化以后的情况
     * @param str1
     * @param str2
     * @return
     */
    public String LCS_2 (String str1, String str2) {
        int len_str1 = str1.length();
        int len_str2 = str2.length();
        int[][] dp = new int[len_str1+1][len_str2+1];

        int row = 0;
        int res = 0;

        for(int i = 1;i <= len_str1; i++){
            for(int j = 1; j <= len_str2; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                if(dp[i][j] > res){
                    res = dp[i][j];
                    row = i;
                }
            }
        }
        return str1.substring(row-res,row);
    }
}
