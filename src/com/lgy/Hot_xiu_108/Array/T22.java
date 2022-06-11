package com.lgy.Hot_xiu_108.Array;

/**
 * 22.数字在升序数组中出现的次数
 *
 https://www.nowcoder.com//practice/70610bf967994b22bb1c26f9ae901fa2?tpId=190&&tqId
 =35372&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-11 17:07
 */
public class T22 {

    /**
     * 看的答案
     * @param array
     * @param k
     * @return
     */

    public int GetNumberOfK(int [] array , int k) {
        int l = binSearch(array,k);
        int r = binSearch(array,k+1);

        return (l==array.length || array[l]!=k)?0:r-l;
    }

    public int binSearch(int[] array,int k){
        int left = 0;
        int right = array.length;
        while(left <right){

            int mid = left+(right - left)/2;
            if(array[mid]>=k){
                right = mid;
            }else if(array[mid]<k){
                left = mid+1;
            }
        }
        return left;
    }
}
