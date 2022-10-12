package com.lgy.company.qunawang;

import com.lgy.company.leetcodecom.T;

/**
 * @author LGY
 * @create 2022-10-12 18:46
 */
public class T1 {
    public int compareVersion(String version1, String version2) {
        char[] arr = version1.toCharArray();
        for(int i = 0; i < version1.length(); i++){
            if(version1.charAt(i) == '.'){
                arr[i] = ' ';
            }
        }
        char[] arr1 = version2.toCharArray();
        for(int i = 0; i < version2.length(); i++){
            if(version2.charAt(i) == '.'){
                arr1[i] = ' ';
            }
        }
        String s = String.copyValueOf(arr);
        String s1 = String.copyValueOf(arr1);
        String[] split = s.trim().split(" ");
        String[] split1 = s1.trim().split(" ");

        int len = Math.min(split.length, split1.length);

        for (int i = 0; i < len && i!=3; i++) {
            int n = Integer.parseInt(split[i]);
            int m = Integer.parseInt(split1[i]);
            if(n>m){
                return 1;
            }else if(n<m){
                return  -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s1 = "1 1 1 Final";
        String s2 = "1.0.1.Final";
        T1 t1 = new T1();
        int i = t1.compareVersion(s1, s2);
        System.out.println(i);

    }
}
