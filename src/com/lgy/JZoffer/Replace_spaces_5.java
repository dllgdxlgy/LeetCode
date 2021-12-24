package com.lgy.JZoffer;

/**
 * 剑指offer-替换空格-5
 * 将⼀个字符串中的空格替换成 "%20" 。
 *
 * Input:
 * "A B"
 * Output:
 * "A%20B"
 *
 */

public class Replace_spaces_5 {

    public String replaceSpace1(String s) {

        if (s == null || s.length() == 0){
            return "";
        }
        //StringBuffer 长度可变、效率低、线程安全
        // StringBuilder 长度可变、效率高、线程不安全。
        StringBuffer stringBuffer = new StringBuffer();
        for (int i =0; i < s.length(); i++)
            if (s.charAt(i)==' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(s.charAt(i));
            }

        return stringBuffer.toString();
    }

    /**
     * 库函数
     * @param s
     * @return
     */
    public String replaceSpace2(String s) {

        return s.replace(" ","20");
    }

    /**
     *
     * @param s
     * @return
     */
    public String replaceSpace3(String s) {

        if (s.length()==0||s==null){
            return "";
        }
        StringBuilder builder = new StringBuilder(s);
        return null;
    }

    public static void main(String[] args) {
        Replace_spaces_5 r = new Replace_spaces_5();
        String s = "jiahf f f";
        StringBuilder builder = new StringBuilder(s);
        System.out.println(builder);
    }
}
