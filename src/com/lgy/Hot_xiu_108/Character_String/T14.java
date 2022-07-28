package com.lgy.Hot_xiu_108.Character_String;

/**
 * 14. 大数乘法
 * @author LGY
 * @create 2022-06-15 11:29
 */
public class T14 {

    public static void main(String[] args) {
        T14 t14 = new T14();
        String solve = t14.solve("23", "45");
        System.out.println(solve);
    }


    /**
     *  大数乘积
     *
     * 经常面试
     * @param s
     * @param t
     * @return
     */
    public String solve (String s, String t) {
        // write code here

        //获取 两个 字符串长度
        int n_s = s.length();
        int n_t = t.length();

        //然后创建数组，并将字符转为整型
        int[] arr_s = new int[n_s];
        for(int i = 0; i < n_s; i++){
            arr_s[i] = s.charAt(i) - '0';
        }
        int[] arr_t = new int[n_t];
        for(int i = 0; i < n_t; i++){
            arr_t[i] = t.charAt(i) - '0';
        }

        //结果最长为长度的和，然后创建数组
        int[] res = new int[n_t + n_s];
        for(int i = 0; i < n_s; i++){
            for(int j = 0; j < n_t; j++){
                // 这里第一个给空出来，这里可以举例 11 * 99
                res[i+j+1] += arr_s[i] * arr_t[j];
            }
        }
        //这里主要是记录下一位的进位数，要从后向前计算
        int carry = 0;
        for(int i = res.length-1; i>=0; i--){
            int sum = carry + res[i]; // 计算总和
            res[i] = sum % 10; // 计算低位该存的数
            carry = sum / 10;  // 计算该进位的数
        }

        //创建返回的字符
        StringBuffer sb = new StringBuffer();
        //条件判断，可能前面有的数字是 0 ,那就直接下一位。，并记录索引。
        int index = 0;
        while( index < res.length && res[index] == 0 ){
            index++;
        }
        //从不是为 0 开始
        for(int i = index; i < res.length; i++){
            // 进行添加
            sb.append(res[i]);
        }
        // 特殊判断：是不是长度为 0， 如果长度为 0 ，那就直接返回字符串"0"。否则就直接返回sb.长度。
        return sb.length() == 0? "0":sb.toString();
    }

}
