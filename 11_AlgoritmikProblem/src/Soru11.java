
import java.util.Scanner;


public class Soru11 {
    
    public static void main(String[] args)
    {
        System.out.println("Birinci Sayıyı Giriniz");
        Scanner sc = new Scanner(System.in);
        int sayi1 = sc.nextInt();
        
        System.out.println("İkinci Sayıyı Giriniz");
        Scanner sc2 = new Scanner(System.in);
        int sayi2 = sc2.nextInt();
        carpma(sayi1,sayi2);
        
    }
    public static void carpma(int s1 , int s2)
    {
        int toplam  = 0 ; 
        for(int i = 1 ; i<=s1; i++)
        {
            toplam = toplam + s2 ; 
        }
        System.out.println("Sonuc = " + toplam);
    }

}
