package com.collection.MyMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;


/*----------------------------------------------------------------------------------------------------------------------
    Notlar: Java'da bazı collection sınıflar "hash tablosu" biçiminde tasarlanan veri yapısı ile çalışırlar.
    Hash tabloları içsel olarak diziye benzemekle beraber daha hızlı erişim için "hash code" denilen bir bilgi
    kullanırlar. Eklenecek elemanın hash kod bilgisini elde ederek bunu içsel olarak kullanırlar. Böylelikle daha hızlı
    bir arama ve erişim işlemi yapılabilir. Java'da bu tarz collection sınıfların isimleri genel olarak HashXXX
    biçimindedir. Eklenecek bilginin hash kodu Object sınıfının hashCode isimli bir metodu çağrılarak elde edilir.
    Bu metot ilgili sınıfta override edilmezse nesnenin adresinden bir hash kodu üretilir. Bu durumda sınıf bu tarz
    collection sınıflarda da kullanılacaksa hashCode metodu uygun şekilde override edilmelidir. Şüphesiz hash kodunun
    her nesne için farklı olması o nesnenin hash anlamında farklılaşmasını sağlar. HashXXX sınıfları elemanının
    aynı olduğunu hashCode ve equals metodu ile anlar. Yani iki nesnenin hash kodu aynı ve equals metodu true döndürüyorsa
    bunlar aynı nesneler olarak kabul edilir
----------------------------------------------------------------------------------------------------------------------*/
public class HashMapKullanimi {

    public static void main(String[] args) {

        HashMap<String,Integer> map1=new HashMap<>(256,0.75f);
        map1.put("emre",1);
        map1.put("fb",2);
        map1.put(null,123456);
        map1.put("Ea",3);
        map1.put("Ea",5);

        System.out.println(map1.get("Ea"));

        Iterator iterator=map1.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        String st1="emre";
        String st2="hasan";
        String st3="emre";
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());

        Ogrenci ogr1=new Ogrenci(1,"emre");
        System.out.println(ogr1.hashCode());
        ogr1.i=1;
        ogr1.isim="emre";


        System.out.println(ogr1.hashCode());

        Ogrenci ogr2=new Ogrenci(1,"emre");
        System.out.println(ogr2.hashCode());

        System.out.println(ogr1.equals(ogr2));
        System.out.println(ogr1.hashCode());
        System.out.println(ogr2.hashCode());

        HashMap<Ogrenci, Integer> map=new HashMap<>();
        map.put(ogr1,1);
        map.put(ogr2,2);
        System.out.println();

        for(Map.Entry<Ogrenci, Integer> entry: map.entrySet())
        {
            System.out.println("key:"+entry.getKey().toString()+" value:"+entry.getValue());
        }


/*
        HashMap<Integer, String> plakalar=new HashMap<>();
        plakalar.put(1,"Adana");
        plakalar.put(34,"Istanbul");
        plakalar.put(16,"Bursa");
        plakalar.put(35,"İzmir");
        plakalar.put(06,"Ankara");
        plakalar.put(null,"null değer");

        HashMap<Integer, String> plakalarYedek=new HashMap<>();
        System.out.println("palakalar yedek size:"+plakalarYedek.size());
        plakalarYedek.putAll(plakalar);
        System.out.println("plakalar yedek size:"+plakalarYedek.size());
        plakalarYedek.clear();
        System.out.println("clear sonrası size:"+plakalarYedek.size());

        System.out.println(plakalar);
        String deger = plakalar.get(06);
        System.out.println(plakalar.get(null));
        System.out.println(deger);
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println(plakalar.containsKey(16));
        System.out.println(plakalar.containsValue("bursa"));
        System.out.println(plakalar.remove(35));
        System.out.println(plakalar.size());

        for(Integer key:plakalar.keySet()){
            System.out.print("Keyler :" + key);
        }

        System.out.println("Değerler");
        for(String value:plakalar.values()){
            System.out.println(""+value);
        }

        for(Map.Entry<Integer, String> entry: plakalar.entrySet()){
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }

*/
    }
}

class Ogrenci{
    int i;
    String isim;

    public Ogrenci(int i, String isim) {
        this.i = i;
        this.isim = isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ogrenci)) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return i == ogrenci.i &&
                Objects.equals(isim, ogrenci.isim); //ogr1.equals(ogr2)
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, isim);
    }
}
