
import java.util.Scanner;


public class Soru35 {
    public static void main(String[] args)
    {
        System.out.println("Dikdörtgenin Uzun Kenarını Gir");
        Scanner sc = new Scanner(System.in);
        int uzunKenar = sc.nextInt();
        System.out.println("Dikdörtgenin Kısa Kenarını Gir");
        Scanner sc2 = new Scanner(System.in);
        int kisaKenar = sc2.nextInt();
        alanHesapla(uzunKenar, kisaKenar);
        cevreHesapla(uzunKenar, kisaKenar);
    }
    
    public static void alanHesapla(int uzun , int kisa)
    {
        int alan = uzun * kisa ; 
        System.out.println("Alan = "+alan);
    }
    public static void cevreHesapla(int uzun , int kisa)
    {
        int cevre = 2*(uzun+kisa);
         System.out.println("Çevre = "+cevre);
    }
}
