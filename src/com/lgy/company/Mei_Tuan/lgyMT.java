package com.lgy.company.Mei_Tuan;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-20 22:16
 */
public class lgyMT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        System.out.println(merge(A, B));
    }

    public static String merge(String a, String b) {
        // 将接收的字符串转换为字符数组
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        //定义长度
        int mClength = aChar.length * 2;
        //定义一个字符数组并给一个长度
        char[] mixChar = new char[mClength];
        for (int i = 0; i < aChar.length; i++) {
            mixChar[i * 2] = aChar[i];
            mixChar[i * 2 + 1] = bChar[i];
        }
        return String.valueOf(mixChar);
    }

}
