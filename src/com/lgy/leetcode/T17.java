package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * T17 电话号码的字母组合
 * @author LGY
 * @create 2022-08-12 17:02
 */
public class T17 {

    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0 || digits == null){
            return res;
        }
        String[] arr = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        backtracting(arr,digits,0);

        return res;
    }

    public void backtracting(String[] arr, String digits,int num){
        if(num == digits.length()){
            res.add(sb.toString());
            return;
        }

        String temp = arr[digits.charAt(num)-'0'];

        for(int i = 0; i < temp.length();i++){
            sb.append(temp.charAt(i));
            backtracting(arr,digits,num+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
