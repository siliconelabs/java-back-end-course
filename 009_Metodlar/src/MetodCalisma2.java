
public class MetodCalisma2 {
    
    public static void main(String[] args)
    {
        dikUcgenCiz(20);
        normalUcgen(20);
        kareCiz(20);
        evCiz(20,40);

        int x=20;
        
    }
    
    public static void dikUcgenCiz(int boyut)
    {
        for(int i = 1 ; i<=boyut ; i ++)
        {
           
           for(int k = 1 ; k<=i ; k++)
           {
               System.out.print("*");
           }
            System.out.println();
        }
    }
    
    
    public static void normalUcgen(int boyut)
    {
        for(int i = 1 ; i<=boyut ; i ++)
        {
           for(int x = boyut  ; x >=i  ; x --)
           {
               System.out.print(" ");
           }
           for(int k = 1 ; k<=i ; k++)
           {
               System.out.print("*");
           }
           for(int k = 1 ; k<=i ; k++)
           {
               System.out.print("*");
           }
            System.out.println();
        }
    }
    
    public static void kareCiz(int boyut)
    {
        for(int i = 1 ; i<=boyut ; i++)
        {
            System.out.print(" ");
             for (int k = 1 ; k<=boyut ; k ++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
    }
    
    public static void evCiz(int ucgenBoyut , int kareBoyut)
    {
        normalUcgen(ucgenBoyut);
        kareCiz(kareBoyut);
    }
}
