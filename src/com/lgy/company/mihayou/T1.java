package com.lgy.company.mihayou;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-14 20:23
 */
public class T1 {

    //mihoyoyomihoyomimihoyo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
//        System.out.println(s);
        ArrayList<int[]> arrayList = new ArrayList<>();

        String target = "mihoyo";

        for (int i = 0; i <= s.length() - 6; i++) {
            if (s.substring(i, i + 6).equals(target)) {
                int[] a = new int[]{i, i + 5};
                arrayList.add(a);
            }
        }
//        for (int[] a: arrayList){
//            System.out.print(a[0]);
//            System.out.print(" ");
//            System.out.println(a[1]);
//        }
        if(k > arrayList.size()){
            System.out.println(-1);
            return;
        }else {

            int[] res = new int[]{0,Integer.MAX_VALUE};
            for (int i = k-1; i < arrayList.size(); i++) {
                int cha1 = res[1]-res[0];
                int max_num = arrayList.get(i)[1];
                int small_num = arrayList.get(i+1-k)[0];
                int cha = max_num-small_num;
                if(cha<cha1){
                    res[0] = small_num;
                    res[1] = max_num;
                }
            }
            System.out.println(res[0]+" "+res[1]);
        }
    }
}
