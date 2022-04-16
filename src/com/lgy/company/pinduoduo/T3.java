package com.lgy.company.pinduoduo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-10 20:00
 */
public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] selected = new int[N];
        for (int i = 0; i < N; i++) {
            selected[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[][] choose = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                choose[i][j] = scanner.nextInt();
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int select: selected) {
            set.add(select);
        }
        for (int i = 0; i < q; i++) {
            System.out.println(result(choose[i][0],choose[i][1],set));
        }
    }

    private static int result(int start, int end, HashSet<Integer> set) {
        int res = -1;
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)){
                res = i;
                set.add(res);
                break;
            }
        }
        return res;
    }
}
