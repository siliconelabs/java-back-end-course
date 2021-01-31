package com.collection.MySet;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class MyTreeSet {
    /*----------------------------------------------------------------------------------------------------------------------
        TreeSet collection sınıfı elemanları sıralı bir biçimde tutar. Sıralama doğal sıralamadır (natural sort order)
    ----------------------------------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {




        /*----------------------------------------------------------------------------------------------------------------------
    TreeSet collection sınıfı elemanları sıralamak için aşağıdaki örnekte olduğu gibi yaratılırsa açılıma ilişkin türün
    Comparable arayüzünü desteklemesi gerekir. Aksi durumda exception oluşur
----------------------------------------------------------------------------------------------------------------------*/

        TreeSet<Person> rationalTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.yas>o2.yas)
                    return 1;
                else if(o1.yas<o2.yas)
                        return -1;
                else
                return 0;
            }
        });

        rationalTreeSet.add(new Person(12,"salih"));
        rationalTreeSet.add(new Person(23,"mehmet"));
        rationalTreeSet.add(new Person(34,"ali"));
        rationalTreeSet.add(new Person(12,"salih2"));

        System.out.println(rationalTreeSet);



    }
}
