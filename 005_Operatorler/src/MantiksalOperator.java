
public class MantiksalOperator {
    
    
    public static void main(String[] args)
    {
        int a = 10 , b = 20  , c = 3 , d = 6 ; 
        
        
        boolean sonuc = (a>b && c > d);
        System.out.println(sonuc);
        sonuc = (a>b && c<d*3 );
        System.out.println(sonuc);
        sonuc = (a>b || c > d ); 
        System.out.println(sonuc);
        sonuc = (a>b || c < d ); 
        System.out.println(sonuc);
        
    }
}
