package com.lgy.Hot_xiu_108.Array;

/**
 * 22.数字在升序数组中出现的次数
 * <p>
 * https://www.nowcoder.com//practice/70610bf967994b22bb1c26f9ae901fa2?tpId=190&&tqId
 * =35372&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 *
 * @author LGY
 * @create 2022-06-11 17:07
 */
public class T22 {

    /**
     * 看的答案，支持的做法
     *
     * @param array
     * @param k
     * @return
     */
    public int GetNumberOfK(int[] array, int k) {
        int l = binSearch(array, k);
        int r = binSearch(array, k + 1);

        return (l == array.length || array[l] != k) ? 0 : r - l;
    }

    public int binSearch(int[] array, int k) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (array[mid] >= k) {
                right = mid - 1;
            } else if (array[mid] < k) {
                left = mid + 1;
            }
        }
        return left;
    }


    /**
     * @param array
     * @param k
     * @return
     */
    public int GetNumberOfK_1(int[] array, int k) {
        int left = 0;
        int right = array.length - 1;
        int res = 0;
        int index = 0;
        while (left <= right) {
            int temp = (left + right) / 2;
            if (array[temp] == k) {
                index = temp;
                res++;
                break;
            }
            if (array[temp] >= k) {
                right = temp - 1;
            } else {
                left = temp + 1;
            }
        }
        left = index - 1;
        right = index + 1;
        while (left >= 0 && array[left] == k) {
            res++;
            left--;
        }
        while (right < array.length && array[right] == k) {
            res++;
            right++;
        }
        return res;
    }


    /**
     * 自己写的，效果不是很好
     *
     * @param array
     * @param k
     * @return
     */
    public int GetNumberOfK_2(int[] array, int k) {
        int len = array.length;
        int left = 0;
        int right = len - 1;
        int index = -1;
        int res = 0;
        while (left <= right) {
            int temp = (left + right) / 2;
            if (array[temp] == k) {
                index = temp;
                res++;
                break;
            } else if (array[temp] > k) {
                right = temp - 1;
            } else {
                left = temp + 1;
            }
        }
        if (index == -1) {
            return 0;
        }
        left = index - 1;
        right = index + 1;
        while (left >= 0 && array[left] == k) {
            res++;
            left--;
        }
        while (right < len && array[right] == k) {
            res++;
            right++;
        }
        return res;
    }
}
