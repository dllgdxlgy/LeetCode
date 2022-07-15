package com.lgy.CodeTop_100;

/**
 * @author LGY
 * @create 2022-07-14 18:43
 */
public class T88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1_right = m-1;
        int nums2_right = n-1;
        if(nums1_right < 0){
            for(int i = 0;i<n;i++){
                nums1[i] = nums2[i];
            }
        }


        int index = nums1.length-1;
        while(nums1_right >=0 && nums2_right >= 0){
            if(nums1[nums1_right]>=nums2[nums2_right]){
                nums1[index] = nums1[nums1_right];
                nums1_right--;
            }else{
                nums1[index] = nums2[nums2_right];
                nums2_right--;

            }
            index--;
        }

        for(int i=0;i<=nums2_right;i++){
            nums1[i] = nums2[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{1};
        T88 t88 = new T88();
        t88.merge(arr1,0,arr2,1);

    }
}
