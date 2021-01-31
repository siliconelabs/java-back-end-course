package com.collection.MyMap;

import java.util.ArrayList;
import java.util.HashMap;

public class ValueArrayListolursa {
    public static void main(String [] args)
        /*----------------------------------------------------------------------------------------------------------------------
    HashMap sınıfının keySet metodu tüm anahtarlara ilişkin Set referansını döndürür
----------------------------------------------------------------------------------------------------------------------*/
    {
        var countyMap = new HashMap<Integer, ArrayList<String>>();

        countyMap.put(34, new ArrayList<>());
        countyMap.get(34).add("şişli");
        countyMap.get(34).add("fatih");
        countyMap.get(34).add("silivri");

        countyMap.put(6, new ArrayList<>());
        countyMap.get(6).add("çankaya");
        countyMap.get(6).add("kazan");

        for (var key : countyMap.keySet()) {
            System.out.printf("%d->", key);
            for (var county : countyMap.get(key))
                System.out.printf("%s ", county);

            System.out.println();
        }

        //values  kullanımı  örnek
        /*
         var countyMap = new HashMap<Integer, ArrayList<String>>();

        countyMap.put(34, new ArrayList<>());
        countyMap.get(34).add("şişli");
        countyMap.get(34).add("fatih");
        countyMap.get(34).add("silivri");

        countyMap.put(6, new ArrayList<>());
        countyMap.get(6).add("çankaya");
        countyMap.get(6).add("kazan");

        for (var list : countyMap.values()) {
            for (var county : list)
                System.out.printf("%s ", county);
            System.out.println();
        }
        */


    }
}
