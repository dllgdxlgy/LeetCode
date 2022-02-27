package com.lgy.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-02-04 22:10
 */
public class Distribute_biscuits_455 {

    /**
     * @param g 胃口
     * @param s 饼干
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {

        //首先，对两个数组进行排序。
        Arrays.sort(g);
        Arrays.sort(s);

        // 胃口
        int child = 0;
        // 饼干
        int cookie = 0;

        int glenth = g.length;
        int slenth = s.length;


        while (child < glenth && cookie < slenth) {
            //孩子对胃口大于饼干，所以，饼干要变大。
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;

        }

        return child;
    }
}
