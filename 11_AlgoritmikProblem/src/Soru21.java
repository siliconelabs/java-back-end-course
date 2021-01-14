
import java.util.Scanner;


public class Soru21 {
    
    public static void main(String[] args)
    {
        System.out.println("Birinci Sayıyı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi1 = sc.nextInt();
        System.out.println("İkinci Sayıyı Gir");
        Scanner sc2 = new Scanner(System.in);
        int sayi2 = sc2.nextInt();
        kareFark(sayi1, sayi2);
    }
    
    public static void kareFark(int s1 , int s2)
    {
        int kareS1 = s1 * s1 ; 
        int kareS2 = s2 * s2 ; 
        int kareFark = kareS1 - kareS2 ; 
        if(kareFark >0 )
        {
            System.out.println("Kareler Farkı = "+kareFark);
        }else
        {
            kareFark = kareS2 - kareS1 ; 
            System.out.println("Kareler Farkı = "+kareFark);
        }
        
    }
}
