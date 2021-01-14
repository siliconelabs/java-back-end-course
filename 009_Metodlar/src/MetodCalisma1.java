
public class MetodCalisma1 {
    
    public static void main(String[] args)
    {
        consolaCiktiBas();
        ayir();
        parametreliConsolaCiktiBas("Murat");
        ayir();
        faktorielHesapla(3);
        ayir();
        faktorielHesapla(7);
        ayir();
        toplam(5);
        ayir();
        toplam(10);
        ayir();
    }
   
    public static void consolaCiktiBas()
    {
        int a=10;
        System.out.println("Kapsamlı Java Eğitimi");
    }

    
    public static void ayir()
    {
         System.out.println("-----------------------------------");
    }
    public static void parametreliConsolaCiktiBas(String isim)
    {

        System.out.println(isim);
    }
    public static void faktorielHesapla(int sayi)
    {
        int faktoriyel = 1 ; 
        
        for(int i = sayi ; i >=1 ; i--)
        {
            faktoriyel = faktoriyel * i ; 
        }
        System.out.println(sayi+ " in faktoriyeli = "+faktoriyel );
    }
    
    public static void toplam(int sayi)
    {
        int toplam = 0 ; 
        for(int i = 0 ; i<=sayi ; i++)
        {
            toplam = toplam + i ; 
        }
        System.out.println(sayi + " ya kadar ( dahil ) sayıların toplamı = " + toplam);
    }
}
