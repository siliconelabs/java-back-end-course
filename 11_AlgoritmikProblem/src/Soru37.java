
public class Soru37 {
    public static void main(String[] args)
    {
        for(int i=1;i<=8129;i++)
        {
            mukemmelSayi(i);
        }
    }
    
    public static void mukemmelSayi(int s1)
    {
        int toplam = 0;
        for(int i=1 ; i<s1 ; i++)
        {
            if(s1%i==0)
            {
                toplam = toplam + i ; 
            }
        }
        if(toplam==s1)
        {
            System.out.println(s1);
        }
    }
}
