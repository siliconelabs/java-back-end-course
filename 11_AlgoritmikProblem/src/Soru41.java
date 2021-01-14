
import java.util.Random;
import java.util.Scanner;


public class Soru41 {
    public static void main(String[] args)
    {
        System.out.println("Sayıyı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        
        Random rn = new Random();
        int rasgele = rn.nextInt(sayi)+1; // [1 - sayi]
        System.out.println(rasgele);
    }
}
