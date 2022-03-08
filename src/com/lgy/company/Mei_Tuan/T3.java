package com.lgy.company.Mei_Tuan;

import java.util.Arrays;
import java.util.Scanner;

//某比赛已经进入了淘汰赛阶段,已知共有n名选手参与了此阶段比赛，他们的得分分别是a_1,a_2….a_n,小美作为比赛的裁判希望设定一个分数线m，使得所有分数大于m的选手晋级，其他人淘汰。
//但是为了保护粉丝脆弱的心脏，小美希望晋级和淘汰的人数均在[x,y]之间。
//显然这个m有可能是不存在的，也有可能存在多个m，如果不存在，请你输出-1，如果存在多个，请你输出符合条件的最低的分数线。
//数据范围：1<=n<=50000,1<=x<=y<=n
//进阶：时间复杂度，空间复杂度
//描述输入：输入第一行仅包含三个正整数n,x,y，分别表示参赛的人数和晋级淘汰人数区间。(1<=n<=50000,1<=x,y<=n)
//        输入第二行包含n个整数，中间用空格隔开，表示从1号选手到n号选手的成绩。(1<=|a_i|<=1000)
//描述输出：输出仅包含一个整数，如果不存在这样的m，则输出-1，否则输出符合条件的最小的值。
//
//输入例子：
//6 2 3
//1 2 3 4 5 6
//输出例子
//3
public class T3 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        int res =  t3.Judge_promotion(arr,n,x,y);
        System.out.println(res);

    }

    public int Judge_promotion(int[] arr, int n, int x, int y){
        if (n<=x*2 || n>=y*2){
            return -1;
        }
        if (x*2<= n && n <= x+y){
            return arr[x-1];
        }else if (n == 2*y){
            return arr[y-1];
        }


        return 0;
    }
}
