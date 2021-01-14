
public class MainClass {
   
    public static void main(String[] args)
    {
        Hesapla hesapla = new Hesapla();
        
        Boolean asalKontrol = hesapla.asalSayiKontrol(5);
        int faktoriyelSonuc = hesapla.faktoriyelHesapla(4);
        Boolean pozitifNegatifKontrol = hesapla.pozitifNegatif(-50);
        hesapla.kup(5);
        hesapla.kare(10);
        
        System.out.println("Asal Sayı = " +asalKontrol);
        System.out.println("Faktoriyel =" +faktoriyelSonuc);
        System.out.println("Pozitif Negatif = "+ pozitifNegatifKontrol);
    }
}
