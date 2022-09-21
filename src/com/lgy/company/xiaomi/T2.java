package com.lgy.company.xiaomi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-20 19:32
 */
public class T2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (scanner.hasNextInt()) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println(1);
        for (int a: arrayList) {

            System.out.print(a);
        }
    }
}
