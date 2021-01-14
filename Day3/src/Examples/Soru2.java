package Examples;

/*Ogrenci isimli sınıf oluşturun. Bu sınıfta ogrencinin idsi ve not değeri
tutulmalı. 100 elemanlı bir dizide id ve not değerlerini rastgele olusturarak
bu ogrencileri saklayın ve bu ogrencileri aldıkları notlara göre azalan sırada
yazdıran metotu yazın.*/

import java.util.Arrays;
public class Soru2 {
    public static void main(String[] args) {

        Ogrenci tumOgrenciler[]=new Ogrenci[100];
        int []x=new int[100];

        for(int i=0; i<100; i++){

            int rastgeleID = (int)(Math.random() * 5000);
            int rastgeleNotDegeri = (int)(Math.random() * 100);

            Ogrenci yeni = new Ogrenci(rastgeleID, rastgeleNotDegeri);
            tumOgrenciler[i] = yeni;
        }
        ogrencileriNotlarinaGoreSirala(tumOgrenciler);

        for (int i=0; i<100; i++){
            tumOgrenciler[i].ogrenciBilgileriniYazdir();
        }
    }
    private static void ogrencileriNotlarinaGoreSirala(Ogrenci[] tumOgrenciler) {
        for(int i=0; i<tumOgrenciler.length - 1 ; i++){
            //en küçük elemanın ve indexinin bulunması
            int oankiEnBuyukSayi = tumOgrenciler[i].getNotDegeri();
            int oankiEnBuyukElemaninIndex = i ;
            for(int j = i+1 ; j < tumOgrenciler.length ; j++){
                if(oankiEnBuyukSayi < tumOgrenciler[j].getNotDegeri()){
                    oankiEnBuyukSayi = tumOgrenciler[j].getNotDegeri();
                    oankiEnBuyukElemaninIndex = j;
                }
            }
            //eğer gerekli ise değerler yer değiştirir
            if(oankiEnBuyukElemaninIndex != i){
                tumOgrenciler[oankiEnBuyukElemaninIndex] = tumOgrenciler[i];
                tumOgrenciler[i].setNotDegeri(oankiEnBuyukSayi);
            }
        }
    }
}
class Ogrenci{

    private int id;
    private int notDegeri;


    public Ogrenci(int id, int notDegeri) {
        this.id = id;
        this.notDegeri = notDegeri;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNotDegeri() {
        return notDegeri;
    }
    public void setNotDegeri(int notDegeri) {
        this.notDegeri = notDegeri;
    }
    public void ogrenciBilgileriniYazdir(){
        System.out.println("id :"+id + " not:"+notDegeri);
    }
}