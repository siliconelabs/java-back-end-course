
import java.util.Random;


public class Soru42 {
    public static void main(String[] args)
    {
        Random rn  = new Random();
        int sayi = rn.nextInt(100)+1; //[1-100]
        System.out.println("Üretilen Sayı = " + sayi);
        faktoriyelHesapla(sayi);
        asalSayiKontrol(sayi);
        
    }
    
    public static void faktoriyelHesapla(int s1)
    {
        double carpim = 1L ;
        for(int i = 1 ; i<= s1 ; i++)
        {
            carpim = carpim * i ;
        }
        System.out.println("Random Sayının Faktoriyeli = " + carpim);
    }
    
    public static void asalSayiKontrol(int s1)
    {
        int toplam = 0 ;
        for(int i = 2 ; i<s1 ; i++)
        {
            if(s1%i == 0)
            {
                toplam = toplam + 1 ;
            }
            
        }
        if(toplam==0)
            {
                System.out.println("Girilen Sayı Asaldır");
            }else
            {
                 System.out.println("Girilen Sayı Asal Değildir");
            }
    }
}
