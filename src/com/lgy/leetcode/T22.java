package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-22 16:01
 */
public class T22 {

    List<String> res = new LinkedList<>();

    public List<String> generateParenthesis(int n) {

        if (n == 0) {
            return res;
        }
        dfs("", n, n, res);

        return res;
    }

    private void dfs(String s, int left, int right, List<String> res) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            dfs(s + "(", left - 1, right, res);
        }
        if (right > 0) {
            dfs(s + ")", left, right - 1, res);
        }
    }

    public static void main(String[] args) {
        T22 t22 = new T22();
        t22.generateParenthesis(2);

    }

}
