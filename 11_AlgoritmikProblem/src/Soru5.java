
public class Soru5 {
    public static void main(String[] args)
    {
        
        int ogrenciVize = 100 ; 
        int ogrenciFinal = 100 ; 
        int ogrenciProje = 55 ; 
        
        ogrenciVize = (ogrenciVize*35)/100;
        ogrenciFinal= (ogrenciFinal*50)/100;
        ogrenciProje= (ogrenciProje*15)/100;
        int ogrenciPuan = ogrenciVize+ ogrenciProje + ogrenciFinal;
        System.out.println("Puan  =" + ogrenciPuan);
        if(ogrenciPuan<=100 && ogrenciPuan>=90)
        {
            System.out.println("AA");
        }else if(ogrenciPuan<=89 && ogrenciPuan >=80)
        {
            System.out.println("BA");
        }else if(ogrenciPuan<=79 && ogrenciPuan>=70)
        {
            System.out.println("BB");
        }else if(ogrenciPuan<=69 && ogrenciPuan>=50)
        {
            System.out.println("CB");
        }else if(ogrenciPuan<=49 && ogrenciPuan>=45)
        {
            System.out.println("CC");
        }else if(ogrenciPuan<=45 && ogrenciPuan>=40)
        {
            System.out.println("DC");
        }else
        {
            System.out.println("FF");
        }
    }
}
