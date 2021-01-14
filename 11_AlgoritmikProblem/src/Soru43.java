
import java.util.Scanner;

public class Soru43 {

    public static void main(String[] args) {
        System.out.println("Sayı Gir");

        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        for (int i = 1; i <= sayi; i++) {
            int kare = i * i;
            int kup = i * i * i;
            
            System.out.println(i +" in karesi = " +kare);
            System.out.println(i +" in küpü = " +kup);
        }
    }
}
