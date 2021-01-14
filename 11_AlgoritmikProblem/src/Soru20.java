
import java.util.Scanner;


public class Soru20 {
    public static void main(String[] args)
    {
        System.out.println("Üçgenin Tabanını  Giriniz");
        Scanner sc = new Scanner(System.in);
        int taban = sc.nextInt();
        
        System.out.println("Üçgenin Yüksekliğini Giriniz");
        Scanner sc2 = new Scanner(System.in);
        int yukseklik = sc2.nextInt();
        alanHesabi(taban,yukseklik);
    }
    
    public static void alanHesabi(int tab , int yuk)
    {
        int ucgenAlan = (tab*yuk)/2;
        System.out.println("Tabanı = " + tab + " , yuksekliği = "+ yuk +" olan üçgenin alanı="+ucgenAlan);
    }
}
