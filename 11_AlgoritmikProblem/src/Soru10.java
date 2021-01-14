
public class Soru10 {
    public static void main(String[] args)
    {
        int toplam = 0 ; 
       for(int i = 1 ; i<=15 ; i++)
       {
           int kup = i * i * i ; 
           toplam = toplam + kup ; 
       }
       
        System.out.println("1-15 Arası Sayıların Küplerinin Toplamı = " + toplam );
    }
}
