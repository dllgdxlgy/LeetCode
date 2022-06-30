package com.lgy.Hot_xiu_108.Double_pointer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * T9. 滑动窗口的最大值
 https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788?tpId=190&&tqId=35991&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-30 18:00
 */
public class T9 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = size-1;i < num.length;i++){
            list.add(maxint(num,i-size+1,i));
        }
        return list;
    }
    public int maxint(int[] arr,int start,int end){
        int max = arr[start];
        for(int i = start+1; i <= end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        T9 t9 = new T9();
        int[] arr = new int[]{2,3,4,2,6,2,5,1};
        ArrayList<Integer> list = t9.maxInWindows_1(arr, 3);
        for (Integer i:
            list ) {
            System.out.println(i);
        }
        Integer[] objects = (Integer[]) list.toArray();
    }


    /**
     * 自己做的
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows_1(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = num[0];
        for(int i = 1; i < size; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        list.add(max);
        for(int i = size;i < num.length;i++){
            if(num[i] > max ){
                list.add(num[i]);
                max = num[i];
            }else{
                list.add(list.get(list.size()-1));
            }
        }
        return list;
    }
}
