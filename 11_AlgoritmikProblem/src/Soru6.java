
import java.util.Scanner;





public class Soru6 {
    
    
    public static void main(String[] args)
    {
        System.out.println("Faktoriyeli Hesaplanacak Sayıyı Giriniz.");
        Scanner sn = new Scanner(System.in);
        int sayi = sn.nextInt();
        int sonuc = faktoriyelHesapla(sayi);
        System.out.println(sayi + " in faktoriyeli = " + sonuc);
    }
    public static int faktoriyelHesapla(int sayi)
    {
        int sonuc = 1 ; 
        for(int i = 1 ; i<= sayi ; i ++)
        {
            sonuc = sonuc * i ;
        }
        return sonuc ; 
    }
}

/*

    public static void main(String[] args)
    {
        
    }

*/