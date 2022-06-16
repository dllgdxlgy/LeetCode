package com.lgy.Hot_xiu_108.Character_String;

/**
 * @author LGY
 * @create 2022-06-16 23:47
 */
public class T9 {

    public String longestCommonPrefix (String[] strs) {
        // write code here
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String res = strs[0];
        for(int i = 1; i < strs.length;i++){
            res = sub_str(res,strs[i]);
        }
        return res;
    }

    public String sub_str(String str1,String str2){
        if(str2 == null){
            return "";
        }
        int str_1 = str1.length();
        int str_2 = str2.length();
        int index = 0;
        int min = Math.min(str_1,str_2);
        while(index < min){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }else {
               return str1.substring(0,index);
            }
        }
        return str1.substring(0,index);
    }

    public static void main(String[] args) {
        T9 t9 = new T9();
        String[] arr = new String[]{"a","b"};
        t9.longestCommonPrefix(arr);
    }
}
