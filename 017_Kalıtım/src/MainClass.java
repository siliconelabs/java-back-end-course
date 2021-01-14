
public class MainClass {
    
    public static void main(String[] args)
    {
       Memeliler memeli = new Memeliler();
       memeli.isim="fil";
       memeli.beslenme();
       memeli.solunum();
       memeli.bosaltim();
       memeli.sutleBesle();
       
       
       Surungenler surungen = new Surungenler();
       surungen.solunum();
       surungen.bosaltim();
       surungen.beslenme();
       Hayvanlar hayvan = new Hayvanlar();
       
    }
}
