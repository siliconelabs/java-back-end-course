package com.collection.MyMap;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapKullanimi {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("emre",1);
        linkedHashMap.put(null,2);
        linkedHashMap.put("hasan",3);
        linkedHashMap.put("ali",4);
        linkedHashMap.put("ali",5);

        for(String gecici : linkedHashMap.keySet()){
            System.out.println(gecici);
        }

        for(int gecici : linkedHashMap.values()){
            System.out.println(gecici);
        }

        for (Map.Entry<String,Integer> gecici : linkedHashMap.entrySet()){
            System.out.println(gecici);
        }

        System.out.println(linkedHashMap.get("hasan"));


    }
}
