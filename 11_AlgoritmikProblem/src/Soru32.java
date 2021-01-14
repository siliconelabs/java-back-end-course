
import java.util.Scanner;


public class Soru32 {
    public static void main(String[] args)
    {
      System.out.println("Sayıyı Gir");
      Scanner sc = new Scanner(System.in);
      double sayi = sc.nextDouble();
      double sonuc = (sayi / 11)*2;
      System.out.println("Sonuç = "+sonuc );
    }
}
