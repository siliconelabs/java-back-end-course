
package pkg008_localandglobaldegiskenler;


public class LocalGlobalDegisken {
    static int sonuc = 0 ; 
    // local Degisken : bir kod blogu ( dongu , metod , kontrol yapılı ) içinde tanımlanır
    //sadece tanımlandığı kod blogu içinde cagırılır , güncelleme yapılır
    //tanımlandığı kod blogu dışında bu değişkemlere erşim sağlanmaz , erişim sağlanmadığı için
    //değişkenin tuttugu değeri bilemeyiz
    
    //global : sınıfın her yerinde erişilebilen değişkendir.
    public static void main(String[] args)
    {
        
        for(int i=1 ; i<=100;i++)
        {
            
            sonuc = sonuc + i ; 
        }
        
        System.out.println(sonuc);
    }
    
    
}
