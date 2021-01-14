package Static;

public class Dikdortgen {
    int en;
    int boy;
    static String ozellik="En ve boy degerleri birbirinden farklı olan geometrik şekildir.";
    public int alanHesapla(){
        return en * boy ;
    }


    public static void ozellikSoyle()
    {
        System.out.println("Ozellik:" + ozellik);
    }
}

class Test
{
    public static void main(String[] args) {

        Dikdortgen d1=new Dikdortgen();
        d1.en = 10;
        Dikdortgen d2 = new Dikdortgen();
        d2.en=15;
        d2.ozellik="özellik degisti";

        System.out.println(d1.ozellik);

        Dikdortgen.ozellik="özellik2";
        System.out.println(d2.ozellik);
        d1.ozellik="abc";
        System.out.println(d1.ozellik);

    }
}



