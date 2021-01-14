
import java.util.Random;


public class Soru46 {
    
    public static void main(String[] args)
    {
        int kucuk=0;
        
        for(int i =1 ; i<=5;i++)
        {
            Random rn = new Random();
            int sayi = rn.nextInt(100)+1;
            System.out.println("Sayı=" +sayi);
            if(i==1)
            {
                kucuk = sayi;
            }
            
            if(kucuk > sayi)
            {
                 kucuk = sayi;
            }
        }
        System.out.println("En Küçük=" +kucuk);
         
            
    } 
}
