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

    public int maxProduct(int[] nums) {

        int[] max_arr = new int[nums.length];
        int[] min_arr = new int[nums.length];
        max_arr[0] = nums[0];
        min_arr[0] = nums[0];
        int res = nums[0];

        for(int i = 1 ;i < nums.length;i++){
            int max = Math.max(max_arr[i-1]*nums[i],min_arr[i-1]*nums[i]);
            max_arr[i] = Math.max(max,nums[i]);
            int min = Math.min(max_arr[i-1]*nums[i],min_arr[i-1]*nums[i]);
            min_arr[i] = Math.min(min,nums[i]);
            res = Math.max(max_arr[i],min_arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,-2,4};
        T19 t19 = new T19();
        int i = t19.maxProduct(arr);
    }
}


