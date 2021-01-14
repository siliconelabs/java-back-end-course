package Encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        /*Ogrenci ogr1=new Ogrenci(50,"emre",(byte)5, true);
        ogr1.ogrenciBilgileriniYazdir();
        ogr1.setOgrenciNo(10);
        ogr1.ogrenciBilgileriniYazdir();
        System.out.println("ogrenci no :" + ogr1.getOgrenciNo());
        ogr1.setIsim("yeni isim");
        ogr1.ogrenciBilgileriniYazdir();*/

        Televizyon tv=new Televizyon();
        tv.ac();
        tv.setSesSeviyesi(15);
        tv.setKanal(680);
        tv.kapat();

        tv.goster();



    }
}
