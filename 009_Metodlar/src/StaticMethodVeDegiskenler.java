public class StaticMethodVeDegiskenler {

    public static void main(String [] args)
    {
        Sample.foo();
        Sample.x = 10;

        System.out.println(Sample.x);


        Sample.x = 20;

        System.out.println(Sample.x);
    }
}

class Sample {
    public static int x;

    public static void foo()
    {
        //...
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static veri elemanının bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/


class App {
    public static void main(String [] args)
    {
        for (int i = 0; i < 10; ++i) {
            Alien alien = new Alien();
            //
        }

        for (int i = 0; i < 20; ++i) {
            Soldier soldier = new Soldier();
            //
        }

        System.out.printf("Number of Soldiers:%d%n", Soldier.count);
        System.out.printf("Number of Aliens:%d%n", Alien.count);
    }
}

class Soldier {
    public static int count;
    public int no;
    //...

    public Soldier()
    {
        ++count;
    }
}

class Alien {
    public static int count;
    public int numberOfArms;
    public int color;
    //...

    public Alien()
    {
        ++count;
    }
}

