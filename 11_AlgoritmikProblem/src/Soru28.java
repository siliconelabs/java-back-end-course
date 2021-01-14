
public class Soru28 {
    public static void main(String[] args)
    {
        int yil = 2014 ; 
        int sene  = 0 ; 
        int deger = 60000;
        int hedefDeger = 900000;
        while(deger<=hedefDeger)
        {
            deger = deger + ((deger*21)/100);
            yil = yil + 1 ;
            sene = sene + 1 ; 
            System.out.println("Güncel Deger = " + deger);
        }
        System.out.println("Yil = " + yil);
        System.out.println("Hedefe Kaç Senede Ulaştı = " + sene);
        System.out.println("Güncel Deger = " + deger);
    }
}
