package com.lgy.company.qunawang;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-10-12 19:33
 */
public class T3 {

    public String showDown(String inHand) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 14);
        map.put("K", 13);
        map.put("Q", 12);
        map.put("J", 11);
        map.put("10", 10);
        map.put("9", 9);
        map.put("8", 8);
        map.put("7", 7);
        map.put("6", 6);
        map.put("5", 5);
        map.put("4", 4);
        map.put("3", 3);
        map.put("2", 2);
        String[] arr = inHand.trim().split(" ");
        int len = arr.length;
        char[] chars = new char[len];
        int[] arr_num = new int[len];

        for (int i = 0; i < len; i++) {
            chars[i] = arr[i].charAt(0);
            String temp = arr[i].substring(1);
            arr_num[i] = map.get(temp);
        }

        Arrays.sort(arr_num);


        int duishu = 0;
        int santiao = 0;
        int shunzi = 0;
        int tonghua = 0;
        int sitiao = 0;

        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map1.put(arr_num[i], map1.getOrDefault(arr_num[i], 0) + 1);
        }

        for (int key : map1.keySet()) {
            int temp = map1.get(key);
            if (temp == 2) {
                duishu++;
            } else if (temp == 3) {
                santiao++;
            } else if (temp == 4) {
                sitiao++;
            }
        }
        if (sitiao == 1) {
            return "SiTiao";
        }
        if (duishu == 1 && santiao == 1) {
            return "HuLu";
        }
        if (santiao == 1 && duishu == 0) {
            return "SanTiao";
        }
        if (duishu == 2) {
            return "LiangDui";
        }
        if (duishu == 1) {
            return "YiDui";
        }


        return "YiDui";
    }

    public static void main(String[] args) {
        T3 t3 = new T3();
        String s = t3.showDown("SA SK SQ SJ S10 H10 C9");
        System.out.println(s);

    }
}
