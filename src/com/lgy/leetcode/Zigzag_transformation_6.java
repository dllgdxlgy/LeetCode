package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-02-16 21:57
 */
public class Zigzag_transformation_6 {

    public String convert(String s, int numRows) {

        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int i = 0,flag =-1;
        for (char c : s.toCharArray()) {
            list.get(i).append(c);
            if (i == 0 || i == numRows-1){
                flag = -flag;
            }
            i+=flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb: list
             ) {
            res.append(sb);
        }
        return res.toString();
    }
}
