package FinalKeyword;

public class FinalKavrami {

    public static void main(String[] args) {

        int sayi=10;
        sayi =15;

        final int sayi2;




        Kedi d1=new Kedi();
        Kedi d2=new Kaplan();


        d1.goster();
        d2.goster();


    }

}

 class Kedi {

    final static int a=90;


    final public void goster(){
        System.out.println("Parentteki goster metotu");
    }
}

class Kaplan extends Kedi{



}
/*Final olan sınıftan extend alınmaz*/
/*Final metodlar override edilemez*/