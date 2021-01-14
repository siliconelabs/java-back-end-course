
import java.util.Scanner;


public class Soru16 {

    public static void main(String[] args)
    {
        int toplam = 0 ; 
        int sayac = 0;
        while(toplam<=110)
        {
            System.out.println((sayac+1)+". sayıyı giriniz");
            Scanner sc = new Scanner(System.in);
            int sayi = sc.nextInt();
            toplam = toplam + sayi ; 
            sayac = sayac+1;
        }
        System.out.println("Girilen Sayı Adedi="+sayac);
    }

}
