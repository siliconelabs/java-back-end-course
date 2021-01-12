
public class IcIceDonguKullanimi {
    
    public static void main(String[] args)
    {
       int i = 1; 
       
       while(i<100)
       {
           int x = 2 ;
           while(x<=5)
           {
               int carpim = i*x;
               
               System.out.println(i + "x"+x+"="+carpim);
               x = x +1 ;


           }
           i=i+1 ; 
       }
       
       System.out.println("------------------------------------------");
       
       for(int k = 0; k<=10; k++)
       {
           for(int l = 0 ; l<=10 ; l ++)
           {
               
               System.out.println(k+"x"+l+"="+(k*l));
           }
       }
    }
}
