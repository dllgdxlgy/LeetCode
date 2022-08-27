package com.lgy.company.Other;

import com.lgy.company.leetcodecom.T;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;

/**
 * @author LGY
 * @create 2022-08-26 19:44
 */
public class T1_yuanfudao {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int K = sc.nextInt();
            int l = sc.nextInt();
            int[] arr = new int[l];
            for (int j = 0; j < l; j++) {
                arr[j] = sc.nextInt();
            }
            HashMap<Integer,Integer> need = T1_yuanfudao.zhiyinzi(K);
            HashMap<Integer,Integer> window = new HashMap<>();
            int left = 0;
            int right = 0;
            int v = 0;
            int start = 0;
            int len = Integer.MIN_VALUE;
            while(right < l){
                int temp = arr[right];
                right++;
                window.put(temp,window.getOrDefault(temp,0)+1);

                if(need.containsKey(temp)){
                    window.put(temp,window.get(temp)+1);
                    if(window.get(temp).intValue() == need.get(temp)){
                        v++;
                    }
                }
                while (v == need.size()) {
                    // 在这里更新最小覆盖子串
                    if (right - left < len) {
                        start = left;
                        len = right - left;
                    }
                    // d 是将移出窗口的字符
                    int d = arr[left];
                    // 缩小窗口
                    left++;
                    // 进行窗口内数据的一系列更新
                    if (need.containsKey(d)) {
                        if (window.get(temp).intValue() == need.get(temp))
                            v--;
                        window.put(d,window.get(d)-1);
                    }
                }
            }

            System.out.println(len-start);

        }
    }

    public static HashMap<Integer, Integer> zhiyinzi(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int k = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                map.put(i,map.getOrDefault(i,0)+1);

                int e = 0;
                while (n % i == 0) {
                    n /= i;
                    e++;
                }
                if (e % 2 != 0) {
                    k *= i;
                }
            }
        }
        if (n != 1){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        return map;
    }

}
