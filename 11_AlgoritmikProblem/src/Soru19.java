
import java.util.Scanner;


public class Soru19 {
    
    public static void main(String[] args)
    {
        System.out.println("Kaça kadar olan sayıların faktoriyelini hesaplayalım ? ");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        for(int i = 1 ; i<=sayi;i++)
        {
            faktoriyelHesapla(i);
        }
                
    }
    
    
    public static void faktoriyelHesapla(int s1)
    {
        int faktoriyel = 1 ; 
        for(int i = 1 ; i<=s1;i++)
        {
            faktoriyel = faktoriyel * i ; 
        }
        System.out.println(s1+" in faktoriyeli="+faktoriyel);
    }
}
