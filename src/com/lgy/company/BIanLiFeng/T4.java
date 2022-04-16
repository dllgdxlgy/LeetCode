package com.lgy.company.BIanLiFeng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-14 18:30
 */
public class T4 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                myHashMap myHashMap = new myHashMap();
                int len = scanner.nextInt();
                for (int i=0; i<len; i++){
                    String line = scanner.next();
                    if (line.charAt(0) == '>'){
                        String[] kv = line.substring(1).split(",");
                        myHashMap.put(Integer.parseInt(kv[0]), kv[1]);
                    }
                    if (line.charAt(0) == '<'){
                        myHashMap.get(Integer.parseInt(line.substring(1)));
                    }
                    if (line.charAt(0) == 'X'){
                        myHashMap.remove(Integer.parseInt(line.substring(1)));
                    }
                }
            }

            public static class myMapNode{
                int key;
                String value;
                myMapNode next;

                public myMapNode(Integer key, String value){
                    this.key = key;
                    this.value = value;
                    this.next = null;
                }
            }

            public static class myHashMap{
                int size = 0;
                int len = 64;
                myMapNode[] myMaps = new myMapNode[64];

                public myHashMap(){}

                public void put(Integer key, String value){
                    int index = key.hashCode()%len;
                    if (myMaps[index]==null){
                        myMaps[index] = new myMapNode(key, value);
                        return;
                    }
                    myMapNode prev = myMaps[index];
                    myMapNode temp = myMaps[index];
                    while (temp != null){
                        if (temp.key == key){
                            temp.value = value;
                            return;
                        }
                        prev = temp;
                        temp = temp.next;
                    }
                    if (temp == null){
                        prev.next = new myMapNode(key, value);
                    }
                }

                public void get(Integer key) {
                    int index = key.hashCode()%len;
                    if (myMaps[index] == null){
                        System.out.println("_EMPTY_");
                    }
                    myMapNode temp = myMaps[index];
                    while (temp != null){
                        if (temp.key == key){
                            System.out.println(temp.value);
                            return;
                        }
                        temp = temp.next;
                    }
                    System.out.println("_EMPTY_");
                }

                public void remove(Integer key) {
                    int index = key.hashCode()%len;
                    if (myMaps[index] == null){
                        return;
                    }
                    if (myMaps[index].key == key){
                        myMaps[index] = myMaps[index].next;
                        return;
                    }
                    myMapNode prev = myMaps[index];
                    myMapNode temp = myMaps[index].next;
                    while (temp != null){
                        if (temp.key == key){
                            prev.next = temp.next;
                            return;
                        }
                        prev = temp;
                        temp = temp.next;
                    }
                }
            }

        }




