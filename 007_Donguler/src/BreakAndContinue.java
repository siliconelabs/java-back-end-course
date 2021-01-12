
public class BreakAndContinue {
    
    
    public static void main(String[] args)
    {
        for(int i = 1 ; i<=10 ; i++)
        {
            System.out.println(i);
        }
        
        System.out.println("------------------------------");
        //break : Döngüyü tamamen kırar , şart varsa şart gerçekleşince döngü sonlanır , şartlar ile kullanılırsa bir anlam taşır
        for(int i = 1 ; i<=10 ; i++)
        {
            if(i==5)
            {
                
                break;
            }
            System.out.println(i);
        }
        
         System.out.println("------------------------------");
        
        for(int i = 1 ; i<=10 ; i++)
        {
            if(i==5)
            {
                System.out.println(i);
                break;
                
            }
            System.out.println(i);
        }
        
         System.out.println("------------------------------");

        int i = 1;
         for(  ; i<=10 ; )
         {
              System.out.println("Döngüye Girildi");

              i=i+1;//i++   ++i

             break; 
            
         }
         
         System.out.println("------------------------------");
         
         // continue : döngü iöerisinde döngü kodlarının işlenmesini yarıda keser , döngüyü direk bitirmeden bir sonraki adıma geçmesini sağlar , şartla kullanılırsa bir anlam taşır
         for(int i = 1 ; i<=10 ; i ++)
         {
             if(i==6)
             {
                 continue;
             }

             System.out.println(i);
         }
         
          System.out.println("------------------------------");
         
         
         for(int i = 1 ; i<=10 ; i ++)
         {

             System.out.println(i);
         }
         System.out.println("------------------------------");
         for(int i = 1 ; i<=10 ; i ++)
         {
             System.out.println("Döngüye Girildi");
             continue;
         }
    }
}
