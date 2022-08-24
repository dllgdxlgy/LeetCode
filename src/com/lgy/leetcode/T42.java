package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-24 15:52
 */
public class T42 {

    public int trap(int[] height) {
        int res = 0;
        for(int i = 1; i < height.length-1; i++){
            int lright = height[i];
            int rright = height[i];

            for(int j = i+1;j<height.length;j++){
                if(height[j] > rright){
                    rright = height[j];
                }
            }
            for(int j = i-1;j >=0;j--){
                if(height[j] > lright){
                    lright = height[j];
                }
            }

            int h = Math.min(lright,rright)-height[i];
            if(h>0){
                res+=h;
            }
        }
        return res;

    }
}
