

import java.util.Scanner;


public class Soru31 {
    
    public static int asalSayiToplam = 0 ;
     
    public static void main(String[] args)
    {
        
        System.out.println("Sayı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        
        System.out.println("------------------------------");
        for(int i = 2  ; i<= sayi ; i++)
        {
            asalSayi(i);
        }
        
        System.out.println("Asal SAyı Toplam = " + asalSayiToplam);
        
    }
    
     
    public static void asalSayi(int s1)
    {
        int toplam = 0 ; 
        for(int i = 2;i<s1;i++)
        {
            if(s1%i==0)
            {
                toplam = toplam + 1;
            }
        }
        if(toplam==0)
        {
            System.out.println(s1);
            asalSayiToplam = asalSayiToplam + s1;
        }
    }
    
}
