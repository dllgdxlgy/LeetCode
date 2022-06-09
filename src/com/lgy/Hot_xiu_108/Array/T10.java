package com.lgy.Hot_xiu_108.Array;

/**
 *10. 缺失的第一个正整数 (做起来比较费劲)
 https://www.nowcoder.com//practice/50ec6a5b0e4e45348544348278cdcee5?tpId=190&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjo
 b-code-high-rd%2Fquestion-ranking&difficulty=&judgeStatus=&tags=&title=%E6%AD%A3%E6%95%B4%E6%95%B0&sourceUrl=&gioEnter=menu
 * @author LGY
 * @create 2022-06-07 16:30
 */
public class T10 {


    /**
     * 参考答案的位置
     * https://leetcode.cn/problems/first-missing-positive/solution/tong-pai-xu-python-dai-ma-by-liweiwei1419/
     * @param nums
     * @return
     */
    public int minNumberDisappeared (int[] nums) {
        // write code here

        //获取数组的长度
        int len = nums.length;

        for(int i = 0; i < len; i++ ){
            // 注意这块：nums[nums[i]-1] != nums[i]
            while(nums[i] >= 1 && nums[i] <= len && nums[nums[i]-1] != nums[i] ){
                swap(nums,i,nums[i]-1);
            }
        }

        for(int i = 0; i< len;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return len+1;
    }

    public void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }



}
