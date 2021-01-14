
import java.util.Scanner;


public class Soru14 {
    
    public static void main(String[] args)
    {
        double toplam = 0 ; 
        for(int i = 1 ; i<=10 ; i++)
        {
            System.out.println(i+". sayıyı giriniz.");
            Scanner sc = new Scanner(System.in);
            double sayi = sc.nextInt();
            toplam = toplam + sayi ; 
        }
        
        double ortalama = (double)(toplam / 10.0) ; 
        System.out.println("Girinlen 10 sayının ortalaması = " + ortalama);
    }

}
