package com.lgy.Hot_xiu_108.Character_String;

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
}
