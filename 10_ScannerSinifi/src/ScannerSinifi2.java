
import java.util.Scanner;


public class ScannerSinifi2 {
 
    
  public static void main(String[] args)
  {
      System.out.println("Birinci Sayıyı Giriniz");
      Scanner sc = new Scanner(System.in);
      int sayi1 = sc.nextInt();
      System.out.println("İkinci Sayıyı Giriniz");

      int sayi2 = sc.nextInt();
      karsilastir(sayi1, sayi2);
  }
  
  public static void karsilastir(int sayi1 , int sayi2)
  {
      if(sayi1>sayi2)
      {
          System.out.println("Birinci Sayı Büyüktür");
      }else if(sayi1==sayi2)
      {
          System.out.println("İki sayı birbirine eşittir");
      }
      else
      {
          System.out.println("İkinci Sayı Büyüktür");
      }
  }
  
  
}
