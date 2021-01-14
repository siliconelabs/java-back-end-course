
import java.util.Random;
import java.util.Scanner;


public class MainClass {
   public static void main(String[] args)
   {
       Insan ins1 = new Insan("Murat",28);
       System.out.println(ins1.isim);
       System.out.println(ins1.yas);
       System.out.println(ins1.boy);
       
       Insan ins2 = new Insan();
       
       
       Insan ins3 = new Insan(65,25000,28);
       
       System.out.println(ins3.isim);
       System.out.println(ins3.yas);
       System.out.println(ins3.boy);
       
        
   }
}
