package com.lgy.Hot_xiu_108.Binary_search;

/**
 * T4. 在两个长度相等的排序数组中找到上中位数
 https://www.nowcoder.com/practice/6fbe70f3a51d44fa9395cfc49694404f?tpId=190&&tqId=352
 16&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-02 16:25
 */
public class T4 {


    /**
     * 原答案说的是可以
     * @param arr1
     * @param arr2
     * @return
     */
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        // write code here
        int index_1 = 0;
        int index_2 = 0;

        int arr1_l = arr1.length;
        int arr2_l = arr2.length;

        int mid_index = (arr2_l+arr1_l)%2 == 1?(arr2_l+arr1_l)/2+1 : (arr2_l+arr1_l)/2;

        // 记录次数
        int index = 0;
        int res = Math.min(arr1[0],arr2[0]);

        while(index_1 < arr1_l && index_2 < arr2_l){
            if(arr1[index_1] <= arr2[index_2]){
                res = arr1[index_1];
                index_1++;
            }else{
                res = arr2[index_2];
                index_2++;
            }
            index++;
            if(index == mid_index){
                return res;
            }
        }

        //完全没必要，因为不会遍历完一个数组后，还需要再另一个数组中选。直接省略这部分就行了。

//        // 当arr2走完的时候，arr1还没走完，此时上中位数则在arr1中
//        if(index != mid_index-1 && index1 < len1){
//            // mid_index-1-index为index1离上中位数的距离，所以直接定位到上中位数
//            return arr1[index1 + mid_index-1-index];
//            //当arr1走完的时候，arr2还没走完，此时上中位数则在arr2中
//        }else{
//            // mid_index-1-index为index2离上中位数的距离，所以直接定位到上中位数
//            return arr2[index2 + mid_index-1-index];
//        }
        return res;

    }
}
