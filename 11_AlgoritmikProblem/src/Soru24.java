
import java.util.Scanner;

public class Soru24 {

    public static void main(String[] args) {
        int toplam = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". sayıyı gir.");
            Scanner sc = new Scanner(System.in);
            int sayi = sc.nextInt();
            toplam = toplam + sayi;
        }

        System.out.println("Aritmetik Ortlama = " + (toplam / 5));
    }
}
