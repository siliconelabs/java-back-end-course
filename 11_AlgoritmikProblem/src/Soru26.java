
import java.util.Scanner;


public class Soru26 {
    public static void main(String[] args)
    {
        System.out.println("Sayı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        for(int i = 1 ; i<=10; i++)
        {
            System.out.println(sayi+"x"+i+"="+(sayi*i));
        }
    }
}
