package com.lgy.company.Mei_Tuan;

import java.util.*;

/**
 * @author LGY
 * @create 2022-08-06 10:05
 */
public class T1_for_KCJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 魔法石 的数量
        int n = scanner.nextInt();
        // 每一块魔法石的种类
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        //
        //
        for (int i = 0; i < n; i++) {
            int kind = scanner.nextInt();
            map.put(kind,map.getOrDefault(kind,0)+1);
        }

        for (int i = 0; i < n; i++) {
            int kind = scanner.nextInt();
            map1.put(kind,map1.getOrDefault(kind,0)+1);
        }
        scanner.close();

        Set<Integer> set = map.keySet();

        //数量值
        int num = n/2;
        if(n%2 == 1){
            num++;
        }
        int res = Integer.MAX_VALUE;
        for(int i : set){
            //map 中的数量
            int num_i = map.get(i);
            if(num_i >= num){
                System.out.println(0);
                return;
            }
            if(num_i < num && !map1.containsKey(i)){
                continue;
            }
            int Mapnum_i = map1.get(i);
            Mapnum_i+=num_i;
            if(Mapnum_i < num){
                continue;
            }else {
                res = Math.min(res,num-num_i);
            }

        }
        if(res > n){
            System.out.println(-1);
            return;
        }else {
            System.out.println(res);
            return;
        }
    }
}
