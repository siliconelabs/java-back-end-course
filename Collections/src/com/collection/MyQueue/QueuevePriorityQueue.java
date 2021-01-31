package com.collection.MyQueue;

import java.util.*;

public class QueuevePriorityQueue {

    public static void main(String[] args) {

       PriorityQueue<Ogrenci> ogrenciKuyruk=new PriorityQueue<>(new Comparator<Ogrenci>() {
           @Override
           public int compare(Ogrenci o1, Ogrenci o2) {


                   if(o1.isim.length() > o2.isim.length()){
                       return -1;
                   }else if(o1.isim.length() < o2.isim.length()){
                       return 1;
                   }else{
                       return 0;
                   }



           }
       });
        ogrenciKuyruk.offer(new Ogrenci(1,82,"Ali"));
        ogrenciKuyruk.offer(new Ogrenci(3,70,"Muhammet"));
        ogrenciKuyruk.offer(new Ogrenci(2,96,"murat"));
        ogrenciKuyruk.offer(new Ogrenci(6,12,"merve"));
        ogrenciKuyruk.offer(new Ogrenci(5,18,"kerem2"));

        while(!ogrenciKuyruk.isEmpty()){
            System.out.println(ogrenciKuyruk.poll().toString());
        }


       /* PriorityQueue<String> isimler=new PriorityQueue<>();

        isimler.offer("can");
        isimler.offer("ayşe");
        isimler.offer("beyhan");
        isimler.offer("beril");
        isimler.offer("emre");
        isimler.offer("ali");

        while(!isimler.isEmpty()){
            System.out.println(isimler.poll());
        }
        System.out.println("remove ile dene");

        while(!isimler.isEmpty()){
            System.out.println(isimler.remove());
        }

        Iterator<String> iterator=  isimler.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        */


        //System.out.println(isimler);


/*

        Queue<Integer> sayilar=new LinkedList<>();

        sayilar.offer(1);
        sayilar.offer(2);
        sayilar.offer(3);
        sayilar.offer(3);
        sayilar.offer(23);
        //sayilar.add(2);



        System.out.println(sayilar.peek());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());

        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar);
        */

    }
}

class Ogrenci {

    int id;
    int notDegeri;
    String isim;



    public Ogrenci(int id, int notDegeri,String ad) {
        this.id = id;
        this.notDegeri = notDegeri;
        this.isim=ad;
    }




    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", notDegeri=" + notDegeri + " isim"+ this.isim+"}";
    }
}
