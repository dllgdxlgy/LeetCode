package com.lgy.company.Mei_Tuan;

import java.util.HashSet;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/test/question/0bb89af1aa2844df86d97ff80b94fd08?pid=28665326&tid=54030262
 */
public class T9 {
    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        int small = scanner.nextInt();
        int big = scanner.nextInt();
        HashSet set = new HashSet();
        for (int i = small; i <=big ; i++) {

            int A = i/100000;
            int B = (i % 100000)/10000;
            int C = (i % 10000)/1000;
            int D = (i % 1000)/100;
            int E = (i % 100)/10;
            int F = i % 10;
            set.add(A);
            set.add(B);
            set.add(C);
            set.add(D);
            set.add(E);
            set.add(F);
            int AB = A*10 +B;
            int CD= C*10 +D;
            int EF = E*10 +F;
            if (set.size() == 6 && (AB+CD) == EF){
                size++;
            }
            set.clear();

        }
        System.out.println(size);
    }


}
