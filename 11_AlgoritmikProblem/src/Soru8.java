
import java.util.Scanner;


public class Soru8 {
    public static void main(String[] args)
    {
      System.out.println("Sayi Gir");
      Scanner sc = new  Scanner(System.in);
      int deger = sc.nextInt();
      int toplam = 0 ; 
      
      while(deger!=-1)
      {
          System.out.println("Girdi");
        
          toplam = toplam + deger; 
          System.out.println("Sayi Girmeye Devam Et");
          Scanner sc2 = new  Scanner(System.in);
          deger = sc2.nextInt();
          
      }
       System.out.println("Girilen Sayıların Toplamı = " + toplam );
      
    }
}
