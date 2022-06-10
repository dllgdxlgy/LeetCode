package com.lgy.Hot_xiu_108.Array;

/**
 * 16. 数组中的逆序对
 *
 https://www.nowcoder.com//practice/96bd6684e04a44eb
 80e6a68efc0ec6c5?tpId=190&&tqId=35588&rp=1&ru=/act
 ivity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-10 11:38
 */
public class T16 {


    /**
     * 有一个测试用例没通过，时间复杂度可能高了。
     * @param array
     * @return
     */
    public int InversePairs(int [] array) {
        int count = 0;
        int len = array.length;

        for(int i = len -1; i > 0; i-- ){
            int left = 0;
            int right = i-1;
            while(left < right){
                if(array[left] > array[i])count++;
                if(array[right]>array[i])count++;
                left++;
                right--;
            }
            if(left == right && array[right]>array[i])count++;
        }
        return count;
    }


    // 方法二：推荐的方法

    int count = 0;
    public int reversePairs(int[] nums){
        merge(nums,0,nums.length-1);
        return count;
    }

    public void merge(int[] nums,int left,int right){

        int mid = left + ((right - left)>>1);

        if (left < right){
            merge(nums,left,mid);
            merge(nums,mid+1,right);

            mersort(nums,left,mid,right);
        }
    }

    public void mersort(int[] nums,int left,int mid, int right){
        int[] temparr = new int[right-left+1];

        int index = 0;
        int temp1 = left;
        int temp2 = mid + 1;

        while (temp1 <= mid && temp2 <= right){
            if(nums[temp1] <= nums[temp2]){
                temparr[index] = nums[temp1];
                index++;
                temp1++;
            }else {
                count += (mid - temp1 + 1);
                count = count % 1000000007;
                temparr[index] = nums[temp2];
                index++;
                temp2++;
            }
        }

        while (temp1 <= mid ){
            temparr[index] = nums[temp1];
            index++;
            temp1++;
        }

        while (temp2 <= right ){
            temparr[index] = nums[temp2];
            index++;
            temp2++;
        }

        for (int k = 0; k < temparr.length; k++){
            nums[k+left] = temparr[k];
        }
    }
}
