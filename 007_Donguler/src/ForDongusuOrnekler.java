/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mk
 */
public class ForDongusuOrnekler {
    
    public static void main(String[] args)
    {
        
        
         
        for(int i = 1 ; i<=100 ; i = i+1 )
        {
            System.out.println(i);
        }
        
         for(int i = 1 ; i<=100 ; i ++ )
        {
            System.out.println(i);
        }
         
         System.out.println("-----------------------------");
         
        int tekToplam = 0 ; 
        int ciftToplam = 0 ; 
        
        for(int i = 1 ; i <=100 ; i++)
        {
 
            if(i%2==0)
            {
                ciftToplam = ciftToplam + i ; 
            }else
            {
                tekToplam = tekToplam + i ; 
            }
        
        }
        
       System.out.println("Tek Sayıların Toplamı = " + tekToplam);
       System.out.println("Çift Sayıların Toplamı = " + ciftToplam);
       
       int faktoriyel = 1 ; 
       for(int i = 1 ; i<=7 ; i++)
       {
          faktoriyel = i*faktoriyel ; 
       }
       
       System.out.println("7 in faktoriyeli = " + faktoriyel);
       
       
       
       faktoriyel = 1 ; 
       for(int i = 5 ; i>=1 ; i--)
       {
          faktoriyel = i*faktoriyel ; 
          System.out.println(faktoriyel);
       }
       
       System.out.println("5 in faktoriyeli = " + faktoriyel);
    }
}
