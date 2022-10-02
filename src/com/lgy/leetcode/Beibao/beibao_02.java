package com.lgy.leetcode.Beibao;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-10-02 17:58
 */
public class beibao_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 物品的数量
        int n = scanner.nextInt();

        // 背包的大小
        int bageweight = scanner.nextInt();

        int[] weight = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        int[][] dp = new int[n][bageweight+1];

        // 初始化第一列，也就是dp[i][0],默认是初始化以后的，就是0；
        // 初始化第一行，第一行的也就是以 i为0 的物品(深刻理解 dp[i][j] 的意思)分别放到背包重量为 i 的背包中。

        for (int j = 0; j < bageweight+1; j++) {
            if(weight[0] <= j){
                dp[0][j] = values[0];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < bageweight + 1; j++) {
                if(weight[i] > j){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]] +values[i]);
                }
            }
        }
        System.out.println(dp[n-1][bageweight]);
    }
}
