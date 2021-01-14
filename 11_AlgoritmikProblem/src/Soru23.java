
import java.util.Scanner;


public class Soru23 {
    public static void main(String[] args)
    {
        System.out.println("Sayı Gir");
        
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        int i =  1 ; 
        while ((i*i)!=sayi && i<=(sayi/2))
        {
            i=i+1;
        }   
        if((i*i)==sayi)
        {
            System.out.println(sayi+" "+ i + " nin karesidir");
        }
        System.out.println("i="+i);
        
    }
}
