package com.lgy.Hot_100;

/**
 * @author LGY
 * @create 2022-02-16 20:35
 */
public class T11 {
    public int maxArea(int[] height) {

        // 要返回的值
        int res = 0;
        int res_v;
        int l = 0, r = height.length-1;
        while (l != r) {
            res_v = (r-l)*Math.min(height[l],height[r]);
            res = Math.max(res,res_v);
            if (height[l]<=height[r]){
                l++;
            }else {
                r--;
            }

        }

        return res;
    }
}
