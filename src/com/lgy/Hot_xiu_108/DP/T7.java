package com.lgy.Hot_xiu_108.DP;

/**
 * 7. 子数组最大乘积
 *
 https://www.nowcoder.com/practice/9c158345c867466293fc413cff570356?tpId=188&&tq
 Id=38334&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-19 21:03
 */
public class T7 {


    /**
     *
     * @param arr
     * @return
     */
    public double maxProduct(double[] arr) {
        int len = arr.length;
        if(len == 0){
            return 0.00000;
        }
        double res = arr[0];
        double[][] dp = new double[len][2];
        dp[0][0] = arr[0];
        dp[0][1] = arr[0];
        for(int i = 1; i < len;i++){
            double max = Math.max(dp[i-1][0]*arr[i],dp[i-1][1]*arr[i]);
            double min = Math.min(dp[i-1][0]*arr[i],dp[i-1][1]*arr[i]);

            dp[i][0] =max > arr[i] ? max:arr[i] ;
            dp[i][1] = min < arr[i]?min:arr[i];
            res =Math.max(dp[i][0],res);
        }


        return res;

    }
}
