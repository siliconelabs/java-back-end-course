
import java.util.Scanner;


public class Soru45 {
    public static void main(String[] args)
    {
        System.out.println("Haftalık Çalışma Saatini Gir");
        Scanner sc = new Scanner(System.in);
        int calismaSaati = sc.nextInt();

        System.out.println("Saat Ucreti Gir");
        Scanner sc2 = new Scanner(System.in);
        int saatUcreti = sc2.nextInt();
        maasHesabi(calismaSaati,saatUcreti);
        
    }
    
    public static void maasHesabi(int saat , int para)
    {
        int haftalikMaaas = 0 ; 
        if(saat>=40)
        {
            para = ((para*21)/100)+para;
            haftalikMaaas = para*saat;
        }else
        {
            haftalikMaaas = para*saat;
        }
        
        System.out.println("Haftalık Maaş="+haftalikMaaas);
    }
}
