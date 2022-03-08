package com.lgy.company.Zi_Jie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().trim().split("");
        int n = Integer.parseInt(strings[0]);
        int d = Integer.parseInt(strings[1]);

        for (int i = 0; i < n-d; i++) {

        }
    }
}
