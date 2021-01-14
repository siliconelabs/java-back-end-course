
import java.util.Random;
import java.util.Scanner;


public class Soru50 {
    public static void main(String[] args)
    {
        Random rn = new Random();
        int uretilenSayi = rn.nextInt(100)+1;
        //System.out.println("Üretilen Sayı = "+uretilenSayi);
        int can = 5  ;
        while(can>0)
        {
            System.out.println("Tahminde Bulun. "+can+" can hakkın var");
            Scanner sc = new Scanner(System.in);
            int tahmin = sc.nextInt();
            if(tahmin==uretilenSayi)
            {
                System.out.println("Tebrikler Buldunuz");
                break;
            }else if(uretilenSayi>tahmin)
            {
                System.out.println("Daha Büyük Sayı Giriniz");
                can = can -1 ;
            }else
            {
                System.out.println("Daha Küçük Sayı Giriniz");
                can = can -1 ;
                        
            }
            
        }
    }
}
