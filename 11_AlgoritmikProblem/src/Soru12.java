
import java.util.Scanner;


public class Soru12 {
    
    public static void main(String[] args)
    {
      System.out.println("x değerini gir");
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      
      System.out.println("y değerini gir");
      Scanner sc2 = new Scanner(System.in);
      int y = sc2.nextInt();
      denklemHesabi(x, y);
    }
    
    public static void denklemHesabi(int s1 ,int s2)
    {
        int sonuc = s1 + (s2*s2);
        System.out.println(s1 + "+"+s2+"^2="+sonuc);
    }

}
