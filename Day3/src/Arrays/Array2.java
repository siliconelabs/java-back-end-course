package Arrays;

import java.util.Scanner;

/*Kullanıcıdan hangi ayda olduğunu bilgisini alıp ilgili ay değerini
yazdırın. Ay adlarını bir dizide saklayın.*/
public class Array2 {

    public static void main(String[] args) {


        //String[] aylar=new String[12];

        String[] aylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağuston","Eylül","Ekim","Kasım","Aralık"};
        Scanner tara=new Scanner(System.in);
        System.out.println("Ay değerini rakamla yazınız");
        int ay = tara.nextInt();
        System.out.println("Seçtiğiniz ay :" + aylar[ay-1]);
        //ÇÖZÜM 3
        System.out.println("Kaç tane sayının ortalamasını bulmak istiyorsun ?");
        int sayi = tara.nextInt();

        int kullaniciSayilari[] = new int[sayi];
        double ortalama = 0;
        for (int i=0; i<sayi; i++){
            System.out.println("Sayı giriniz : \n");
            kullaniciSayilari[i] = tara.nextInt();
            ortalama = ortalama + kullaniciSayilari[i];
        }
        System.out.println("Girdiğiniz sayıların ortalaması : " + (ortalama/kullaniciSayilari.length));
    }

}
