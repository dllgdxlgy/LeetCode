package com.lgy.Hot_xiu_108.Double_pointer;

/**
 * T5. 反转字符串
 https://www.nowcoder.com/practice/c3a6afee325e472386a1c4eb1ef987f3?tpId=190&&tqId=35226&rp=1&ru=/act
 ivity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-01 22:45
 */
public class T5 {
    /**
     *
     * @param str
     * @return
     */
    public String solve (String str) {
        // write code here
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for(int i = len-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * 双指针
     * @param str
     * @return
     */
    public String solve_1 (String str) {
        // write code here
        int left = 0;
        int right = str.length()-1;
        char[] arr = str.toCharArray();
        while(left < right ){
            char c = str.charAt(left);
            arr[left] = arr[right];
            arr[right] = c;
            left++;
            right--;
        }

        return new String(arr);
    }

}
