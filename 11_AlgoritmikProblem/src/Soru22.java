
import java.util.Scanner;


public class Soru22 {
    
    public static void main(String[] args)
    {
        System.out.println("Sayı Gir");
        Scanner sc  = new  Scanner(System.in);
        
        int sayi = sc.nextInt();
        if(sayi%6==0)
        {
            for(int i = 1 ; i<=sayi ; i++)
            {
                System.out.println("Kapsamlı Java Eğitimi");
            }
        }
        
    }
}
