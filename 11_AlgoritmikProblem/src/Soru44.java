
import java.util.Scanner;

public class Soru44 {

    public static void main(String[] args) {
        System.out.println("Dairenin yarını çapını girin.");
        Scanner sc = new Scanner(System.in);
        double yariCap = sc.nextInt();
        double pi = 3.14;
        alanHesabi(yariCap, pi);
        cevreHesabi(yariCap, pi);

    }

    public static void alanHesabi(double yariCap, double piSayisi) {
        double alan = piSayisi * yariCap * yariCap;
        System.out.println("Dairenin Alanı = " + alan);

    }

    public static void cevreHesabi(double yariCap, double piSayisi) {
        double cevre = 2 * piSayisi * yariCap;
        System.out.println("Dairenin Çevresi = " + cevre);
    }
}
