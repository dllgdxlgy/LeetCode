package com.lgy.company.niuke;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-10-16 11:11
 */
public class T1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int x = scanner.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, scanner.nextInt());
        }

        scanner.close();
        int num = 0;

        for(int key : map.keySet()){

            int temp = map.get(key);
            if(temp >= x){
                num += temp;
                continue;
            }
            int addtemp = temp + k -1;
            if(addtemp < x){
                continue;
            }else {

                num += x;
            }
        }
        System.out.println(num);
    }
}
