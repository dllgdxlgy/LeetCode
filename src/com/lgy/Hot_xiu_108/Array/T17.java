package com.lgy.Hot_xiu_108.Array;

/**
 *
 * 17. 旋转数组
 *
 https://www.nowcoder.com//practice/e19927a
 8fd5d477794dac67096862042?tpId=190&&tqId=36253&rp=
 1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-10 14:53
 */
public class T17 {

    /**
     * 自己做的，不过比较多次数比较多
     * @param n
     * @param m
     * @param a
     * @return
     */
    public int[] solve (int n, int m, int[] a) {
        // write code here
        int index = m % n;

        for(int i = 0; i < index; i++ ){
            swap(a);
        }
        return a;
    }

    public void swap(int[] arr){
        int start = 0;
        int end = arr.length;

        int temp = arr[end-1];

        for(int i = end-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }


    /**
     * 推荐的算法，分三步：
     * 1. 将所有的数组进行反转
     * 2. 将0-index-1进行反转
     * 3. 将index- a.length-1 进行反转
     * @param n
     * @param m
     * @param a
     * @return
     */
    public int[] solve_2 (int n, int m, int[] a) {
        // write code here
        int index = m % n;

        swap(a,0,a.length-1);
        swap(a,0,index-1);
        swap(a,index,a.length-1);
        return a;
    }

    public void swap(int[] arr,int start,int end ){
        int left = start;
        int right = end;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
