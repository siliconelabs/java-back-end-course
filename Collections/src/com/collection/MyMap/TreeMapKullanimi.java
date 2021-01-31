package com.collection.MyMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapKullanimi {

    public static void main(String[] args) {




        TreeMap<String, Integer> treeMap=new TreeMap<>();
        treeMap.put("emre",1);
        treeMap.put("hasan",2);
        treeMap.put("ayşe",3);
        treeMap.put("ali",4);
        treeMap.put("mehmet",4);

        System.out.println(treeMap);

        TreeMap<Kare, String> kareStringTreeMap=new TreeMap<>(new Comparator<Kare>() {
            @Override
            public int compare(Kare o1, Kare o2) {
                System.out.println("comparetorun compare metotu");
                if(o1.kenar < o2.kenar){
                    return -1;
                }else if(o1.kenar > o2.kenar)
                    return 1;
                else return 0;
            }
        });


        Kare k1=new Kare(4,"mavi");
        Kare k2=new Kare(2,"sarı");
        Kare k3=new Kare(6,"yeşil");
        kareStringTreeMap.put(k1,"mavi kare");
        kareStringTreeMap.put(k2,"sarı kare");
        kareStringTreeMap.put(k3,"yeşil kare");
        kareStringTreeMap.put(new Kare(6,"mavi kare"),"abc");


        System.out.println( kareStringTreeMap.lowerKey(k1));
        System.out.println(kareStringTreeMap.higherKey(k1));

        System.out.println(kareStringTreeMap);

    }

}

class Kare implements Comparable<Kare>{

    int kenar;
    String renk;

    public Kare(int kenar, String renk) {
        this.kenar = kenar;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                ", renk='" + renk + '\'' +
                '}';
    }

    @Override
    public int compareTo(Kare o1) {
        System.out.println("comparablenın compare metotu");
        if(this.kenar < o1.kenar){
            return -1;
        }else if(this.kenar > o1.kenar)
            return 1;
        else return 0;
    }
}
