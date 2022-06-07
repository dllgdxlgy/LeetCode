package com.lgy.Hot_xiu_108.Array;

/**
 *4. 三数之和
 *
 https://www.nowcoder.com//pra
 ctice/345e2ed5f81d4017bbb8cc6055b0b
 711?tpId=190&&tqId=35196&rp=1&ru=/activit
 y/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-06 21:23
 */
public class T4 {


    /**
     * 两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        int len = nums.length-1;

        for(int i = 0; i< len; i++){
            int temp = target - nums[i];

            for(int j =i+1;j<=len;j++){

                if(temp == nums[j]){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
