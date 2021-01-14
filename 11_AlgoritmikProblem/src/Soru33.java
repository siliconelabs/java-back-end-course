
import java.util.Scanner;


public class Soru33 {
    
    public static void main(String[] args)
    {
        System.out.println("Sınıf Sayısını Gir");
        Scanner sc = new Scanner(System.in);
        int sinifMevcut = sc.nextInt();
        int toplam = 0 ;
        
        for(int i = 1 ; i<=sinifMevcut ; i++)
        {
            System.out.println(i+". öğrencinin notunu gir");
            Scanner sc2 = new Scanner(System.in);
            int ogrenciNot = sc.nextInt();
            toplam = toplam + ogrenciNot;  
            
        }
        
        double ortalamaPuan = ortalamaPuan(sinifMevcut,toplam);
        String degerlendirme = basariDegerlendirme(ortalamaPuan);
        System.out.println("Sınıf Ortalamalsı = "+ortalamaPuan);
        
        System.out.println(degerlendirme);
        
    }
    
    public static double ortalamaPuan(int sinifMevcut , int toplamPuan)
    {
        double puan = (double)toplamPuan;
        double mevcut = (double)sinifMevcut;
        double sonuc = puan/mevcut;
        return sonuc;
    }
   // (100-75=üstün zekalı,74-70=Başarılı,69-60=normal,60 aşağısı başarız)
    public static String basariDegerlendirme(double puan)
    {
        String durum = "";
        if(puan <=100.0 && puan>=75.0)
        {
            durum = "Üstün Zekalı Sınıf";
            return durum;
        }else if(puan <=74.0 && puan>=70.0)
        {
            durum = "Başarılı Sınıf";
            return durum;
        }else if(puan <=69.0 && puan>=60.0)
        {
            durum = "Normal Sınıf";
            return durum;
        }else
        {
            durum = "Başarısız Sınıf";
            return durum;
        }
    }
}
