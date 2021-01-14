
import java.util.Scanner;

public class Soru27 {

    public static void main(String[] args) {
        System.out.println("Birinci Sayıyı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi1 = sc.nextInt();

        System.out.println("İkinci Sayıyı Gir");
        Scanner sc2 = new Scanner(System.in);
        int sayi2 = sc2.nextInt();

        System.out.println("Toplama için 1 e bas");
        System.out.println("Çıkarma için 2 ye bas");
        System.out.println("Çarpma için 3 e bas");
        System.out.println("Bölme için 4 e bas");
        Scanner sc3 = new Scanner(System.in);
        int secim = sc3.nextInt();
        if (secim == 1) {
              topla(sayi1,sayi2);
        } else if (secim == 2) {
              cikar(sayi1, sayi2);
        } else if (secim == 3) {
              carp(sayi1, sayi2);
        } else {
             bol(sayi1, sayi2);
        }
    }

    public static void topla(int s1, int s2) {
        int sonuc = s1 + s2;
        System.out.println("Toplama İşlemi Sonucu =  " + sonuc);
    }

    public static void cikar(int s1, int s2) {
        int sonuc = s1 - s2;
        System.out.println("Çıkarma İşlemi Sonucu =  " + sonuc);
    }

    public static void bol(int s1, int s2) {
        double s1Double = (double)s1;
        double s2Double = (double)s2;
        double sonuc = s1Double / s2Double;
        System.out.println("Bölme İşlemi Sonucu =  " + sonuc);
    }

    public static void carp(int s1, int s2) {
        int sonuc = s1 * s2;
        System.out.println("Çarpma İşlemi Sonucu =  " + sonuc);
    }
}
