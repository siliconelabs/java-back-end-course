package OopDetail;


/*
	Bir nesnenin bellekte kapladığı alan "en az non-static veri elemanlarının toplam uzunluğu kadardır"
----------------------------------------------------------------------------------------------------------------------*/


class App2 {
    public static void main(String [] args)
    {
        Sample2 s, k;

        s = new Sample2();
        k = new Sample2();

        s.a = 10;
        s.b = true;

        k.a = 20;
        k.b = false;

        System.out.printf("s.a=%d%n", s.a);
        System.out.printf("s.b=%b%n", s.b);
        System.out.printf("k.a=%d%n", k.a);
        System.out.printf("k.b=%b%n", k.b);
    }
}

class Sample2 {
    public int a;
    public boolean b;
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	default deger ataması Örneğin int türü için
	sıfırken boolean türü için false değeridir
----------------------------------------------------------------------------------------------------------------------*/


class App3 {
    public static void main(String [] args)
    {
        Sample3 s;

        s = new Sample3();

        System.out.printf("s.a=%d%n", s.a);
        System.out.printf("s.b=%b%n", s.b);
    }
}

class Sample3 {
    public int a;
    public boolean b;
    //...

    public int add(int a,int b)

    {return 0;}

   public Sample3()
    {

    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Referans parametreli metotlar
----------------------------------------------------------------------------------------------------------------------*/


class App4 {
    public static void main(String [] args)
    {
        Date date = new Date();

        date.day = 10;
        date.mon = 9;
        date.year = 1976;

        DateUtil.display(date);

    }
}

class DateUtil {
    public static void display(Date date)
    {
        System.out.printf("%02d/%02d/%04d%n", date.day, date.mon, date.year);
    }
}

class Date {
    public int day, mon, year;
    //...
}


/*----------------------------------------------------------------------------------------------------------------------
	Referans parametreli metotlar içerisinde nesne üzerinde değişiklik yapılabilir
----------------------------------------------------------------------------------------------------------------------*/


class App5 {
    public static void main(String [] args)
    {
        Date2 date = new Date2();

        date.day = 10;
        date.mon = 9;
        date.year = 1976;

        DateUtil2.display(date);

        DateUtil2.changeDate(date, 11, 7, 1983);

        DateUtil2.display(date);

        int a=78;
        System.out.println(a);
        System.out.println(DateUtil2.dene(a));
        System.out.println(a);


    }
}

class DateUtil2 {

    public static int dene(int a)
    {
        a=23;
        return a;
    }

    public static void changeDate(Date2 date, int day, int mon, int year)
    {
        //...
        date.day = day;
        date.mon = mon;
        date.year = year;
    }

    public static void display(Date2 date)
    {
        System.out.printf("%02d/%02d/%04d%n", date.day, date.mon, date.year);
    }
}

class Date2 {
    public int day, mon, year;
    //...
}


/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın static veri elemanlarının tamamı sınıfın bir elemanı
	ilk kez kullanıldığında yaratılır. Program sonuna kadar yaşarlar
----------------------------------------------------------------------------------------------------------------------*/


class App6 {
    public static void main(String [] args)
    {

        System.out.println(Sample5.x);


        Sample5.x = 20;

        System.out.println(Sample5.x);
    }
}

class Sample5 {
    public static int x=10;
    public int b=12;


    public static void foo()
    {
        //...
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın non-static bir metodu içerisinde aynı sınıfın static bir metodu doğrudan çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/


class App7 {
    public static void main(String [] args)
    {
        //...
        Sample6 s1=new Sample6();

        s1.foo(3);

    }
}

class Sample6 {

    public static void bar(int a)
    {

    }

    public void foo(int a)

    {
        bar(a);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın static bir metodu içerisinde o sınıfın non-static bir veri elemanına doğrudan erişilemez
----------------------------------------------------------------------------------------------------------------------*/


class App8 {
    public static void main(String [] args)
    {
        Sample7.bar(4);
    }
}

class Sample7 {
    public int x;

    public static void bar(int a)
    {
       // x = a; //error
    }

}

/*----------------------------------------------------------------------------------------------------------------------
	 Sınıfın static bir metodu içerisinde o sınıfın non-static bir metodu doğrudan çağrılamaz
----------------------------------------------------------------------------------------------------------------------*/


class App9 {
    public static void main(String [] args)
    {
        //...
    }
}

class Sample8 {
    public int x;
    public static void bar(int a)
    {
        //foo(a);//error
    }

    public void foo(int a)
    {
        x = a;
    }

}


/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örnekte doğrudan erişim olmadığından bir problem oluşmaz
----------------------------------------------------------------------------------------------------------------------*/


class App10 {
    public static void main(String [] args)
    {
        //...
    }
}

class Sample9 {
    public int x;

    public static void bar(int a)
    {
        Sample9 s = new Sample9();

        s.foo(a);
    }

    public void foo(int a)
    {
        x = a;
    }

}

/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static bir metodu içerisinde o sınıfın static bir veri elemanına doğrudan erişilebilir
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static bir metodu içerisinde o sınıfın static bir metodu doğrudan çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/

class App11{
    public static void main(String [] args)
    {
        Sample10.foo(67);

        System.out.println(Sample10.x);
    }
}

class Sample10 {
    public static int x;

    public static void foo(int a)

    {
        x = a;
    }

    public static void bar(int a)

    {
        foo(a);
    }

}
