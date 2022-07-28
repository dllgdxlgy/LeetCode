package com.lgy.Hot_xiu_108.Character_String;

/**
 * T8 验证 IP 地址
 * https://leetcode.cn/problems/validate-ip-address/
 *
 * @author LGY
 * @create 2022-06-17 23:30
 */
public class T8 {

    public String validIPAddress(String queryIP) {

        if (queryIP.indexOf(".") >= 0) {

            String[] arr = queryIP.split("\\.",-1);

            if (arr.length != 4) {
                return "Neither";
            }
            for (int i = 0; i < 4; i++) {
                if (arr[i].length() == 0 || arr[i].length() > 3 || arr[i].length() > 1 && arr[i].charAt(0) == '0') {
                    return "Neither";
                }
                int num = 0;
                for (char c : arr[i].toCharArray()) {
                    if (!Character.isDigit(c)) {
                        return "Neither";
                    }
                    num = num * 10 + c - '0';
                }
                if (num > 255) {
                    return "Neither";
                }
            }
            return "IPv4";

        } else {
            // String属于 IPV6
            String s = queryIP.toLowerCase();
            String[] arr = s.split(":",-1);
            if (arr.length != 8) {
                return "Neither";
            }
            for (int i = 0; i < 8; i++) {
                if (arr[i].length() == 0 || arr[i].length() > 4) {
                    return "Neither";
                }
                for (char c : arr[i].toCharArray()) {
                    if (!(c >= '0' && c <= '9')&&!(c>='a'&&c<='f')){
                        return "Neither";
                    }
                }
            }
            return "IPv6";

        }
    }

    public static void main(String[] args) {
//        String str = "192.168.0.1";
        String str = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
        T8 t8 = new T8();
        String s = t8.validIPAddress(str);
        System.out.println(s);


    }
}
