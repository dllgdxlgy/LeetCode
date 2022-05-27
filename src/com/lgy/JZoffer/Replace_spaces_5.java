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
//        StringBuilder builder = new StringBuilder(s);
//        System.out.println(builder);
        String s1 = r.replaceSpace(s);
    }

    /**
     *  第二遍刷
     * @param s
     * @return
     */
    public String replaceSpace (String s) {
        // write code here
        char[] sh = s.toCharArray();
        // 第一次使用的是StringBuilder ，注意别忘记括号。
        StringBuilder str = new StringBuilder();
        for(char c : sh){
            // 一个字符是单引号，如果是双引号那就是字符串。
            if(c == ' '){
                str.append("%20");
            }else{
                str.append(c);
            }
        }
        System.out.println(str);

        // 注意： String.valueOf() , 里面是大写的
        String s1 = String.valueOf(str);
        return s1;
    }

    public String replaceSpace_4 (String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < length; i++ ){
            if(' ' == s.charAt(i)){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
