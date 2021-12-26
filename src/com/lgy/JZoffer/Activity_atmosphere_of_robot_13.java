package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2021-12-26 12:03
 */
public class Activity_atmosphere_of_robot_13 {


    //    /**
//     *  此种方法没有进行可达性分析
//     * @param m
//     * @param n
//     * @param k
//     * @return
//     */
//    public int movingCount(int m, int n, int k) {
//
//        int num = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((process_Mumber(i)+process_Mumber(j) )<= k){
//                    ++num;
//                }
//            }
//        }
//        return num;
//    }

    int m,n,k;
    boolean[][] visited;


    /**
     *
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        //赋值
        this.m = m;this.n = n;this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0,0);
    }

    /**
     *
     * @param i
     * @param j
     * @return
     */
    public int dfs(int i, int j){

        int sumi = process_Mumber(i);
        int sumj = process_Mumber(j);
        if (i >= m || j>=n ||(sumi+sumj)>k || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1+dfs(i+1,j)+dfs(i,j+1);
    }

    /**
     * 此方法只能处理两位数的 number
     *
     * @param number
     * @return
     */
    public int process_Mumber(int number) {
        int s = number / 10;
        int g = number % 10;
        int sum = s + g;
        return sum;
    }

    public static void main(String[] args) {
        Activity_atmosphere_of_robot_13 a = new Activity_atmosphere_of_robot_13();
        int mub = a.movingCount(16, 8, 4);
        System.out.println(mub);
    }
}
