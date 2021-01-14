
import java.util.Scanner;


public class Soru15 {
    public static void main(String[] args)
    {
        System.out.println("Sayı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        System.out.println("--------------------");
        if(sayi>0)
        {
            for(int i = sayi ; i>=1 ; i--)
            {
                System.out.println(i);
            }
        }else
        {
             System.out.println("Pozitif Sayı Giriniz");
        }
    }

}
