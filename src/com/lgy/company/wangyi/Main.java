package com.lgy.company.wangyi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-16 14:58
 */
public class Main {
        static List<List<Integer>> res = new LinkedList<>();
        static LinkedList<Integer> array = new LinkedList<>();
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            sc.close();
            Main constructArray = new Main();
            // ConstructArray constructArray = new ConstructArray();
            constructArray.construct(n, k, x, 0, 1);
            if(res.size() == 0) System.out.println(-1);
            for(List<Integer> arr:res){
                System.out.println(arr.toString());
            }
        }
        public void construct (int n, int k, int x, int sum, int index){
            if (array.size() == n && sum == x){
                res.add(new LinkedList<>(array));
                return;
            }
            if (res.size() == 1) return;
            for(int i = index; i<= k; i++){
                if(sum > x) return;
                if(array.contains(i)) continue;
                array.add(i);
                sum += i;
                construct(n, k, x, sum, i+1);
                array.removeLast();
                sum -= i;
            }
        }


}
