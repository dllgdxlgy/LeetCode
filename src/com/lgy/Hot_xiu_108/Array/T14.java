package com.lgy.Hot_xiu_108.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *14.数组中的最长连续子序列,要求时间复杂度为 O(n)
 *
 *
 https://www.nowcoder.com//practice
 /eac1c953170243338f941959146ac4bf?tpId=190&&tqId=3
 5393&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking

 * @author LGY
 * @create 2022-06-10 10:20
 */
public class T14 {


    /**
     * 推荐这种做法，只有有着一种时间复杂度为 O(n)
     * @param arr
     * @return
     */
    public int MLS (int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int res = 0;
        for (int num: set) {
            if(!set.contains(num-1)){

                int currentNum = num;
                int currentStraek = 1;
                while (set.contains(currentNum+1)){
                    currentNum++;
                    currentStraek++;
                }
                res = Math.max(res,currentStraek);
            }
        }
        return res;
    }


    /**
     *自己做的
     * @param arr
     * @return
     */
    public int MLS_0 (int[] arr) {
        // 获取数组的长度
        int len = arr.length;
        //利用 set
        Set<Integer> set = new HashSet<>();
        //放入 set，自动去重
        for(int i = 0; i < len; i++){
            set.add(arr[i]);
        }

        //转为 Integer 数组
        Integer[] no_arr  =  set.toArray(new Integer[set.size()]);
        // 转为 int 数组
        int[] array = Arrays.stream(no_arr).mapToInt(Integer::intValue).toArray();

        //再排序
        Arrays.sort(array);
        // 获取新的长度
        len = array.length;

        //左右指针，其实只有一个指针也行，也就是只有一个右指针也行
        int res = 1;
        int left = 0;
        int right = 1;
        int max_val = 1;

        while(right < len){
            if((array[right]-array[left])==1) {
                res++;
                left++;
                right++;
                max_val = Math.max(res, max_val);
                continue;
            }else {
                res = 1;
                left = right;
                right++;
            }
        }

        return max_val;
    }

    /**
     * 只有一个右指针的情况 ，还是利用了set 集合
     * @param arr
     * @return
     */
    public int MLS_2 (int[] arr) {
        // write code here
        int len = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++){
            set.add(arr[i]);
        }

        Integer[] no_arr  =  set.toArray(new Integer[set.size()]);
        int[] array = Arrays.stream(no_arr).mapToInt(Integer::intValue).toArray();
        Arrays.sort(array);
        len = array.length;
        int res = 1;
        int right = 1;
        int max_val = 1;

        while(right < len){
            if((array[right]-array[right-1])==1) {
                res++;
                right++;
                max_val = Math.max(res, max_val);
                continue;
            }else {
                res = 1;
                right++;
            }
        }
        return max_val;
    }

    /**
     * 推荐使用
     *
     * 不用去重，直接排序后选
     * @param arr
     * @return
     */
    public int MLS_3 (int[] arr) {
        // write code here
        // 先进行排序
        Arrays.sort(arr);
        int len = arr.length;
        int res = 1;
        int max_val = 1;

        for(int i = 1; i < len; i++){
            if(arr[i]-arr[i-1] == 1){
                res++;
                max_val = Math.max(res,max_val);
            }else if(arr[i]==arr[i-1]){
                continue;
            }else{
                res=1;
            }
        }
        return max_val;
    }
}
