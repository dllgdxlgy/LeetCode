package com.lgy.Hot_xiu_108.Array;

/**
 *
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
}
