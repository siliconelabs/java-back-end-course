
import java.util.Scanner;


public class Soru13 {
    
    public static void main(String[] args)
    {
      int tekToplam = 0 ; 
      int ciftToplam = 0 ; 
      for(int i = 1 ; i<=20;i++)
      {
          System.out.println(i+". sayıyı giriniz.");
          Scanner sc = new Scanner(System.in);
          int sayi = sc.nextInt();
          if(sayi%2==0)
          {
              ciftToplam = ciftToplam + sayi;
          }else
          {
              tekToplam = tekToplam + sayi ;
          }
          
      }
      System.out.println("Girilen Tek Sayıların Toplamı="+tekToplam );
      System.out.println("Girilen Çift Sayıların Toplamı="+ciftToplam );
    }

}
