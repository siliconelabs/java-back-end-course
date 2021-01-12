
public class IfElseKullanimi {
    
    
    public static void main(String[] args)
    {
        int sayi = -50 ;
        
        
        if(sayi>0)
        {
            System.out.println("Sayı poziftir.");
        }
        else
        {
            System.out.println("Sayı negatiftir.");
        }
        
        
        int sayi2 = 76 ; 
        
        if(sayi2%2==0)
        {
            System.out.println("Çift sayıfır");
        }else
        {
            System.out.println("Tek Sayıdır");
        }
        
        
        int sayi3 = 100; 
        if(sayi3%11==0)
        {
            
            int sonuc =sayi3*2;
            System.out.println(sonuc);
            
        }
        
        else
        {
            
            int sonuc = sayi3*7;
            System.out.println(sonuc);
            
        }
        
    }
}
