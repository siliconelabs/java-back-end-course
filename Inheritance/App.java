/*----------------------------------------------------------------------------------------------------------------------
    Türemiş sınıf nesnesinin uzunluğu = Taban sınıf nesnesinin uzunluğu + yeni eklenen non static veri elemanlarının
    uzunluğu biçiminde düşünülebilir
----------------------------------------------------------------------------------------------------------------------*/
package Inheritance;

public class App {
    public static void main(String [] args)
    {
        C c = new C();

        c.x = 10;
        c.y = 20;
        c.z = 4.5;

        System.out.printf("c.x=%d%n", c.x);
        System.out.printf("c.y=%d%n", c.y);
        System.out.printf("c.z=%f%n", c.z);
    }
}
class C extends B {
    public double z;
}

class B extends A {
    public int y;
    //...
}
class A {
    public int x;
    //...
}


/*----------------------------------------------------------------------------------------------------------------------
    Türemiş sınıf nesnesi yaratıldığında türemiş sınıfın ilgili ctor'u çağrılmadan önce taban sınıfının ctor'u
    çağrılır
----------------------------------------------------------------------------------------------------------------------*/


class App2 {
    public static void main(String [] args)
    {
        B2 x = new B2();
        System.out.println("************");
        B2 y = new B2(10);

    }
}

class B2 extends A2 {
    public B2(int a)
    {
        System.out.println("B.B(int)");
    }

    public B2()
    {
        System.out.println("B.B()");
    }
}
class A2 {
    public A2()
    {
        System.out.println("A.A()");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Türemiş bir sınıfın ctor'u içerisinde hiç bir belirtme yapılmazsa bu durumda taban sınıfının default ctor'u çağrılır.
    Ancak sınıfın default ctor'u yoksa veya default ctor'u private ise türemiş sınıfta error oluşur
----------------------------------------------------------------------------------------------------------------------*/


class App3 {
    public static void main(String [] args)
    {
        B3 x = new B3();
        System.out.println("************");
        B3 y = new B3(10);
    }
}

class B3 extends A3 {
    public B3(int a) //error
    {
        super(a);
        System.out.println("B.B(int)");
    }

    public B3() //error
    {
        super(45);
        System.out.println("B.B()");
    }
}
class A3 {
    private A3()
    {
        System.out.println("A.A()");
    }

    public A3(int a)
    {
        System.out.println("A.A(int)");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Programcı türemiş sınıfının ctor'unun hemen başında taban sınıfın ilgili ctor'unun çağrılmasını sağlayabilir.
    Bu durumda super ctor sentaksı kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/


class App4 {
    public static void main(String [] args)
    {
        B4 x = new B4();
        System.out.println("************");
        B4 y = new B4(10);
    }
}

class B4 extends A4 {
    public B4(int a)
    {

        /*----------------------------------------------------------------------------------------------------------------------
    super ctor sentaksı ctor'un ilk deyimi olmalıdır
----------------------------------------------------------------------------------------------------------------------*/
        super(a);
        System.out.println("B.B(int)");
    }

    public B4()
    {
        System.out.println("B.B()");
    }
    /*----------------------------------------------------------------------------------------------------------------------
        Aşağıdaki örnekte uygun (applicable) ctor bulunamadığından error oluşur
    ----------------------------------------------------------------------------------------------------------------------*/
    public B4(double a)
    {
       // super(a); //error
        System.out.println("B.B(int)");
    }

    /*----------------------------------------------------------------------------------------------------------------------
        super ctor sentaksı yalnızca ctor içerisinde geçerlidir
    ----------------------------------------------------------------------------------------------------------------------*/
    public void foo()
    {
       // super(0); //error
    }
}
class A4 {
    public A4()
    {
        System.out.println("A.A()");
    }

    public A4(int a)
    {
        System.out.println("A.A(int)");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Bir dizi türetme durumunda ctor'ların çağrılması
----------------------------------------------------------------------------------------------------------------------*/

class App5 {
    public static void main(String [] args)
    {
        C5 x = new C5(10);

        //...
    }
}

class C5 extends B5 {
    public C5(int a)
    {
        super(a);
        System.out.println("C.C(int)");
    }
}

class B5 extends A5 {
    public B5(int a)
    {
        super(a);
        System.out.println("B.B(int)");
    }
    public B5()
    {
        System.out.println("B.B()");
    }
}

class A5 {


    public A5()
    {
        System.out.println("A.A()");
    }

    public A5(int a)
    {
        System.out.println("A.A(int)");
    }
}


/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın bir ctor'u içerisinde başka bir ctor'unun çağrılması this ctor sentaksı ile sağlanabilir
----------------------------------------------------------------------------------------------------------------------*/


class App6 {
    public static void main(String [] args)
    {
        A6 x = new A6();

    }
}

class A6 {
    public A6()
    {
        /*----------------------------------------------------------------------------------------------------------------------
    this ctor sentaksının da ctor'un ilk deyimi olması zorunludur
----------------------------------------------------------------------------------------------------------------------*/
        this(0);
        System.out.println("A.A()");
    }

    public A6(int a)
    {

        System.out.println("A.A(int)");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    this ctor sentaksında döngüsel durum geçersizdir
----------------------------------------------------------------------------------------------------------------------*/

class App7 {
    public static void main(String [] args)
    {
        A7 x = new A7();

    }
}

class A7 {
    public A7() //error
    {
        this(0);
        System.out.println("A.A()");
    }

    public A7(int a) //error
    {
        //this();
        System.out.println("A.A(int)");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Metod cagırmada super sınıfa bakılması durumu
----------------------------------------------------------------------------------------------------------------------*/
class App8 {
    public static void main(String [] args)
    {
        B8 b = new B8();

        b.bar(20);

        System.out.printf("b.x=%d%n", b.x);
    }
}

class B8 extends A8 {
    public void bar(int a)
    {
        x = a;
        foo();
        System.out.println("B.bar");


    }

    public void foo()
    {
        System.out.println("A.foo");
    }
}

class A8 {
    public int x;

    public void foo()
    {
        System.out.println("A.foo");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Sınıfın protected bölümüne aşağıdaki gibi erişim geçersizdir
----------------------------------------------------------------------------------------------------------------------
package test;

public class A {
    protected int x;
    protected void foo()
    {
        System.out.println("A.foo");
    }
}

package mest;

        import test.A;

public class B extends A {
    public void bar()
    {
        A a = new A();

        a.x = 10;//error
        a.foo(); //error
    }
}
*/

/*----------------------------------------------------------------------------------------------------------------------
    Sınıfın protected bölümüne aşağıdaki gibi erişim geçerlidir. Bu durumda türemiş sınıf kendisine ait olan
    protected veri elemanlarına erişmiş olur. Şüphesiz metotlar da dolaylı olarak o nesneye ilişkin olduğundan yine benzer
    durum geçerlidir
----------------------------------------------------------------------------------------------------------------------

package test;

public class A {
    protected int x;
    protected void foo()
    {
        System.out.println("A.foo");
    }
}

package mest;

        import test.A;

public class B extends A {
    public void bar()
    {
        x = 10;
        foo();
    }
}
*/


/*----------------------------------------------------------------------------------------------------------------------
    Türemiş sınıf türünden bir referans taban sınıf türünden bir referansa doğrudan atanabilir (upcasting)
----------------------------------------------------------------------------------------------------------------------*/


class App9 {
    public static void main(String [] args)
    {
        B9 b= new B9();
        b.x = 10;
        b.y = 20;

        A9 a;

        a = b; //upcasting

        System.out.printf("b.x=%d%n", b.x);
        System.out.printf("a.x=%d%n", a.x);

        ++a.x;
        System.out.printf("a.x=%d%n", a.x);
        System.out.printf("b.x=%d%n", b.x);

        Sample s = new Sample();

        s.foo(b);//upcasting

        System.out.printf("b.x=%d%n", b.x);

        C9 c = new C9();

        c.x = 10;
        c.y = 20;
        c.z = 34;

       b = c;

        System.out.printf("b.x=%d%n", b.x);
        System.out.printf("b.t=%d%n", b.y);

         a = c;

        System.out.printf("a.x=%d%n", a.x);



    }
}
class Sample {
    public void foo(A9 a)
    {
        System.out.printf("a.x=%d%n", a.x);
        ++a.x;
    }
}

class C9 extends B9 {
    public int z;
}

class B9 extends A9 {
    public int y;
}
class A9 {
    public int x;
}

/*----------------------------------------------------------------------------------------------------------------------
    Farklı türden referanslar birbirlerine tür dönüştürme operatörü kullanılarak bile atanamazlar
----------------------------------------------------------------------------------------------------------------------*/


class App10 {
    public static void main(String [] args)
    {
        A10 x = new A10();
        B y;

        //y = (B)x; //error
    }
}

class B10 {

}
class A10 {

}



