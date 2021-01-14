
public class Soru3 {
    
    public static void main(String[] args)
    {
       int sayi = 2 ; 
       int toplam  = 0 ;
       int asalSayiToplam = 0 ; 
       while(sayi<=50)
       {
           // asal sayı oluş olmadıgını kontrol eden döngü
           for(int i=2 ; i<sayi ; i++ )
           {
               if(sayi%i==0)
               {
                   toplam = toplam+1 ; 
               }
           }
           if(toplam == 0 ) 
           {
               asalSayiToplam = asalSayiToplam + sayi ; 
           }
           toplam = 0 ; 
           sayi = sayi +1 ; 
       } 
       
       System.out.println("Asal Sayılar Toplamı = " + asalSayiToplam);
    }
    
}
