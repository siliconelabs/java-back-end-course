package Enum;



// An Enum class
enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}


 class Test
{
    Day day;

    // Constructor
    public Test(Day day)
    {
        this.day = day;
    }

    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day)
        {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    // Driver method
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Test t1 = new Test(Day.valueOf(str));
        t1.dayIsLike();
    }
}

// Java program to demonstrate working of values(),
// ordinal() and valueOf()
enum Color5
{
    RED, GREEN, BLUE;
}

class Test2
{
    public static void main(String[] args)
    {
        // Calling values()
        Color5 arr[] = Color5.values();

        // enum with loop
        for (Color5 col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color5.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}


// Java program to demonstrate that enums can have constructor
// and concrete methods.

// An enum (Note enum keyword inplace of class keyword)
enum Color6
{
    RED, GREEN, BLUE;

    // enum constructor called separately for each
    // constant
    private Color6()
    {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

class Test6
{
    // Driver method
    public static void main(String[] args)
    {
        Color6 c1 = Color6.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}





/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte yön bilgisine ilişkin elemanlar int türden olduğundan okunabilirlik
    zayıftır
----------------------------------------------------------------------------------------------------------------------*/


class App {
    public static void main(String [] args)
    {
        StickyMan stickyMan = new StickyMan();

        stickyMan.move(1); //right
        stickyMan.move(3); //left
        stickyMan.move(4); //bottom
        stickyMan.move(2); //top

    }
}

class StickyMan {
    //...
    public void move(int direction)
    {
        //...
    }
}


/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte yazı karşılaştırması yapıldığında göreceli bir yavaşlama olabilir.
    Ayrıca yazının kontrolü derleme zamanında yapılmadığından yazının yanlış olması durumunda
    programcı bunu farkedemeyebilir
----------------------------------------------------------------------------------------------------------------------*/


class App2 {
    public static void main(String [] args)
    {
        StickyMan2 stickyMan = new StickyMan2();

        stickyMan.move("right");
        stickyMan.move("left");
        stickyMan.move("bottom");
        stickyMan.move("top");
    }
}

class StickyMan2 {
    //...
    public void move(String direction)
    {
        //...
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte çağırma sırasında okunabilirlik artmıştır. Ayrıca karşılatırma int türü üzerinden
    yapıldığından String' e göre daha iyidir. Ancak metoda bakıldığında parametreye ilişkin ön bir çıkarım
    yapılamamaktadır
----------------------------------------------------------------------------------------------------------------------*/


class App3 {
    public static void main(String [] args)
    {
        StickyMan3 stickyMan = new StickyMan3();

        stickyMan.move(Direction.RIGHT);
        stickyMan.move(Direction.LEFT);
        stickyMan.move(Direction.BOTTOM);
        stickyMan.move(Direction.TOP);
    }
}

class Direction {
    private Direction() {}
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    public static final int LEFT = 3;
    public static final int BOTTOM = 4;
}

class StickyMan3 {
    //...
    public void move(int direction)
    {
        //...
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki problemler aşağıdaki gibi bir sunıf yazılarak çözülebilir. Ancak her bu tarz sınıf için
    aynı şekilde bir tasarım yapılması gerekir
----------------------------------------------------------------------------------------------------------------------*/
class App4 {
    public static void main(String [] args)
    {
        StickyMan4 stickyMan = new StickyMan4();

        stickyMan.move(Direction2.RIGHT);
        stickyMan.move(Direction2.LEFT);
        stickyMan.move(Direction2.BOTTOM);
        stickyMan.move(Direction2.TOP);

        System.out.println(Direction2.LEFT.ordinal());

        for (Direction2 d : Direction2.values())
            System.out.println(d.ordinal());
    }
}

class Direction2 {
    private final int m_ordinal;
    private static final Direction2 [] m_values = {
            new Direction2(0),
            new Direction2(1),
            new Direction2(2),
            new Direction2(3)};
    private Direction2(int ordinal) {m_ordinal = ordinal;}
    public static final Direction2 RIGHT = m_values[0];
    public static final Direction2 TOP =  m_values[1];
    public static final Direction2 LEFT =  m_values[2];
    public static final Direction2 BOTTOM =  m_values[3];

    public static Direction2 [] values() {return m_values;}
    public int ordinal() {return m_ordinal;}
}

class StickyMan4 {
    //...
    public void move(Direction2 direction)
    {
        //...
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    enum türü ile artık yukarıdaki işlemler daha da basitleştirilebilir
----------------------------------------------------------------------------------------------------------------------*/


class App5 {
    public static void main(String [] args)
    {
        StickyMan5 stickyMan = new StickyMan5();

        stickyMan.move(Direction3.RIGHT);
        stickyMan.move(Direction3.LEFT);
        stickyMan.move(Direction3.BOTTOM);
        stickyMan.move(Direction3.TOP);

        System.out.println(Direction3.LEFT.ordinal());

        for (Direction3 d : Direction3.values())
            System.out.println(d.ordinal());
    }
}

enum Direction3 {
    RIGHT, TOP, BOTTOM, LEFT
}

class StickyMan5 {
    //...
    public void move(Direction3 direction)
    {
        //...
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    enum içerisinde bildirilen isimler enum sabiti olarak adlandırılır. Bu isimler public, static, final ve
    ilgili enum türündendir. Ancak bildirim sırasında public, static, final veya tür ismi yazılamaz.
    enum sınıfının toString metodu ilgili sabitin yazısal karşılığını verir
----------------------------------------------------------------------------------------------------------------------*/


class App6 {
    public static void main(String [] args)
    {
        Color c = Color.BLUE;

        System.out.println(c.toString());

    }
}

enum Color {
    RED, GREEN, BLUE
}

/*----------------------------------------------------------------------------------------------------------------------
    Her enum türünün ordinal isimli bir metodu vardır
----------------------------------------------------------------------------------------------------------------------*/


class App7 {
    public static void main(String [] args)
    {
        Color2 c = Color2.BLUE;

        System.out.println(c.ordinal());
    }
}

enum Color2 {
    RED, GREEN, BLUE
}

/*----------------------------------------------------------------------------------------------------------------------
    enum türlerinin static values isimli metodu tüm sabitlerin bulunduğudu bir referans dizisi referansı döndürür
----------------------------------------------------------------------------------------------------------------------*/


class App8 {
    public static void main(String [] args)
    {
        for (Color3 color : Color3.values())
            System.out.println(color.toString());
    }
}

enum Color3 {
    RED, GREEN, BLUE
}