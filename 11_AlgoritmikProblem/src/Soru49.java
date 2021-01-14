
import java.util.Random;


public class Soru49 {
    public static void main(String[] args)
    {
        int puan= 0 ; 
        for(int i = 1 ; i<=5; i++)
        {
            Random rn = new Random();
            int sayi = rn.nextInt(10)+1;
            System.out.println("Çarktan Gelen Sayı = "+sayi);
            if(sayi==1 || sayi==3 || sayi==5)
            {
                puan = 0 ; 
            }else
            {
                int yeniPuan = sayi * 10;
                puan = puan+yeniPuan;
            }
        }
        System.out.println("Puan ="+puan);
    }
}
