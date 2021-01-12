
public class AzaltmaArtirma {
    
    
    public static void main(String[] args)
    {
        int sayi = 100 , sayi2=200;

        sayi=sayi-1;
        int souc2=sayi;

        int sonuc = --sayi;
        
        
        System.out.println("Sayi = " +sayi);
        System.out.println("Sonuc = " + sonuc);
        
        sonuc = sayi2--;

        /*

        sonuc=sayi2;
        sayi2=sayi2-1
         */
        
        System.out.println("Sayi 2 = " +sayi2);
        System.out.println("Sonuc 2 =" +sonuc);
        
        
        int sayi3 = 150 ; 
        sonuc = sayi3++;
        System.out.println("Sayi 3 = "+sayi3);
        System.out.println("Sonuc  3= "+ sonuc);
        
        
        int sayi4 = 5 ;
        sonuc = ++sayi4;
        
        System.out.println("Sayi 4 = "+sayi4);
        System.out.println("Sonuc 4= "+ sonuc);
    }
    
   
}
