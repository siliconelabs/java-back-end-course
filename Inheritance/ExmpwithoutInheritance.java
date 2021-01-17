package Inheritance;

public class ExmpwithoutInheritance {

        public static void main(String[] args) {
            Personel2 mudur = new Personel2("ahmet",1236456, -8);
            System.out.println(mudur);

            Ogrenci emre=new Ogrenci("emre",18,8521236,8526);
            System.out.println(emre);
        }
    }

    class Personel2{

        private String isim;
        private long tcKimlik;
        private int yas;

        public Personel2() {
            isim="Henüz atanmadı";
            tcKimlik = 0;
            yas = 18;
        }

        public Personel2(String isim, long tcKimlik, int yas) {
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

    class Ogrenci2{

        private String isim;
        private int yas;
        private long tcKimlik;
        private int okulNo;

        public Ogrenci2() {
            isim="Henüz atanmadı";
            tcKimlik = 0;
            yas = 18;
            okulNo = 5000;
        }

        public Ogrenci2(String isim, int yas, long tcKimlik, int okulNo) {
            this.isim = isim;
            setYas(yas);
            this.tcKimlik = tcKimlik;
            this.okulNo = okulNo;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getYas() {
            return yas;
        }

        public void setYas(int yas) {
            if(yas >= 7)
                this.yas = yas;
            else this.yas = 7;
        }


        public long getTcKimlik() {
            return tcKimlik;
        }

        public void setTcKimlik(long tcKimlik) {
            this.tcKimlik = tcKimlik;
        }

        public int getOkulNo() {
            return okulNo;
        }

        public void setOkulNo(int okulNo) {
            this.okulNo = okulNo;
        }

        @Override
        public String toString() {
            return "Ad:"+isim+" tckimlik:"+tcKimlik+" yaş:"+yas +" okul no:"+okulNo;
        }
    }



