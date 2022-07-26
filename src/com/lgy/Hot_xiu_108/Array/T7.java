package com.lgy.Hot_xiu_108.Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 7. 数组中出现次数超过一半的数字
 * https://www.nowcoder.com//
 * practice/e8a1b01a2df14cb2b228b30ee6a92
 * 163?tpId=190&&tqId=35371&rp=1&ru=/activity/
 * oj&qru=/ta/job-code-high-rd/question-ranking
 *
 * @author LGY
 * @create 2022-06-07 15:24
 */
public class T7 {


    /**
     * 推荐的做法
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution_2(int[] array) {

        int x = 0;
        int voit = 0;
        for (int i = 0; i < array.length; i++) {
            if (voit == 0) {
                x = array[i];
            }
            voit += array[i] == x ? 1 : -1;
        }
        return x;
    }

    /**
     * 自己做的
     *
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int r = array.length;
        return array[r / 2];
    }

    /**
     * 借助 HashMap
     *
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution_1(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = array.length;
        for (int i = 0; i < len; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        for (Integer t : map.keySet()) {
            if (map.get(t) > len / 2) {
                return t.intValue();
            }
        }
        return -1;
    }



}
