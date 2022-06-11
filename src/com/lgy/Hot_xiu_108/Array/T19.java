package com.lgy.Hot_xiu_108.Array;

/**
 * 19. 子数组最大乘积
 *
 https://www.nowcoder.com//practice/9c158345c867466293fc413cff570356?t
 pId=190&&tqId=35206&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-10 17:59
 */
public class T19 {

    /**
     * 动态规划
     * @param arr
     * @return
     */
    public double maxProduct(double[] arr) {
        double min = arr[0];
        double max = arr[0];
        double res = min;
        for(int i = 1; i < arr.length; i++){
            double t_max = max;
            max =Math.max( Math.max(arr[i],arr[i]*max),min* arr[i]);
            min = Math.min(Math.min(arr[i],arr[i] * min),t_max * arr[i]);

            res = Math.max(res,max);
        }
        return res;

    }
}


