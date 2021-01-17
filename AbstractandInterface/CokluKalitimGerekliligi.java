package AbstractandInterface;

import java.util.ArrayList;

public class CokluKalitimGerekliligi {

    public static void main(String[] args) {
        PopSarkiciOzellikleri popSarkici1 = new Tarkan();
        PopSarkiciOzellikleri popSarkici2 = new Hadise();

        PopSarkiciOzellikleri dizi[] = new PopSarkiciOzellikleri[5];
        dizi[0] = popSarkici1;
        dizi[1] = popSarkici2;

        ArrayList<PopSarkiciOzellikleri> sarkicilar=new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);

        popSarkici1.sahnedeDansEt();
        popSarkici1.adiniSoyle();


    }
}



interface Kisi{
    void yemekYe();
    void sporYap();
    default void adiniSoyle(){
        System.out.println("Ben kişi interfacesiyim");
    }
    static void selamVer(){
        System.out.println("selam ver");
    }
}

interface OgrenciOzellikleri extends Kisi,UniversiteOgrencisi{
    void dersCalis();
    void okulaGit();
}

interface UniversiteOgrencisi {
    void finallereCalis();
}

class Student implements OgrenciOzellikleri{

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }

    @Override
    public void dersCalis() {

    }

    @Override
    public void okulaGit() {

    }

    @Override
    public void finallereCalis() {

    }
}

 abstract class Sarkici implements Kisi{
    abstract void sarkiSoyle();

}

interface ArabeskSarkiciOzellikleri {
     void sahnedeSigaraIc();

}

abstract interface PopSarkiciOzellikleri extends Kisi {
    abstract void sahnedeDansEt();
    void duetYap();
    static final int yas = 50;

}

class Tarkan implements PopSarkiciOzellikleri{


    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class Hadise implements PopSarkiciOzellikleri{
    @Override
    public void sahnedeDansEt() {
    }

    @Override
    public void duetYap() {

    }

    @Override
    public void yemekYe() {

    }


    @Override
    public void sporYap() {

    }
}

class ArabeskSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk şarkısı şarkı söylüyor");
        Kisi.selamVer();
    }



    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class PopSarkicisi extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Pop şarkıcısı şarkı söylüyor");
    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class MuslumBaba implements ArabeskSarkiciOzellikleri, PopSarkiciOzellikleri {


    @Override
    public void sahnedeSigaraIc() {

    }

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}