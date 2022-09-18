package com.lgy.company.DiDi;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-17 15:24
 */
public class T1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        int index = -1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != '?') {
                break;
            }
            index = i;
        }
        int temp = len;
        for (int i = len - 1; i >= 0; i--) {
            if(s.charAt(i)!='?'){
                break;
            }
            temp = i;
        }

        if (index != -1) {
            for (int i = 0; i < temp; i++) {
                if (i % 2 == 0) {
                    stringBuilder.append(1);
                } else {
                    stringBuilder.append(0);
                }
            }
        } else {
            for (int i = 0; i < temp; i++) {
                if (s.charAt(i) != '?') {
                    stringBuilder.append(s.charAt(i));
                } else {
                    int a = s.charAt(i - 1) - '0';
                    int b = s.charAt(i + 1) - '0';
                    if (a != 0 && b != 0) {
                        stringBuilder.append(0);
                    } else if (Math.pow(a, b) == 1) {
                        stringBuilder.append(Math.max(a, b) + 1);
                    } else {
                        stringBuilder.append(Math.min(a, b) + 1);
                    }
                }
            }
        }

        if(temp == len){
            System.out.println(stringBuilder.toString());
            return;
        }

    }
}
