package AbstractandInterface;

import java.util.ArrayList;

public class InterfaceKavrami {


    public static void main(String[] args) {

        Elma x=new Elma();
        Yenilebilir aa=new Elma();
        Yenilebilir bb = new Inek();



        ArrayList<Yenilebilir> yenilebilenSeyler=new ArrayList<>();
        A a=new A();
        System.out.println(a.methodB(2));

    }
}



class A implements B
{
    public int methodB(int i)
    {
        return i =+ i * i;
    }
}

interface B
{

    int methodB(int i);
}


/*class C extends B,A{

}*/



interface Yenilebilir{

     boolean equals(Object obj);


     int hashCode();


     String toString();
     void yenmeSekli();
}


class Elma extends ProtectedKullanimi implements Yenilebilir{

    void elmaMetotu(){

    }

    @Override
    protected void protectedMetot() {
        super.protectedMetot();
        System.out.println(protectedDegisken);
    }

    @Override
    public void yenmeSekli() {

    }
}

class Inek implements Yenilebilir{

    void inekMetotu(){}

    @Override
    public void yenmeSekli() {

    }
}