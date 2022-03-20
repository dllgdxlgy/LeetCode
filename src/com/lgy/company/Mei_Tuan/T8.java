package com.lgy.company.Mei_Tuan;

import com.lgy.Design_mode.Singleton.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * https://www.nowcoder.com/question/next?pid=21910764&qid=894513&tid=53708082
 */
public class T8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().trim().split(" ");
        for (int i = 0; i < strings.length - 1; i++) {
            //if (strings[i] == strings[i+1] ||(strings[i]== "true" && strings[i+1] == "false" )||(strings[i]== "false" && strings[i+1] == "true" )||(strings[i]== "and" && strings[i+1] == "or" )||(strings[i]== "or" && strings[i+1] == "and" )){
            if (strings[i].contains(strings[i + 1]) || (strings[i].equals("true") && strings[i + 1].equals("false")) || (strings[i].equals("false") && strings[i + 1].equals("true")) || (strings[i].equals("and") && strings[i + 1].equals("or")) || (strings[i].equals("or") && strings[i + 1].equals("and"))) {
                System.out.println("error");
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        ArrayList<String> arrayList1 = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                arrayList.add(strings[i]);
            } else {
                arrayList1.add(strings[i]);
                if (strings[i].equals("and")) {
                    arrayList2.add(i);
                }
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList.get(Integer.parseInt(arrayList1.get(i))).equals("true") && arrayList.get(Integer.parseInt(arrayList1.get(i)) + 1).equals("true")) {
                arrayList.set(Integer.parseInt(arrayList1.get(i)), "true");
                arrayList1.remove(Integer.parseInt(arrayList1.get(i)) + 1);
            }
        }
        if (arrayList.get(0) == "true"){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
