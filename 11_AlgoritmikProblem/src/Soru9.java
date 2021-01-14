
import java.util.Scanner;


public class Soru9 {
    public static void main(String[] args)
    {
        int toplam = 0 ; 
        for(int i = 1 ; i<=10 ; i++ )
        {
            System.out.println(i+ ". sayıyı Gir");
            Scanner sc = new Scanner(System.in);
            int sayi = sc.nextInt();
            if(sayi%5==0)
            {
                toplam = toplam + sayi ; 
            }
        }
        System.out.println("Girilen 10 Sayının Toplamı = " + toplam );
    }
}
