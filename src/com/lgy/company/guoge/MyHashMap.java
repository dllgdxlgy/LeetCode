package com.lgy.company.guoge;

import java.util.ArrayList;

/**
 * @author LGY
 * @create 2022-11-23 14:06
 */
public class MyHashMap<K extends Object,V extends Number> {
    ArrayList<K> keys;
    ArrayList<V> values;


    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public ArrayList<K> keyset(){
        return keys;
    }

    public void put(K key, V value){
        for (int i = 0; i < keys.size(); i++) {
            if(keys.get(i).equals(key)){
                values.set(i,value);
                return;

            }
        }
        keys.add(key);
        values.add(value);
    }

    public V get(K key){

        for (int i = 0; i < keys.size(); i++) {
            if(keys.get(i).equals(key)){
                return values.get(i);
            }
        }
        return null;
    }
}
