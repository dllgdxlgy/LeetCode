package com.lgy.Hot_xiu_108.Double_pointer;

/**
 * T2. NC22 合并两个有序的数组
 https://www.nowcoder.com/practice/89865d4375634fc484f3a24b7fe65665?tpId=190&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&dif
 ficulty=&judgeStatus=&tags=&title=%E5%90%88%E5%B9%B6&sourceUrl=&gioEnter=menu
 * @author LGY
 * @create 2022-07-01 23:47
 */
public class T2 {


    public void merge(int A[], int m, int B[], int n) {
        int A_r = m-1;
        int B_r = n-1;
        int index = A.length-1;

        while(A_r >= 0 && B_r >= 0){
            if(A[A_r] > B[B_r]){
                A[index] = A[A_r];
                A_r--;
            }else{
                A[index] = B[B_r];
                B_r--;
            }
            index--;
        }
        while(B_r >=0){
            A[index] = B[B_r];
            B_r--;
            index--;
        }
    }
}
