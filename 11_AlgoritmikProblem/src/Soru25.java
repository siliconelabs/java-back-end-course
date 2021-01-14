
import java.util.Scanner;


public class Soru25 {
    
    
    public static void main(String[] args)
    {
        System.out.println("Üçgenin Birinci Açısını Gir");
        Scanner sc = new Scanner(System.in);
        int aci1 = sc.nextInt();
        
        System.out.println("Üçgenin İkinci Açısını Gir");
        Scanner sc2 = new Scanner(System.in);
        int aci2 = sc2.nextInt();
        
        aciBul(aci1,aci2);
    }
    
    public static void aciBul(int aci1 , int aci2)
    {
        int digerAci = 180 - aci1-aci2;
        System.out.println("Diğer Açı = "+digerAci);
    }
}
