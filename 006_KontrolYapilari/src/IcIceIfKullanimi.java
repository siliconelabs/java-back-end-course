
public class IcIceIfKullanimi {
    
    
    
    public static void main(String[] args)
    {
       int sayi1 = 15 , sayi2 = 20 , sayi3 = 50;//degislkenler tanımlandı

       /*

       ***************
        *************
        */
       if(sayi1>0)
              {
                 
                 if(sayi1%3==0)
                    {
                        System.out.println("Sayi1 3'e tam bölünür.");
                        if(sayi2%2==0)
                        {
                            System.out.println("Sayi2 çift sayıdır.");
                            if((sayi3/10)%2==0)
                            {
                                System.out.println("Sayi3 ün 10 a bölümünü çift sayıdır");
                            }
                        }
                    }
                 
                 System.out.println("Sayi1 0 dan büyüktür.");
                }
       
       
       if(sayi1>0 && (sayi2%2 !=0))
       {
           System.out.println("OK");
       }
       
       if(sayi1>0)
       {
           System.out.println("Sayı 1 sağlandı");
           if(sayi2%2!=0)
           {
               System.out.println("Sayı2 Sağlandı");
           }
           
       }
       
       if(sayi1%2!=0)
       {
           int carpim = sayi3*sayi2;
           
           if(carpim%3!=0)
           {
               System.out.println("Şartlar sağlanmıştır.");
           }
           System.out.println("Sayi1 tek sayıdır");
       }
    }
    
    
    
}
