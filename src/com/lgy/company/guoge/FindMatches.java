package com.lgy.company.guoge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author LGY
 * @create 2022-11-23 14:58
 */
public class FindMatches {

    public static void main(String[] args) throws IOException {
        String s = args[0];

        String path = "src/com/lgy/company/guoge/schedule.txt";
        List<String> list = readFile02(path);

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String[] split = list.get(i).split(",");
            for (int j = 0; j < split.length; j++) {
                if(split[j].equals(s)){
                    map.put(split[1],map.getOrDefault(split[1],0)+1);
                }
            }
        }
        if(map.size() > 0){
            System.out.println(s + " will play:");
            for (String sq: map.keySet()) {
                if(map.get(sq) == 1){
                    System.out.println(map.get(sq) + " match in " + sq);
                }else {
                    System.out.println(map.get(sq) + " matches in " + sq);
                }
            }

        }else {
            try {
                throw new InvalidTeamNameException("Invalid Team Name Exception");
            } catch (InvalidTeamNameException e) {
                System.out.println(e.getMessage());
            }
        }



    }

    /**
     * 读取一个文本 一行一行读取
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static List<String> readFile02(String path) throws IOException {

        List<String> list = new ArrayList<String>();
        FileInputStream fis = new FileInputStream(path);

        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        while ((line = br.readLine()) != null) {

            if (line.lastIndexOf("---") < 0) {
                list.add(line);
            }
        }
        br.close();
        isr.close();
        fis.close();
        return list;
    }
}
