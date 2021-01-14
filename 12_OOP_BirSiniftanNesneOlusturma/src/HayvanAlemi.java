
public class HayvanAlemi {
    public String isim;
    private int yas;

    public static void main(String[] args)
    {

        Insan ali=new Insan("kahve");

        System.out.println(ali.getSacRengi());
        Insan merve=new Insan("siyah");

       // HayvanAlemi kus = new HayvanAlemi();// nesnemizi oluşturduk 
        HayvanAlemi kus=new HayvanAlemi();

        kus.Solunum();

        kus.isim="Kanarya";
        kus.yas=3;
        
        HayvanAlemi tavsan = new HayvanAlemi();
        tavsan.Solunum();
        tavsan.isim = "Uzun Kulak";
        tavsan.yas = 4;
        
         kus.toString();
        
        Insan murat = new Insan();

        
        murat.toString();
        
        System.out.println("---------------------------------------");
        
        Insan rabia = new Insan();

        rabia.toString();


        System.out.println(rabia.getGozRengi());
        
        
        
        
        
    }


    public void Solunum()
    {
        System.out.println("Solunum Yapıldı");
    }

    @Override
    public String toString() {
        return "HayvanAlemi{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
