
public class DoWhileDongusu {
    
    public static void main(String[] args)
    {
        int sayi =  14 ;
        while ( sayi< 10 )
        {
            System.out.println(sayi);
            sayi = sayi + 1 ; 
        }
        
        System.out.println("----------------------");
        
        sayi = 14 ;
        do
        {
            System.out.println(sayi);
            sayi = sayi + 1 ; 
        }
        while(sayi<10);
        
        
         System.out.println("--------While Başladı --------------");
         
         sayi = 15 ;
         while(sayi<10)
         {
            System.out.println(sayi);
            sayi = sayi + 1 ; 
         }
         System.out.println("--------While Bitti - Do while Başladı --------------");
        
        do
        {
            System.out.println(sayi);
            sayi = sayi + 1 ; 
        }while(sayi<10);
        
        
        
        
        sayi = 5 ; 
        int i = 1;
        int faktoriyel = 1 ;
        do
        {
            faktoriyel = i * faktoriyel;
            i = i + 1 ;
        }while(i<=sayi);
        
        System.out.println("Faktoriyel  = " + faktoriyel);
        
        sayi = 5 ;
        faktoriyel = 1 ;
        do
        {
            faktoriyel = sayi * faktoriyel ; 
            sayi = sayi - 1 ;
        }while(sayi>=1);
        
        System.out.println("Faktoriyel  = " + faktoriyel);
        
        sayi = 11 ; 
        i = 2 ; 
        int toplam   = 0 ;
        do
        {
            if(sayi%i ==0)
            {
                toplam = toplam  + 1 ;
            }
            i = i + 1 ; 
            if(sayi ==2)
            {
                toplam = 0 ; 
            }
        }while(i<sayi);
        
        if(toplam==0)
        {
            System.out.println("Asal Sayıdır");
        }else
        {
             System.out.println("Asal Sayı Değildir");
        }
    }
}
