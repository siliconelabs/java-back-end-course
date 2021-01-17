package PolymorphismandDinamicbinding;

public class CastingInstanceOf {

    public static void main(String[] args) {
        GeometrikSekil gs1=new GeometrikSekil();



        Kare k1=new Kare(5);

        Dikdortgen d1=new Dikdortgen(10,12);

        GeometrikSekil gs2=new Kare(5); //implicit

        GeometrikSekil gs3=new Dikdortgen(5,10);
        Dikdortgen d2=new Kare(5);

        Dikdortgen d3 = (Dikdortgen) gs3;//explicit direk olarak , downcasting
        Daire daire1=new Daire();
        Dortgen dortgen1=new Dortgen();

        gs1.getBoy();

        alaniGoster(gs1);
        alaniGoster(k1);
        alaniGoster(d1);
        alaniGoster(daire1);
        alaniGoster(dortgen1);


    }

    public static void alaniGoster(GeometrikSekil sekil){


        if(sekil instanceof Kare){
            Kare gecici = (Kare) sekil;
            gecici.alanHesapla();
            System.out.println("Kare içindeki alan hesapla çağrıldı");
        }
        else if(sekil instanceof Dikdortgen){
            Dikdortgen gecici = (Dikdortgen) sekil;
            gecici.alanHesapla();
            System.out.println("Dikdortgen içindeki alan hesapla çağrıldı");
        }else if(sekil instanceof Daire){
            Daire gecici = (Daire) sekil;
            gecici.alanHesapla();
            System.out.println("Daire içindeki alan hesapla çağrıldı");
        }else if(sekil instanceof Dortgen){

            Dortgen gecici = (Dortgen) sekil;
            gecici.alanHesapla();
            System.out.println("Dortgen içindeki alan hesapla çağrıldı");
        }

        else{
            sekil.alanHesapla();
            System.out.println("Geometrik sekil içindeki alan hesapla çağrıldı");
        }
        sekil.alanHesapla();

    }
}

class GeometrikSekil{

    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("geometrik şekil oluşturulyor.");
    }
    public GeometrikSekil(int en) {
        this.en = en;
        System.out.println("geometrik şekil oluşturulyor.");
    }
    public GeometrikSekil() {
        System.out.println("geometrik şekil oluşturulyor.");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void alanHesapla(){
        System.out.println("Alan : " + (getEn()*getBoy()));
    }
    public void cevreHesapla(){
        System.out.println("Çevre : " + (en+boy) * 2 );
    }

    @Override
    public String toString() {
        return "En:"+en+" boy:"+boy;
    }
}

class Daire extends GeometrikSekil{
    @Override
    public void alanHesapla() {
        System.out.println("Dairenin alan hesaplası çalıstı");
    }
}

class Dortgen extends GeometrikSekil{
    @Override
    public void alanHesapla() {
        System.out.println("Dortgen alan hesaplası çalıstı");
    }
}

class Dikdortgen extends GeometrikSekil {

    public Dikdortgen(int en, int boy){
        setEn(en);
        setBoy(boy);
        System.out.println("Dikdortgen oluşturulyor.");
    }
    public Dikdortgen(int en){
        setEn(en);
        System.out.println("Dikdortgen oluşturulyor.");
    }

    public void ozellikYazdir(){
        System.out.println("Geometrik şeklin eni:"+ getEn() + " boyu :"+getBoy());
        alanHesapla();
        cevreHesapla();
    }

    @Override
    public String toString() {
        return "dikdortgenin eni:"+getEn()+" boyu :"+getBoy();
    }
}

class Kare extends Dikdortgen {

    public Kare(int en) {
        super(en);
        setBoy(en);
        System.out.println("Kare oluşturulyor.");
    }
}


