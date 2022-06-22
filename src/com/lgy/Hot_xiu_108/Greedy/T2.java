package com.lgy.Hot_xiu_108.Greedy;

/**
 * T2. 跳跃游戏
 *
 https://leetcode.cn/problems/jump-game/
 * @author LGY
 * @create 2022-06-22 10:46
 */
public class T2 {

    /**
     * 贪心算法
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {

        int len = nums.length;
        int res = 0;
        for(int i = 0; i < len-1; i++){
            res = Math.max(res,i+nums[i]);
            if(res <=i){
                return false;
            }

        }
        return true;


    }
}
