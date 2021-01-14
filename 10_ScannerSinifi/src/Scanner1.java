
import java.util.Scanner;


public class Scanner1 {
    
    public static void main(String[] args)
    {
        System.out.println("Klavyeden String Tipinde Veri Girişi Yapınız.");
        Scanner sc = new Scanner(System.in);
        String veri = sc.nextLine();
        StringVeriTipi(veri);
        System.out.println("Klavyeden int Tipinde Veri Girişi Yapınız.");

        int sayi = sc.nextInt();
        IntVeriTipi(sayi);
    }
    public static void StringVeriTipi(String veri)
    {
        System.out.println("Klavyeden Girilen Veri = " + veri);
    }
    
    public static void IntVeriTipi(int sayi)
    {
        System.out.println("50X"+sayi+ "=" + sayi*50);
    }
}
