
public class Hayvan {
    public String renk ;
    public int hayvanAyakSayi ; 
    public String hayvanIsmi;
    
    public Hayvan() // Default Kurucu  Metod : Herhangi Bir Parametresi Yok
    {
        hayvanAyakSayi = 4 ; 
        hayvanIsmi = "Şanlı";
        renk = "Siyah";
        cikti();
    }
    
    public void cikti()
    {
        
        System.out.println("Default Kurucu Metod");
    }
}
