package Inheritance;

public class InheritanceExmp {

    public static void main(String[] args) {
        Personel mudur = new Personel("ahmet", 123456, 40, "müdür");
        System.out.println(mudur);

        Ogrenci emre = new Ogrenci("emre", 147528, 15, 8526);
        System.out.println(emre);

        MezunOgrenci mezun = new MezunOgrenci("hasan", 85234, 35, 8522, "ankara");

    }
}

    class Kisi{

        private String isim;
        private long tcKimlik;
        private int yas;


        public Kisi() {
            isim="Henüz atanmadı";
            tcKimlik = 0;
            yas = 18;

            System.out.println("default const Kişi");
        }

        public Kisi(String isim, long tcKimlik, int yas) {
            this.isim = isim;
            this.tcKimlik = tcKimlik;
            setYas(yas);


        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public long getTcKimlik() {
            return tcKimlik;
        }

        public void setTcKimlik(long tcKimlik) {
            this.tcKimlik = tcKimlik;
        }

        public int getYas() {
            return yas;
        }

        public void setYas(int yas) {
            if(yas >= 18)
                this.yas = yas;
            else this.yas = 18;
        }

        @Override
        public String toString() {
            return "Ad:"+isim+" tckimlik:"+tcKimlik+" yaş:"+yas;
        }


    }

    class Personel extends Kisi{

        private String pozisyon;

        private int yas;

        public Personel(String isim, long tcKimlik, int yas, String pozisyon) {
//        setYas(yas);
//        setIsim(isim);
//        setTcKimlik(tcKimlik);
            super(isim,tcKimlik,yas);
            yas=20;
            this.pozisyon = pozisyon;

        }

        public String getPozisyon() {
            return pozisyon;
        }

        public void setPozisyon(String pozisyon) {
            this.pozisyon = pozisyon;
        }

        @Override
        public String toString() {
            return "Personel adı:"+getIsim()+" tckimlik:"+getTcKimlik()+" yaş:"+getYas()+" pozisyon "+pozisyon;
        }
    }

    class Ogrenci extends Kisi{
        private int ogrenciNo;

        public Ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
//        setYas(yas);
//        setIsim(isim);
//        setTcKimlik(tcKimlik);

            this.ogrenciNo = ogrenciNo;
        }

        public int getOgrenciNo() {
            return ogrenciNo;
        }

        public void setOgrenciNo(int ogrenciNo) {
            this.ogrenciNo = ogrenciNo;
        }

        @Override
        public String toString() {
            return "Ogrenci adi:"+getIsim()+" tckimlik:"+getTcKimlik()+" yas:"+getYas()+" öğrenci no:"+ogrenciNo;
        }
    }

    class MezunOgrenci extends Ogrenci{

        private String calismaYeri;

        public MezunOgrenci(String isim, long tcKimlik, int yas, int ogrenciNo, String calismaYeri)
        {
            super(isim, tcKimlik, yas, ogrenciNo);
            this.calismaYeri = calismaYeri;
        }

        public String getCalismaYeri() {
            return calismaYeri;
        }

        public void setCalismaYeri(String calismaYeri) {
            this.calismaYeri = calismaYeri;
        }
    }



