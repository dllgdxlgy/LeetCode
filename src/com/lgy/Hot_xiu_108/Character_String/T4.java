package com.lgy.Hot_xiu_108.Character_String;

import java.util.Arrays;
import java.util.Stack;

/**
 * 4. 大数加法
 * <p>
 * https://www.nowcoder.com/practice/11ae12e8c6fe48f883cad618c2e81475?tp
 * Id=188&&tqId=38311&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 *
 * @author LGY
 * @create 2022-06-14 14:35
 */
public class T4 {


    public String solve(String s, String t) {
        // write code here

        StringBuilder sb = new StringBuilder();
        int len_s = s.length();
        int len_t = t.length();
        int max = Math.max(len_t, len_s);
        int len = max + 1;

        int[] arr_s = new int[len];
        int[] arr_t = new int[len];

        int[] res = new int[len];

        for (int i = len_s - 1; i >= 0; i--) {
            arr_s[--len] = s.charAt(i) - '0';
        }

        max = Math.max(len_t, len_s);
        len = max + 1;

        for (int i = len_t - 1; i >= 0; i--) {
            arr_t[--len] = t.charAt(i) - '0';
        }

        max = Math.max(len_t, len_s);
        len = max + 1;
        int num = 0;
        for (int i = len - 1; i >= 0; i--) {
            int temp = arr_s[i] + arr_t[i] + num;
            res[i] = temp % 10;
            num = temp / 10;
        }
        for (int i = 0; i < len; i++) {
            sb.append(res[i]);
        }
        String sb_res = sb.toString();
        int index = 0;
        while (index < len && sb_res.charAt(index) == '0') {
            index++;
        }
        return index == len ? "0" : sb_res.substring(index);

    }

    public static void main(String[] args) {
        T4 t4 = new T4();
        String solve = t4.solve_1("0", "0");
        System.out.println(solve);
    }


    /**
     *
     * @param s
     * @param t
     * @return
     */
    public String solve_1(String s, String t) {
        // write code here
        if(s.equals("0")){
            return t;
        }
        if(t.equals("0")){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int s_right = s.length() - 1;
        int t_right = t.length() - 1;

        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        while (s_right >= 0 || t_right >= 0){

            int num1 = s_right < 0 ? 0:s.charAt(s_right)-'0';
            int num2 = t_right < 0 ? 0:t.charAt(t_right)-'0';
            int sum = stack.pop() + num1+ num2;
            stack.push(sum/10);
            sb.append(Integer.toString(sum%10));
            s_right--;
            t_right--;
        }
        if(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String res = sb.reverse().toString();
        int start = 0;
        for(int i = 0;i<res.length();i++){
            if(res.charAt(i) != '0'){
                start = i;
                break;
            }
        }
        return res.substring(start);
    }
}
