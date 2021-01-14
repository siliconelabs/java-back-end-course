
public class MainClass {
    public static void main(String[] args)
    {
        FarkliTipteParametre farkliParametre = new FarkliTipteParametre();
        farkliParametre.sil("murat", "kisiler");
        farkliParametre.sil(3, "kisiler");
        
        ParametreSayisi prm = new ParametreSayisi();
        prm.hesapla(4, 5);
        prm.hesapla(2444, 2,6);
        
        ParametreYerFarki yer = new ParametreYerFarki();
        yer.sil("kisiler", 3);
        yer.sil(3, "kisiler");
    }
}
