package com.lgy.Hot_xiu_108.Character_String;

/**
 * @author LGY
 * @create 2022-06-16 19:16
 */
public class T10 {

    /**
     * 推荐解法
     * @param s
     * @param n
     * @return
     */
    public String trans(String s, int n) {
        // 本题实际就是把字符串s反转(单词中的字符位置不反转)，遇到空格不变，遇到大写字母变成小写，小写字母变成大写
        StringBuffer res = new StringBuffer(); // 存放最终结果
        int index = 0; // 记录字母应插入的位置
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                res.append(" ");
                index = res.length();
            } else {
                // 当前字符是字母
                if (ch >= 'A' && ch <= 'Z') {
                    res.insert(index, (char)(ch + 32)); // 大写字母变为小写，每次都插在index位置
                } else {
                    res.insert(index, (char)(ch - 32)); // 小写字母变为大写，每次都插在index位置
                }
            }
        }
        return res.toString();
    }
    public String trans_0(String s, int n) {
        // write code here
        String[] str = s.trim().split(" ");
        int len = str.length;
        String res = "";
        for (int i = len - 1; i >= 0; i--) {
            res += rev(str[i]);
            res += " ";
        }
        res = res.trim();
        return res;
    }

    public String rev(String str) {
        String res = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                char temp = (char) (str.charAt(i) - 32);
                res += temp;
            } else {
                char temp_2 = (char) (str.charAt(i) + 32);
                res += temp_2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        T10 t10 = new T10();
        String seEfr_dSwq = t10.trans("seEfr DSwq", 10);
        System.out.println(seEfr_dSwq);
    }

    public String trans_1(String s, int n) {
        // write code here

        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            if (Character.isUpperCase(s.charAt(i))) {
                res += Character.toLowerCase(s.charAt(i));
            } else {
                res += Character.toUpperCase(s.charAt(i));
            }
        }
        String[] str = s.trim().split(" ");
        int len = str.length;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(reverse(str[i]));
            sb.append(" ");
        }
        return res;
    }


    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


    public String trans_2(String s, int n) {
        // write code here

        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            if (Character.isUpperCase(s.charAt(i))) {
                res += Character.toLowerCase(s.charAt(i));
            } else {
                res += Character.toUpperCase(s.charAt(i));
            }
        }
        String[] str = res.trim().split(" ");
        int len = str.length;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(reverse_2(str[i]));
            sb.append(" ");
        }
        String result = sb.toString().trim();
        return result;
    }


    public String reverse_2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * 推荐的方法
     *
     * @param s
     * @param n
     * @return
     */
    public String trans_3(String s, int n) {
        String res = "";
        String tempStr = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                tempStr += Character.toUpperCase(c);
            else if (c >= 'A' && c <= 'Z')
                tempStr += Character.toLowerCase(c);
            else {
                tempStr = c + tempStr;
                res = tempStr + res;
                tempStr = "";
            }
        }
        res = tempStr + res;
        return res;
    }

    public String trans_4(String s, int n) {
        StringBuilder res = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                tempStr.append(Character.toUpperCase(c));
            else if (c >= 'A' && c <= 'Z')
                tempStr.append(Character.toLowerCase(c));
            else {
                tempStr.append(" ", 0, 1);
                res.append(tempStr);
                tempStr.delete(0, tempStr.capacity() - 1);
            }
        }
        res.append(tempStr);
        return res.toString();
    }
}
