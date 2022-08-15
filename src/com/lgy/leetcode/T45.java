package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-15 09:58
 */
public class T45 {

    public int jump(int[] nums) {
        int curDistance = 0; // 当前覆盖的最大坐标
        int res = 0; // 步数
        int nextDistance = 0;// 下一步覆盖的最远距离下标
        for(int i = 0; i < nums.length-1;i++){
            nextDistance = Math.max(nextDistance,i+nums[i]);
            if(i == curDistance){
                curDistance = nextDistance;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,1,4};
        T45 t45 = new T45();
        int jump = t45.jump(arr);
        System.out.println(jump);

    }
}
