package com.lgy.Hot_xiu_108.Character_String;

import java.util.Arrays;

/**
 * 3. 最长回文子串
 *
 https://www.nowcoder.com/practice/b4525d1d84934cf280439aeecc36f4af?tpId=188&&t
 qId=38292&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-14 13:11
 */
public class T3 {


    /**
     * 自己做的
     * @param A
     * @return
     */
    public int getLongestPalindrome (String A) {
        // write code here
        int res = 1;
        char[] arr = A.toCharArray();
        int len = arr.length;
        int max = 1;
        for(int i = 0; i < len;i++){
            int left = i-1;
            int right = i+1;

            while(left >= 0 && right < len && arr[left] == arr[right]){
                res += 2;
                max = Math.max(max,res);
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
                max = Math.max(max,res);
                left--;
                right++;
            }
            res=0;
        }
        return max;
    }


    /**
     * 动态规划，自己不会，看的题解
     https://www.nowcoder.com/practice/b4525d1d84934cf280439aeecc36f4af?tpId=188&&tqId=38
     292&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
     * @param A
     * @return
     */
    public int getLongestPalindrome_1 (String A) {
        // write code here
        char[] a = A.toCharArray();
        int n = a.length;
        int[][] dp = new int[n][n];
        int max = 1;
        for(int i = 0; i < n; i++){
            dp[i][i] = 1;
        }
        for(int len = 2; len<=n; ++len){
            for(int i = 0; i <= n-len; i++ ){
                int j = i + len -1;
                if(len == 2 && a[i] == a[j]){
                    dp[i][j] = len;
                    max = 2;
                    continue;
                }
                if(a[i] == a[j] && dp[i+1][j-1] != 0){
                    dp[i][j] = len;
                    max = len;
                }
            }
        }
        return max;
    }
    /**
     * 测试数组填充方法 Arrays.sort();
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        Arrays.fill(arr[0],1);
        System.out.println(arr);

        String s = "abcfrdes";
        String substring = s.substring(0, 4);
        System.out.println(substring);
    }
}
