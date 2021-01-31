package com.collection.Mystack;

import java.util.*;

public class VectorKullanimi {
    public static void main(String[] args) {

        Vector<String> sehirler=new Vector<>(14);

        System.out.println(sehirler.capacity());

        sehirler.add("Antalya");
        sehirler.add("New jersey");
        sehirler.add("Bursa");
        sehirler.add("Ankara");
        System.out.println(sehirler.capacity());
        System.out.println(sehirler);

        System.out.println(sehirler.firstElement());
        System.out.println(sehirler.lastElement());

        for(int i=0; i<sehirler.size(); i++){
            System.out.print(sehirler.get(i)+",");
        }

        System.out.println("\nIterator ile gezinti");

        Iterator<String> iterator=sehirler.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
        System.out.println("\nEnumeration ile gezinti");

        Enumeration<String> enumeration=sehirler.elements();

        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+",");
        }



    }
}
