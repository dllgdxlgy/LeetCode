package com.lgy.Hot_xiu_108.Binary_search;

/**
 * T7. 二分查找-II
 https://www.nowcoder.com/practice/4f470d1d3b734f8aaf2afb014185b395?t
 pId=190&&tqId=35227&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-02 17:32
 */
public class T7 {


    public int search (int[] nums, int target) {
        // write code here
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while(left <= right){
            int temp = (left + right)/2;
            if(nums[temp] == target){
                index = temp;
                while(index >=0 && nums[index] == target){
                    index--;
                }
                return index+1;
            }else if(nums[temp] < target){
                left = temp+1;
            }else{
                right = temp-1;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        T7 t7 = new T7();
        int search = t7.search(new int[]{-2, 1, 2}, -2);
    }


}
