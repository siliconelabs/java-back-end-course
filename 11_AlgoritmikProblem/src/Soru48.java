
import java.util.Scanner;


public class Soru48 {
    
    public static void main(String[] args)
    {
        int buyuk = 0;
        
        for(int i=1;i<=3;i++)
        {
            System.out.println(i+". sayıyı gir");
            Scanner sc = new Scanner(System.in);
            int sayi = sc.nextInt();
           
            if(i==1)
            {
                buyuk = sayi;
            }
            if(sayi>buyuk)
            {
                buyuk = sayi;
            }
        }
        
        System.out.println("Girilen En Büyük Sayı = "+buyuk);
    }
}
