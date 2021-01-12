
public class WhileDongusu {
    
    public static void main(String[] args)
    {
        int sayi = 0 ; 
        
        boolean sonuc = true;
      
        
        while(sayi<5)
        {
            System.out.println("Kapsamlı Java Eğitimi");
            
            
            sayi = sayi + 1 ; // sayi değişkeni döngü her döndüğünde 1 artacak
            
        }
        
        
        int sayi2 = 1 ; 
        
        
        while(sonuc==true)
        {
            
            System.out.println("Merhaba ");
            
            if(sayi2==20)
            {
                sonuc = false;
            }
            
            sayi2= sayi2+1; // döngümüz her döndüğünde sayi2 değişkeni 1 artıyor
            
            
        }
        
        int sayi3=0;
        
        while(sayi3<100)
        {
            System.out.println(sayi3);
            sayi3 +=1;  // sayi3 = sayi3 +1 kullanımıyla aynıdır , döngü her döndüğünde sayi3 değişkeninin degeri 1 artacaktır
        }
        
        int sayi4 = 10 ;
        
        while(sayi4<5)
        {
            System.out.println("Selam"); // while içindeki şart saağlanmadığı için döngüye hiç girilmedi
        }
            
        
        
        
        
        
        
    }
}
