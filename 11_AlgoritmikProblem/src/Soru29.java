
import java.util.Scanner;


public class Soru29 {
    
    public static void main(String[] args)
    {
        String butun ="";
        for(int i = 1 ; i<=5 ; i++)
        {
            System.out.println(i+". String ifadeyi gir");
            Scanner sc = new Scanner(System.in);
            String ifade = sc.nextLine();
            butun = butun +"-"+ ifade;
        }
        System.out.println(butun);
    }
}
