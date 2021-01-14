
import java.util.Scanner;


public class Soru17 {
    
    public static void main(String[] args)
    {
       
        System.out.println("Sayı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        int carpim = 1 ; 
        while(sayi!=0)
        {
            
            carpim =carpim * sayi ; 
            System.out.println("Sayı Gir");
            Scanner sc2 = new Scanner(System.in);
            sayi = sc2.nextInt();
        }
        
        System.out.println("Girilen Sayıların Çarpımı="+carpim);
        
    }
}
