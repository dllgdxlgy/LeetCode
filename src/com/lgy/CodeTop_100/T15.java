package com.lgy.CodeTop_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T15 三数之和
 * @author LGY
 * @create 2022-07-15 14:22
 */
public class T15 {

    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> listList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                return listList;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int L = i + 1, R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
//                   Arrays.asList(nums[i],nums[L],nums[R]);
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    listList.add(list);//将三元组加入到 listList
                    while (L < R && nums[L + 1] == nums[L]) ++L;
                    while (L < R && nums[R - 1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if (sum < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }
        return listList;
    }
}
