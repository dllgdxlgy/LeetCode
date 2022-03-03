package com.lgy.company.Mei_Tuan;

import java.util.*;

public class Looking_for_numbers {

    public List<List<Integer>> Look_for_number(String str){
        //转为字符串数组
        char[] chars = str.toCharArray();

        int i =0;

        List<Integer> List1 = new ArrayList<>();

        List<List<Integer>> listList = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
         while (i < chars.length){
            int key =Character.getNumericValue(chars[i]);
            if (Character.isDigit(chars[i]) && chars[i]!='0'){
                deque.addLast(key);
            }else {
                if (!deque.isEmpty())
                listList.add(new ArrayList<>(deque));
                deque.clear();
            }
            i++;
        }
         if (Character.isDigit(chars[chars.length-1])){
             listList.add(new ArrayList<>(deque));

         }
         return listList;
    }

    public static void main(String[] args) {
        String s= "2b012n032222";
        Looking_for_numbers looking_for_numbers = new Looking_for_numbers();
        List<List<Integer>> listList = looking_for_numbers.Look_for_number(s);
        for (int i = 0; i < listList.size(); i++) {
            System.out.println(listList.get(i));
        }
    }

}
