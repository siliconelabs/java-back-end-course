package com.collection.MySet;

import java.util.*;

/*----------------------------------------------------------------------------------------------------------------------
    Küme tarzı collection sınıflar Set<t> arayüzünü destekleyen collection sınıflardır. Set<T> arayüzü de Collectionn<T>
    arayüzünden türetilmiştir. Küme tarzı collection sınıfları genel olarak Matematik'teki küme kavramına göre işlem yapar.
    Bilindiği gibi Matematik'te kümenin elemanlarının hangi sırada dizildiğinin önemi yoktur. Bu collection sınıflarda
    bir çok sınıf bu şekilde ancak bazı set collection sınıfları sıraya dizme işlemi yapar. Ayrıca Matematik'te
    bir kümede birden fazla aynı elamandan olamaz. Hiçbir set collection sınıfları eleman tekrarına izin vermez
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
    HashSet sınıfı hash kodu ve equals metodunu kullanarak elemanının varlığını sorgular. Bu durumda aynı elemandan
    eklenemez. Aynı zamanda HashSet elemanları sıraya dizmez. Yani HashSet içerisindeki elemanlarının sırasının
    önemi yoktur
----------------------------------------------------------------------------------------------------------------------*/
public class SetSiniflari {


    public static void main(String[] args) {

        HashSet<String> harfler=new HashSet<>();
        harfler.add("a");
        harfler.add("d");
        harfler.add("c");
        harfler.add("d");
        harfler.add("d");
        harfler.add("d");
        harfler.add("d");
        harfler.add("e");
        harfler.add("2");
        harfler.add("d");

        System.out.println(harfler);

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("a");
        linkedHashSet.add("d");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add(null);
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("e");
        linkedHashSet.add("2");
        linkedHashSet.add("d");

        Object[] geciciDizi = linkedHashSet.toArray();
        System.out.println(geciciDizi[0].toString());

        System.out.println(linkedHashSet);

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("a");
        treeSet.add("1");
        treeSet.add("d");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("d");
        treeSet.add("z");
        treeSet.add("d");
        treeSet.add("d");
        treeSet.add("e");
        treeSet.add("99");
        treeSet.add("2");
        treeSet.add("d");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(treeSet);

        RandomNumberGenerator();
    }

    public static void RandomNumberGenerator()
    {
        Random r = new Random();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 20; ++i) {
            int val = r.nextInt(100);

            System.out.printf("%d:%b ", val, hashSet.add(val));
        }
        /*----------------------------------------------------------------------------------------------------------------------
    HashSet sınıfı null değer de tutabilmektedir
----------------------------------------------------------------------------------------------------------------------*/
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet.size());

        System.out.println();

        System.out.println(hashSet);
    }

}
