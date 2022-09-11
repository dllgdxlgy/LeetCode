package com.lgy.company.jianxinhuyu;

/**
 * @author LGY
 * @create 2022-09-11 09:31
 */
public class T2 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param m  int整型 水池容量
     * @param t  int整型 总时长
     * @param m1 int整型 进水阀打开时每分钟进水量
     * @param t1 int整型 进水阀开关切换时长
     * @param m2 int整型 排水阀打开时每分钟排水量
     * @param t2 int整型 排水阀开关切换时长
     * @return int整型
     */
    public int ComputeRemanentWater(int m, int t, int m1, int t1, int m2, int t2) {

        if(t2 <= t1 && m2 >=m1){
            return 0;
        }
        // write code here
        int jin = 0;

        //次数
        int a = t / (t1 * 2);
        jin += a * m1;
        //取余
        int b = t % (t1 * 2);

        jin += Math.min(b, m1) * t;

        int chu = 0;
        int c = t/(t2 *2);
        chu += c * m2;
        int d = t % (t2 *2);
        chu += Math.min(d,m2) *t;

        if(jin <= chu){
            return  0;
        }else if (jin > (chu +m)){
            return m;
        }else {
            return jin-chu;
        }


    }


}
