package com.lgy.Hot_xiu_108.Character_String;

/**
 * T12 KMP
 * <p>
 * https://www.nowcoder.com/practice/bb1615c381cc4237919d1aa448083bcc?tpId
 * =188&&tqId=38322&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 *
 * @author LGY
 * @create 2022-06-16 19:05
 */
public class T12 {


    /**
     * 超时
     * @param S
     * @param T
     * @return
     */
    public int kmp(String S, String T) {
        // write code here
        if (S.length() > T.length()) {
            return 0;
        }

        int len = S.length()-1;
        int res = 0;
        for (int i = len; i < T.length(); i++) {
            if (T.charAt(i) == S.charAt(len) && isEquals(S, 0, len, T, i - len, i)) {
                res++;
            }
        }
        return res;
    }

    public boolean isEquals(String s, int l, int r, String t, int i, int j) {
        int temp = i - l;
        for (int k = 0; k < r; k++) {
            if (s.charAt(k) != t.charAt(temp + k)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        T12 t12 = new T12();
        int kmp = t12.kmp("ababab", "abababab");
        System.out.println(kmp);
    }

}
