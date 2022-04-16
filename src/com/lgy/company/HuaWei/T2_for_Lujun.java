package com.lgy.company.HuaWei;

import java.util.*;

//3 2
//        xinguan feiyan xinzeng bendi quezhen anli
//        lu baodao chengdu xinzeng xinguan feiyan bendi quezhen anli yili shenzhen xinzeng bendi quezhen anli liangli yiqing zhengti kongzhi lianghao
//        xinguan yimiao linchuang shiyan
//        wuzhong xinguan yimiao tongguo sanqi liucheng shiyan xiaoguo lianghao
public class T2_for_Lujun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] s_nm= scanner.nextLine().trim().split(" ");
//        int N = Integer.parseInt(s_nm[0]);
//        System.out.println(N);
//        int M = Integer.parseInt(s_nm[1]);
//        System.out.println(M);
        int N = scanner.nextInt();
        System.out.println(N);
        int M = scanner.nextInt();
        System.out.println(M);
        String ss = scanner.nextLine();
        List<String[]> list_title = new LinkedList<>();
        List<String[]> list_con = new LinkedList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < 2*M; i++) {
            String s = scanner.nextLine();
            if ((i%2) == 0){
                list_title.add(s.trim().split(" "));
            }else {
                list_con.add(s.trim().split(" "));
            }
        }

//        List<String> listArray_tit = new ArrayList<>();
//        List<String> listArray_con = new ArrayList<>();
        for (int i = 0; i < list_title.size(); i++) {
            String[] s_title = list_title.get(i);

            for (int j = 0; j < s_title.length; j++) {
                //listArray_tit.add(s_title[j]);
                map.put(s_title[j], map.getOrDefault(s_title[j],0)+3);
            }

        }
        for (int i = 0; i < list_con.size(); i++) {
            String[] s_conte =list_con.get(i);
            for (int k = 0; k < s_conte.length; k++) {
                //listArray_con.add(s_conte[k]);
                map.put(s_conte[k], map.getOrDefault(s_conte[k],0)+1);
            }
        }
//        for (int i = 0; i < N ; i++) {
//            System.out.print(map.firstKey()+" ");
//            map.remove(map.firstKey());
//        }

    }
}
