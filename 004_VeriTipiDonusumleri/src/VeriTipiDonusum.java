
public class VeriTipiDonusum {
    
    public static void main(String[] args)
    {
        
        int yas = 26;
        System.out.println(yas);
        String yas1 = Integer.toString(yas);//wrapper

        System.out.println(yas1);

        String yas2 = String.valueOf(yas);// önerilen
        System.out.println(yas2);

        String yas3 = "Alinin yası " + yas1;
        System.out.println(yas3);
        
        
        String dogumYili = "1993";
        System.out.println(dogumYili+3);
        int dogumYili1 = Integer.parseInt(dogumYili); // önerilen 
        System.out.println(dogumYili1);
        int dogumYili2 = Integer.valueOf(dogumYili);
        System.out.println(dogumYili2);

        
        int aileSiraNo = 27 ; 
        double doubleAileSiraNo = (double)aileSiraNo; // önerilen
        
        String stringAileSiraNo = String.valueOf(aileSiraNo);

        double doubleAileSiraNo2 = Double.valueOf(stringAileSiraNo);
        
        
        System.out.println(aileSiraNo);
        System.out.println(doubleAileSiraNo);
        System.out.println(doubleAileSiraNo2);
        
        byte siraNo = 5  ; 
        short sinif = 10 ; 
        int yil = 1993;
        long tckn = 11111111111L;
        
        float kilo = 76.5f;
        double boy = 182.4;
        
        char karakterimiz = 'p';
        
        
        String stringSiraNo = String.valueOf(siraNo);
        String stringSinif = String.valueOf(sinif);
        String stringYil = String.valueOf(yil);
        String stringTckn = String.valueOf(tckn);
        
        String stringKilo = String.valueOf(kilo);
        String stringBoy = String.valueOf(boy);
        String stringKarakterimiz = String.valueOf(karakterimiz);
        
        System.out.println(stringSiraNo);
        System.out.println(stringSinif);
        System.out.println(stringYil);
        System.out.println(stringTckn);
        System.out.println(stringKilo);
        System.out.println(stringBoy);
        System.out.println(stringKarakterimiz);
    }
}
