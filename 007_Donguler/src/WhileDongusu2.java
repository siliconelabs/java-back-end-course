
public class WhileDongusu2 {
    public static void main(String[] args)
    {
        //1. sorumuz : 1-100  arasındaki çift sayıları konsola yazdıralim
        
        int sayi = 1;
        
        
        while(sayi<=100)
        {
        
            if(sayi%2==0)
            {
                System.out.println(sayi);
            }
            
            sayi = sayi + 1 ; 
        }
        
        // 1-50 arasındaki 3. katlarını konsola bas
        
        System.out.println("--------------------------------------------");
        sayi = 1 ; 
        
        while(sayi<=50)
        {
           if(sayi%3 ==0)
           {
               System.out.println(sayi);
           }
           sayi = sayi + 1 ; 
        }
        
        System.out.println("-------------------------------------------------");
        
        sayi=1;
        
        while(sayi<=100)
        {
            
            if(sayi%2==0)
            {
                int kat5 = sayi *5; 
                System.out.println(kat5);
            }else
            {
                int kat10 = sayi * 10;
                System.out.println(kat10);
            }
            
            sayi = sayi + 1 ; 
        }
        
        System.out.println("-----------------------------------------");
        
        sayi = 1 ;
        
        while(sayi<=100)
        {
            if(sayi%2 == 0)
            {
                int kare = sayi* sayi;
                
                System.out.println(sayi + " karesi = " + kare);
            }else
            {
                int kup = sayi * sayi * sayi ;
                System.out.println( sayi + " küpü = " + kup);
            }
          sayi = sayi + 1;  
        }
    }
}
