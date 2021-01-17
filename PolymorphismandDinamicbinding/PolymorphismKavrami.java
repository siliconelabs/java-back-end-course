package PolymorphismandDinamicbinding;

public class PolymorphismKavrami {

    //polymorphism üst sınıf değişkeninin alt sınıf nesnelerini referans edebilmesidir.
    public static void main(String[] args) {

        Hayvan h1=new Hayvan();
        Kopek kopek1=new Kopek("Golden");

        kopek1.ayakSayisi=23;
        Kedi kedi1=new Kedi("Van Kedisi");

        adiniSoyle(kopek1);
        adiniSoyle(h1);

        adiniSoyle(kedi1);



    }



    public static void adiniSoyle(Hayvan hayvan)
    {

        hayvan.adiniSoyle();
        System.out.println(hayvan.ayakSayisi);
    }



}

class Hayvan{

    public int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }


    public static void adiniSoyle(){
        System.out.println("Ben hayvan sınıfı nesneyim");
    }
}

class Kopek extends Hayvan{

    private String tur;


    public Kopek(String tur){

        setAyakSayisi(4);
        setTur(tur);
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public static void adiniSoyle(){
        System.out.println("Ben hayvan sınıfı nesneyim");
    }

}

class Kedi extends Hayvan{

    private String cinsi;

    public Kedi(String cins){
        setAyakSayisi(4);
        setCinsi(cins);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }


    public static void adiniSoyle() {
        System.out.println("Ben bir kedi nesnesiyim");
    }
}