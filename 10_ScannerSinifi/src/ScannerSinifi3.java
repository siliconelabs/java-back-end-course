
import java.util.Scanner;


public class ScannerSinifi3 {
 
 public static void main(String[] args)
 {
     System.out.println("Birinci  Sayıyı Giriniz.");
     Scanner sc = new Scanner(System.in);
     int sayi1 = sc.nextInt();
     System.out.println("İkinci Sayıyı Giriniz.");

     int sayi2 = sc.nextInt();
     topla(sayi1,sayi2);
     carp(sayi1,sayi2);
     bol(sayi1,sayi2);
     cikar(sayi1,sayi2);
 }
 public static void topla(int s1 , int s2)
 {
     System.out.println(s1+"+"+s2+"="+(s1+s2));
 }
 public static void carp(int s1,int s2)
 {
     System.out.println(s1+"x"+s2+"="+s1*s2);
 }
 public static void bol(int s1,int s2)
 {
     double d1 = Double.parseDouble(""+s1);
     double d2 = Double.parseDouble(""+s2);
     System.out.println(s1+"/"+s2+"="+d1/d2);
 }
 public static void cikar(int s1 , int s2)
 {
      int cikarmaSonuc = s1-s2;
      System.out.println(s1+"-"+s2+"="+cikarmaSonuc);
 }
 
}
