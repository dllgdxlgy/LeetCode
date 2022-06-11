package com.lgy.Hot_xiu_108.Array;

/**
 * 20. 调整数组顺序使奇数位于偶数前面(一)
 https://www.nowcoder.com//practice/ef1f53ef31ca408cada5093c8780f44b?
 tpId=190&&tqId=35985&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking

 * @author LGY
 * @create 2022-06-11 16:29
 */
public class T20 {

    /**
     * 自己做的
     * @param array
     * @return
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        int len = array.length;
        int[] arr = new int[len];
        int index = 0;
        for(int i = 0; i < len;i++){
            if((array[i] % 2) == 1){
                arr[index] = array[i];
                index++;
            }
        }
        for(int j= 0; j<len;j++){
            if((array[j] % 2) == 0){
                arr[index] = array[j];
                index++;
            }
        }
        return arr;
    }
}
