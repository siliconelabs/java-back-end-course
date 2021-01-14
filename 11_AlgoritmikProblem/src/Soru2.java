
public class Soru2 {
   
   public static void main(String[] args)
   {
       int sayi = 2 ; 
       int toplam  = 0 ;
       while(sayi<=20)
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
               System.out.println(sayi);
           }
           toplam = 0 ; 
           sayi = sayi +1 ; 
       }
   }
}
