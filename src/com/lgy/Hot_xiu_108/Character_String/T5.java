package com.lgy.Hot_xiu_108.Character_String;

/**
 * 5. 反转字符串
 *
 https://www.nowcoder.com/practice/c3a6afee325e472386a1c4eb1ef987f3?tpId=188&&tqId=3
 8280&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-14 15:13
 */
public class T5 {

    public String solve (String str) {
        // write code here
        char[] str_char = str.toCharArray();
        int n = str_char.length;
        StringBuffer sb = new StringBuffer("");

        for(int i = n-1; i >= 0; i--){
            sb.append(str_char[i]);
        }

        return sb.toString();
    }
}
