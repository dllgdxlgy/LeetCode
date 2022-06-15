package com.lgy.Hot_xiu_108.Character_String;

/**
 * 14. 大数乘法
 * @author LGY
 * @create 2022-06-15 11:29
 */
public class T14 {

    public static void main(String[] args) {
        T14 t14 = new T14();
        String solve = t14.solve("11", "99");
        System.out.println(solve);
    }

    public String solve (String s, String t) {
        // write code here
        int n_s = s.length();
        int n_t = t.length();

        int[] arr_s = new int[n_s];
        for(int i = 0; i < n_s; i++){
            arr_s[i] = s.charAt(i) - '0';
        }
        int[] arr_t = new int[n_t];
        for(int i = 0; i < n_t; i++){
            arr_t[i] = t.charAt(i) - '0';
        }

        int[] res = new int[n_t + n_s];
        for(int i = 0; i < n_s; i++){
            for(int j = 0; j < n_t; j++){
                res[i+j+1] += arr_s[i] * arr_t[j];
            }
        }

        int carry = 0;
        for(int i = res.length-1; i>=0; i--){
            int sum = carry + res[i];
            res[i] = sum % 10;
            carry = sum / 10;
        }

        StringBuffer sb = new StringBuffer();
        int index = 0;
        while( index < res.length && res[index] == 0 ){
            index++;
        }
        for(int i = index; i < res.length; i++){
            sb.append(res[i]);
        }
        return sb.length() == 0? "0":sb.toString();
    }
}
