package com.lgy.company.Zi_Jie;

import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        while (N-- >0){
            String s = scanner.nextLine();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i+2 < sb.length() ; i++) {
                char a = s.charAt(i);
                char b = s.charAt(i+1);
                char c = s.charAt(i+2);
                if (a == b && b == c){
                    sb.deleteCharAt(i+2);
                }

            }
            for (int i = 0; i + 3 < s.length(); i++) {
                char a = s.charAt(i);
                char b = s.charAt(i+1);
                char c = s.charAt(i+2);
                char d = s.charAt(i+3);
                if ((a == b && c == d)) {
                    sb.deleteCharAt(i+3);
                }


            }
            System.out.println(sb);
        }
    }
}
