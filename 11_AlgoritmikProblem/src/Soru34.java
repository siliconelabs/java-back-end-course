
import java.util.Scanner;

public class Soru34 {

    public static void main(String[] args) {
        System.out.println("Birinci Sayıyı Gir");
        Scanner sc = new Scanner(System.in);
        int sayi1 = sc.nextInt();

        System.out.println("İkinci Sayıyı Gir");
        Scanner sc2 = new Scanner(System.in);
        int sayi2 = sc2.nextInt();

        System.out.println("İkinci Sayıyı Gir");
        Scanner sc3 = new Scanner(System.in);
        int sayi3 = sc3.nextInt();
        buyuktenKucugeSirala(sayi1, sayi2, sayi3);

    }

    public static void buyuktenKucugeSirala(int s1, int s2, int s3) {
        
        if (s1 > s2) {
            if (s1 > s3) {
                if (s2 > s3) {
                    System.out.println(s1 + "-" + s2 + "-" + s3);
                } else {
                    System.out.println(s1 + "-" + s3 + "-" + s2);
                }

            } else {
                System.out.println(s3 + "-" + s1 + "-" + s2);
            }
        } else {
            if (s2 > s3) {
                if (s1 > s3) {
                    System.out.println(s2 + "-" + s1 + "-" + s3);
                } else {
                    System.out.println(s2 + "-" + s3 + "-" + s1);
                }

            } else {
                System.out.println(s3 + "-" + s2 + "-" + s1);
            }
        }
    }
}
