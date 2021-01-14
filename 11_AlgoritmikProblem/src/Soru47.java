
import java.util.Scanner;


public class Soru47 {
    
    
    public static void main(String[] args)
    {
        int kucuk = 0 ; 
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+". sayıyı gir");
            Scanner sc = new Scanner(System.in);
            int sayi = sc.nextInt();
            if(i==1)
            {
                kucuk = sayi;
            }
            
            if(kucuk>sayi)
            {
                kucuk=sayi;
            }
        }
        System.out.println("Girilen En Küçük Sayı= "+ kucuk);
    }
}
