
public class IfKullanimi {

    public static void main(String[] args) {
        int sayi = -5;

        if (sayi > 0) {
            System.out.println("Poziftir.");
        }

        int sayi2 = 15850;

        if (sayi2 % 2 == 0) {
            System.out.println("Sayı Çift Sayıdır.");
        }

        int sayi3 = 20;
        if (sayi3 % 10 == 0) {
            int kare = sayi3 * sayi3;

            System.out.println((sayi3 * sayi3));
        }
        int sayi4 = 55;

        if (sayi4 > 10 && sayi4 % 2 == 0) {
            System.out.println("Sayımız hem 10 dan buyuktur hem de 2 nin katıdır");
        }

        int sayi5 = 25;
        
        
        if (sayi5 < 0 || sayi5 % 2 == 0) {
            System.out.println("Sayımız 0 dan küçük veya sayımız 2 ye tam bölünüyor ");
        }
        
        

        System.out.println("Program Çalışması Bitti.");

    }
}
