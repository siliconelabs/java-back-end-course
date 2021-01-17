package StaticBlock;

import java.util.Random;
import java.util.Scanner;

class App {
    // filename: Main.java

    static int i;
    int j;

    // start of static block
    static {
        i = 10;
        System.out.println("static block called ");
    }
    // end of static block
    public App()
    {
        System.out.println("default const calıstı");
    }
}

class Main {
    public static void main(String args[]) {

        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.

        App x=new App();

    }
}

// filename: Main.java
class Test {
    static int i=90;
    int j;
    static {
         ++i;
        System.out.println("static block called "+i);
    }
    Test(){
        ++i;
        System.out.println("Constructor called");
    }
}
/*tüm static bloklar yukarıdan aşağıya sırasıya bir kez olmak
        üzere çalıştırılır
        ----------------------------------------------------------------------------------------------------------------------*/
class Main2 {
    public static void main(String args[]) {

        // Although we have two objects, static block is executed only once.
        Test t1 = new Test();
        Test t2 = new Test();
    }
}


class App2 {
    public static void main(String [] args)
    {
        Sample.foo();
        Sample.foo();
    }
}

class Sample {
    static {
        System.out.println("static initializer1");
    }
    //...

    static {
        System.out.println("static initializer2");
        foo();

        /*----------------------------------------------------------------------------------------------------------------------
    static bloklar static metotlar gibidir yani bu bloklarda sınıfın yalnızca static elemanlarına erişilebilir
----------------------------------------------------------------------------------------------------------------------*/
        //bar();//error
    }

    public static final double PI;

    static {
        PI = 3.14;
        /*----------------------------------------------------------------------------------------------------------------------
    Sınıfın final static veri elemanlarına static bloklarda değer atanabilir. Şüphesiz burada değer atanabilmesi
    için bildirim noktasında atanmamış olması gerekir
----------------------------------------------------------------------------------------------------------------------*/

        System.out.println("static initializer3");
    }

    public static void foo()
    {
        //..
    }

    public void bar()
    {
        //..
    }


}

/*----------------------------------------------------------------------------------------------------------------------
    static bloğun bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/




class App3 {
    public static void main(String [] args)
    {
        System.out.println(Sample3.VAL);
        System.out.println(Sample3.VAL);
    }
}

class Sample3 {
    public static final int VAL;
    /*----------------------------------------------------------------------------------------------------------------------
        Bir sınıf içerisindeki tüm static blokların kendi faaliyet alanları vardır. Yani aslında bunlar ayrı metotlar
        gibi düşünülebilir
    ----------------------------------------------------------------------------------------------------------------------*/
    static {
        Random r = new Random();

        Scanner kb = new Scanner(System.in);
        System.out.print("min?");
        int min = Integer.parseInt(kb.nextLine());

        System.out.print("max?");
        int max = Integer.parseInt(kb.nextLine());

        VAL = r.nextInt(max - min) + min;
    }
    //...
}


/*----------------------------------------------------------------------------------------------------------------------

    Yukarıdaki örnek özelinde static blok aşağıdaki gibi yazılan metot olarak düşünülebilir
----------------------------------------------------------------------------------------------------------------------*/


class App4 {
    public static void main(String [] args)
    {
        System.out.println(Sample4.VAL);
        System.out.println(Sample4.VAL);

        Sample4 s = new Sample4();
        Sample4 k = new Sample4();

    }
}

class Sample4 {
    private static int initVal()
    {
        Random r = new Random();

        Scanner kb = new Scanner(System.in);
        System.out.print("min?");
        int min = Integer.parseInt(kb.nextLine());

        System.out.print("max?");
        int max = Integer.parseInt(kb.nextLine());

        return r.nextInt(max - min) + min;
    }


    public static final int VAL = initVal();

    /*----------------------------------------------------------------------------------------------------------------------
        Bir sınıfın non-static blokları olabilir. Bu bloklar her nesne için yukarıdan aşağıya olmak üzere çalıştırılır.
        Detaylar aşağıdaki örneklerdedir
    ----------------------------------------------------------------------------------------------------------------------*/
    {
        System.out.println("non-static initializer1");
    }


    {
        System.out.println("non-static initializer2");
    }
    //...
}



/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın non-static blokları her ctor'un başında çalıştırılacak kısımdır. Yani non-static bloğa ilişkin
    kodların her ctor'un gizlice yerleştirildiğini düşünebilir
----------------------------------------------------------------------------------------------------------------------*/


class App5 {
    public static void main(String [] args)
    {

        Sample5 k = new Sample5(10);

        //...
    }
}

class Sample5 {
    public int a;

    {
        System.out.printf("a=%d%n", a);

    }

    public Sample5()
    {
        System.out.println("Sample.Sample()");
    }

    public Sample5(int a)
    {
        System.out.println("Sample.Sample(int)");
    }



  public final static double PI=45;
    public static int g=10;
    static {

        System.out.println("static initializer9");

        System.out.println("static initializer3");
    }
}



/*----------------------------------------------------------------------------------------------------------------------
    super ctor sentaksı kullanıldığında static ve non-static blokların çalıştırılma sırası
----------------------------------------------------------------------------------------------------------------------*/


class App6 {
    public static void main(String [] args)
    {
        B x = new B();

        System.out.println("*****************");
        B y = new B(20);

    }
}

class A {

    static {
        System.out.println("static block A");
    }

    {
        System.out.println("non-static initializer of A");
    }

    public A()
    {
        System.out.println("A.A()");
    }

    public A(int a)
    {
        System.out.println("A.A(int)");
    }
}

class B extends A {

    static {
        System.out.println("static block B");
    }

    {
        System.out.println("non-static initializer of B");
    }

    public B()
    {
        System.out.println("B.B()");
    }

    public B(int a)
    {
        super(a);
        System.out.println("B.B(int)");
    }
}


/*----------------------------------------------------------------------------------------------------------------------
    Sınıfın non-static final veri elemanlarına non-static blok içerisinde değer atanabilir
----------------------------------------------------------------------------------------------------------------------*/


class App7 {
    public static void main(String [] args)
    {
        Sample6 s = new Sample6();

        System.out.printf("s.val=%d%n", s.val);

        Sample6 k = new Sample6();

        System.out.printf("k.val=%d%n", k.val);
    }
}

class Sample6 {
    public final int val;

    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("min?");
        int min = Integer.parseInt(kb.nextLine());

        System.out.print("max?");
        int max = Integer.parseInt(kb.nextLine());

        val = r.nextInt(max - min) + min;
    }
    //...
}



