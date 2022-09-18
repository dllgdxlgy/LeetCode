package com.lgy.company.bolekeji;

/**
 * @author LGY
 * @create 2022-09-18 19:02
 */
public class T1 {

    int[] res = new int[2];

    public int[] GetLocation(int m, int n, int x, int y, int[] dirs) {
        // write code here
        int[][] arr = new int[m][n];
        res[0] = x;
        res[1] = y;
        dfs(arr, x, y, dirs,0);
        return res;
    }

    public void dfs(int[][] arr, int i, int j, int[] dirs,int index) {
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length){
            dfs(arr,i,j,dirs,index+1);
        }
        if(index == dirs.length){
            res[0] = i;
            res[1] = j;
            return;
        }
        for (int k = index; k < dirs.length; k++) {
            if(dirs[k] == 0){
                dfs(arr,i,j,dirs,k+1);
            }
            if(dirs[k] == 1){
                dfs(arr,i-1,j,dirs,k+1);

            }
            if(dirs[k] == 2){
                dfs(arr,i,j+1,dirs,k+1);

            }
            if(dirs[k] == 3){
                dfs(arr,i+1,j,dirs,k+1);

            }
            if(dirs[k] == 4){
                dfs(arr,i,j-1,dirs,k+1);

            }
        }

    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        int[] ints = t1.GetLocation(4, 4, 2, 3, new int[]{0, 1, 1, 2, 3, 4, 0});
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
