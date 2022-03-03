package com.lgy.company.Zi_Jie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 分蛋糕
 */
public class T1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int[] arr = new int[a];
        BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 =  br_1.readLine().trim().split(" ");
        for (int i = 0; i < a ; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }

        int[] temp = new int[b];
        int sum = 0,number=0;
        for (int j = 0; j <= arr.length-b; j++ ) {
            System.arraycopy(arr,j,temp,0,b);
            for (int num: temp) {
                sum += num;
            }
            if (sum>number){
                number =sum;
            }
            sum = 0;
        }
        System.out.println(number);
    }
    //https://www.programminghunter.com/article/2604242734/
    /**
     37                  * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     38                  * 将指定源数组(src)中的数组从指定位置(srcPos)复制到目标数组(dest)的指定位置(destPos到destPos+length)。
     39                  */
     //System.arraycopy(params,i,temp,0,m);
}
