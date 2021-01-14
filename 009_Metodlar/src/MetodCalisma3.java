
public class MetodCalisma3 {
    
    public static void main(String[] args)
    {
        int toplam  = topla(5,10);
        System.out.println(toplam);
        
        System.out.println(topla(8,15));
        if(tekMiCiftMi(6)  == true)
        {
             System.out.println("Çift Sayıdır");
        }else
        {
             System.out.println("Tek Sayıdır");
        }
        boolean sonuc = tekMiCiftMi(6);
        if(sonuc==true)
        {
             System.out.println("Çift Sayıdır");
        }else
        {
             System.out.println("Tek Sayıdır");
        }  
        
        System.out.println(pozitifMiNegatifMi(5));
        String sonucStr = pozitifMiNegatifMi(-5);
        
        System.out.println(sonucStr);
        int kareSonuc = kareAl(5);
        
        onIleCarp(kareSonuc);
        
    }

    public static int topla(int sayi1 , int sayi2)
    {
        int topla = sayi1 + sayi2 ;
        return topla;
    }
    
    public static boolean tekMiCiftMi(int sayi)
    {
        if(sayi%2==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    public static String pozitifMiNegatifMi(int sayi)
    {
        String s;
        if(sayi>0)
        {
            s="Pozitif Sayıdır";
            return s;
        }else
        {
            return "Negatif Sayıdır";
        }
    }
    
    public static int kareAl(int sayi)
    {
        int kare = sayi * sayi ;
        return kare;
    }
    
    public static void onIleCarp(int sayi)
    {
        System.out.println(sayi*10);
    }
}
