
/*----------------------------------------------------------------------------------------------------------------------
	Generic kavramı derleme zamanında türden bağımsız kod yazabilmek için tasarlanmıştır. Programcı generic bir tür
	ya da metodu türden bağımsız olarak yazar. Generic sınıf ya da metotları kullanan programcı	da hangi türde
	kullanacağına karar vererek  daha güvenli ve okunabilir kodlar yazabilir.
	Generic'ler kullanılarak derleme zamanında çok biçimli (compile time polymorphism) kodlar yazılabilmektedir.
	Generic Türler: Generic olabilecek türler şunlardır: Sınıflar, arayüzler
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıf bildiriminde generic parametreler denen isimler kullanılır. Bu isimler açısal parantezler arasında
	virgülle ayrılacak şekilde sınıf isminden sonra yazılır. Generic parametreler değişken isimlendirme kurallarına
	uygun isimlerdir. Bu isimler bildirildikleri sınıf boyunca geçerlidir (class scope, sınıf faaliyet alanı). Generic
	parametre ismi bir tür ismi anlamına gelir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class A<T> { // T generic parametre
    //...
    private T m_t;
}


abstract  class B<T, K, L> { //T, K ve L generic parametreler
    //...
    public abstract T foo(K k, L l);
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar açılım (expansion) ile kullanılabilir. Açılım generic parametrenin türünü belirtir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<String> a; // A nın String açılımı
        A<Integer> b; // A nın Integer açılımı
        A<Boolean> c; // A nın Boolean açılımı
    }
}

class A<T> { // T generic parametre
    //...
    private T m_t;
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf açılımsız kullanılırsa generic parametreler Object kabul edilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A a; // T Object kabul edilir

    }
}

class A<T> { // T generic parametre
    //...
    private T m_t;
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic açılımlar temel türlerle yapılamaz
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<int> a; // error

    }
}

class A<T> { // T generic parametre
    //...
    private T m_t;
}


/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem sarmalayan sınıflar ile açılım yapılarak çözülebilir. Yani generic parametre olarak temel türlerin
	kullanılacağı generic bir sınıf (ve metot) için sarmalayan sınıflar açılımda kullanılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<Integer> x;
        A<Boolean> y;
        A<Float> z;
        //...


    }
}

class A<T> { // T generic parametre
    //...
    private T m_t;
}


/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<Boolean, String> a;
        A<Integer, Boolean> b;
        //...
    }
}

class A<T, K> {
    //...

}

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar türünden nesne yaratılması aşağıdaki gibi yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<Boolean, String> x = new A<Boolean, String>();
        A<Integer, Float> y = new A<Integer, Float>();

        //...
    }
}

class A<T, K> {
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	Java 7 ile birlikte new operatörü ile açılım yapılırken türler yazılmayabilir. Ancak açısal parantezler olmalıdır
	(diamond syntax). Şüphesiz olmaması bir sentaks ya da semantic bir hata oluşturmaz. Ancak kesinlikle kullanımı
	tavsiye edilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<Boolean, String> x = new A<>(); //Since Java 7 : Diamond syntax
        A<Integer, Float> y = new A<>();

        //...
    }
}

class A<T, K> {
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıflar Object için kullanılacaksa Object açılımı yapılması iyi bir tekniktir. Yani generic sınıflar
	açılımsız kullanılmamalıdır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<Object> x = new A<>();

        //...
    }
}

class A<T> {
    //...

}


/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf generic olmayan bir sınıftan türetilebilir. Bu durumda generic sınıfın her açılımı
	o taban sınıftan türetilmiş olur
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B<Boolean> bb = new B<>();
        B<String> bs = new B<>();

        A x;

        x = bs;
        x = bb;

        //...
    }
}


class B<T> extends A {
    //
}


class A {
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic olmayan bir sınıf generic bir sınıfın herhangi bir açılımından türetilebilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B b = new B();
        A<String> a;

        a = b;

        b.foo("ankara");
        a.foo("istanbul");
        a.foo(10); //error
        A<Integer> ai = b; //error

        //...
    }
}

class B extends A<String> {
    //
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic olmayan bir sınıf generic bir sınıfın herhangi bir açılımından türetilebilir. Aşağıdaki örnekte
	foo metodu override edilmiş ve taban sınıfın foo metodu da çağrılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B b = new B();
        A<String> a = b;

        a.foo("istanbul");

        //...
    }
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}
class B extends A<String> {
    public void foo(String str) //override
    {
        super.foo(str);
        System.out.println(str.toUpperCase());
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte derleme zamanında tür kontrolü dolayısıyla error oluşur (type safety)
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B b = new B();
        A<String> a = b;

        a.foo("ankara");
        a.foo(3.4); //error

        //...
    }
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}

class B extends A<String> {
    public void foo(String str)
    {
        super.foo(str);
        System.out.println(str.toUpperCase());
    }
}
/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte generic A sınıfı açılımsız kullanıldığından derleme zamanı tür kontrolü yapılamaz.
	Örneğimiz için foo metoduna double türü geçirildiğinde exception oluşur
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B b = new B();
        A a = b;

        a.foo(3.4);

        //...
    }
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}
class B extends A<String> {
    public void foo(String str)
    {
        super.foo(str);
        System.out.println(str.toUpperCase());
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf başka bir generic sınıfın bir açılımından türetilebilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B<String> b = new B<>();
        A<Integer> a;

        a = b;

        a.foo(10);
        b.bar("ankara");

        B<Boolean> bb = new B<>();

        a = bb;

        bb.foo(23);
        bb.bar(true);
    }
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}

class B<T> extends A<Integer> {
    public void bar(T t)
    {
        System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic bir sınıf başka bir generic sınıftan türetilebilir. Bu durumda türemiş sınıfın her açılımı
	taban sınıfın o açılımından türetilmiş olur
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B<Integer> b = new B<>();
        A<Integer> a;

        a = b;

        b.foo(10);
        b.bar(1);

        B<String> b1 = new B<>();
        A<String> a1;

        a1 = b1;
        a1.foo("ankara");
        b1.bar("istanbul");
    }
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}

class B<T> extends A<T> {
    public void bar(T t)
    {
        System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte K generic parametresi taban sınıf için kullanılmaktadır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B<Integer, String> x = new B<>();
        A<String> y;

        y = x;
        x.bar(10, "zonguldak");
        x.foo("ankara");
        y.foo("izmir");

        //...
    }
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}

class B<T, K> extends A<K> {
    public void bar(T t, K k)
    {
        System.out.println(t);
        System.out.println(k);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte x' in türünden dolayı A<Boolean> açılımına atanamaz
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        B<Integer, String> x = new B<>();
        A<Boolean> y = x; //error

        //...
    }
}

class A<T> {
    public void foo(T t)
    {
        System.out.println(t);
    }
}

class B<T, K> extends A<K> {
    public void bar(T t)
    {
        System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının kullanımı
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("ali");
        names.add("veli");
        names.add("selami");

        for (String name : names)
            System.out.println(name.toUpperCase());

        System.out.println("***************");

        for (int i = 0; i < names.size(); ++i) {
            String str = names.get(i);

            System.out.println(str.toUpperCase());
        }
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının kullanımı. Aşağıdaki örnekte foreach döngü deyiminde döngü değişkenine atama yapılmadan önce
	int türüne otomatik kutu açılır. Benzer şekilde add metodu çağrılarında da kutulma yapılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; ++i)
            list.add(i * 10); //auto-boxing

        for (int val : list) //auto-unboxing
            System.out.printf("%d ", val);

        System.out.println();
    }
}




/*----------------------------------------------------------------------------------------------------------------------
	Çalışma zamanı sırasında generic bir sınıfın her açılımı aynı türdendir. Yani sınıf generic bile olsa o sınıfa
	ilişkin tek bir tür bulunmaktadır. Arakod içerisinde sadece A sınıfı bulunur
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<String> as = new A<>();
        A<Integer> ai = new A<>();
        A<Boolean> ab = new A<>();

        System.out.println(as.getClass().getName());
        System.out.println(ab.getClass().getName());
        System.out.println(ai.getClass().getName());
    }
}

class A<T> {
    //...
}


/*----------------------------------------------------------------------------------------------------------------------
	ArrayList sınıfının kullanımı
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<ArrayList<String>> names = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Ali");
        nameList.add("Veli");

        names.add(nameList);

        nameList = new ArrayList<>();

        nameList.add("Ayşe");
        nameList.add("Fatma");
        nameList.add("Zeynep");

        names.add(nameList);
        for (ArrayList<String> nl : names) {
            for (String name : nl)
                System.out.printf("%s ", name);
            System.out.println();
        }
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Generic açılımlarda dizi türü de kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import org.siloconLabs.util.ArrayUtil;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<int[]> list = new ArrayList<>();

        list.add(new int[] {1, 2, 3, 4});
        list.add(ArrayUtil.getRandomArray(10, 10, 20));


        for (int [] a : list) {
            for (int val : a)
                System.out.printf("%d ", val);

            System.out.println();
        }

    }
}



/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzün herhangi bir açılımını implemente eden bir sınıf içerisinde arayüzün metotları açılıma
    uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample s = new Sample();

        s.foo("ankara");
    }
}

class Sample implements IX<String> {
    public void foo(String str)
    {
        System.out.println(str.toUpperCase());
    }
}

interface IX<T> {
    void foo(T t);
}


/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzün herhangi bir açılımını implemente eden bir sınıf içerisinde arayüzün metotları açılıma
    uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        StringToLengthConverter stringToLengthConverter = new StringToLengthConverter();
        ArrayList<String> cities = new ArrayList<>();

        cities.add("ankara");
        cities.add("istanbul");
        cities.add("izmir");
        cities.add("zonguldak");

        for (String city : cities)
            System.out.printf("%d ", stringToLengthConverter.convert(city));

        System.out.println();
    }
}



class StringToLengthConverter implements IConverter<String, Integer> {
    //...
    public Integer convert(String str)
    {
        return str.length();
    }
}

interface IConverter<T, R> {
    R convert(T t);
}



/*----------------------------------------------------------------------------------------------------------------------
	25.10.2020
	Generic bir arayüzü implemente eden bir sınıf içerisinde arayüzün metotları açılıma uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample s = new Sample();

        s.foo("ankara");
        s.bar(20);
    }
}

class Sample implements IX<String>, IY<Integer> {
    public void foo(String str)
    {
        System.out.println(str.toUpperCase());
    }

    public void bar(Integer i)
    {
        System.out.println(i * i);
    }
}

interface IX<T> {
    void foo(T t);
}

interface IY<T> {
    void bar(T t);
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzü implemente eden bir sınıf içerisinde arayüzün metotları açılıma uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample<Boolean> sb = new Sample<>();
        Sample<Double> sd = new Sample<>();

        sb.foo(true);
        sb.bar(false);

        sd.foo(3.4);
        sd.bar(4.5);
    }
}

class Sample<T> implements IX<T>, IY<T> {
    public void foo(T t)
    {
        System.out.println("foo:");
        System.out.println(t);
    }

    public void bar(T t)
    {
        System.out.println("bar:");
        System.out.println(t);
    }
}

interface IX<T> {
    void foo(T t);
}

interface IY<T> {
    void bar(T t);
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic bir arayüzü implemente eden bir sınıf içerisinde arayüzün metotları açılıma uygun şekilde override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample<String, Boolean> ssb = new Sample<>();
        Sample<Integer, String> sis = new Sample<>();

        ssb.foo(true);
        ssb.bar("ankara");

        sis.foo("zonguldak");
        sis.bar(10);
    }
}

class Sample<T, K> implements IX<K>, IY<T> {
    public void foo(K k)
    {
        System.out.println("foo:");
        System.out.println(k);
    }

    public void bar(T t)
    {
        System.out.println("bar:");
        System.out.println(t);
    }
}

interface IX<T> {
    void foo(T t);
}

interface IY<T> {
    void bar(T t);
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic bir abstract sınıftan türetilen bir sınıf içerisinde taban sınıfın sanal metotları açılıma uygun şekilde
	override edilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class MyTask extends AsyncTask<String, String, Integer> {
    public Integer doInBackground(String [] params)
    {
        return null;
    }

    public void onProgressExecute(String [] progresses)
    {
        //...
    }

    public void onPostExecute(Integer result)
    {
        //...
    }
}

abstract class AsyncTask<Params, Progress, Result> {
    protected abstract Result doInBackground(Params [] params);
    public void onProgressExecute(Progress [] progresses)
    {
        //...
    }

    public void onPostExecute(Result result)
    {
        //...
    }

    //...
}


/*----------------------------------------------------------------------------------------------------------------------
	Bir sınıf generic bir arayüzün birden fazla açılımını destekleyemez. Çünkü arakodda tüm açılan generic parametrelerin
	türler Object olarak ele alınır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class Sample implements IX<Integer>, IX<String> { //error
    public void foo(String t)
    {

    }

    public void foo(Integer t)
    {

    }
}

interface IX<T> {
    void foo(T t);
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnek geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class Sample<T> implements IX<Integer>, IY<String> { //error
    public void foo(String t)
    {

    }

    public void foo(Integer t)
    {

    }
}

interface IX<T> {
    void foo(T t);
}

interface IY<T> {
    void foo(T t);
}



/*----------------------------------------------------------------------------------------------------------------------
	Generic parametrelere kısıt (constraint) verilebilir. Bu işlem için extends anahtar sözcüğü kullanılır. Aşağıdaki
	örnekte Mample sınıfı IX arayüzünü destekleyen bir tür ile açılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Mample<Sample> m;
        Mample<Integer> m1; //error
        //...
    }
}

class Mample<T extends IX> {
    public void bar(T t)
    {
        t.foo();
    }
}

class Sample implements IX {
    public void foo()
    {
        System.out.println("Sample.foo");
    }
}

interface IX {
    void foo();
}

/*----------------------------------------------------------------------------------------------------------------------
	int türden bir dizi referansı Integer türden bir dizi referansına atanamaz. Aslında sarmalayan sınıf türünden
	dizi ile sarmaladığı sınıf türünden dizi referansları arasında dönüşüm geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample<Integer> s = new Sample<>();
        int [] a = {1, 2, 4};

        s.display(a); //error
    }
}

class Sample<T> {
    //...
    public void display(T [] a)
    {
        for (T t : a)
            System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte String türden dizi ile dispaly çağrılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample<String> s = new Sample<>();
        String [] cities = {"ankara", "istanbul", "izmir"};

        s.display(cities);
    }
}

class Sample<T> {
    //...
    public void display(T [] a)
    {
        for (T t : a)
            System.out.println(t);
    }
}




/*----------------------------------------------------------------------------------------------------------------------
	Generic parametreler temel türler olarak belirlenemeyeceğinden aşağıdaki örnekte int, double ve long türden
	diziler için ayrı metotlar yazılmıştır. Bu yaklaşım örnek bazında yukarıdaki yaklaşımdan okunabililik açısından
	daha kötüdür. Bunu genellememek gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample<String> sample = new Sample<>();
        String [] names = {"ali", "veli", "selami"};
        int [] a = {1, 2, 3, 4};
        long [] b = {1L, 3L, 6L};
        double [] c = {1.4, 2.89, -3.78};

        sample.display(names);
        sample.display(a);
        sample.display(b);
        sample.display(c);
    }
}

class Sample<T> {
    public void display(long [] a)
    {
        for (long val : a)
            System.out.printf("%d ", val);

        System.out.println();
    }

    public void display(int [] a)
    {
        for (int val : a)
            System.out.printf("%d ", val);

        System.out.println();
    }

    public void display(double [] a)
    {
        for (double val : a)
            System.out.printf("%f ", val);

        System.out.println();
    }

    public void display(T [] a)
    {
        for (T t : a)
            System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Wildcard charakter nerden gelir bunu anlatıyorum
	Generic bir sınıfın türemiş sınıf açılımı aynı generic sınıfın taban sınıf açılımına doğrudan atanamaz (invariant)
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; ++i)
            list.add(i * 10);

        Sample.display(list); //error
    }
}

class Sample {
    public static void display(ArrayList<Number> list)
    {
        for (Number n : list)
            System.out.println(n);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	ornegi tur dönüstürme
	Generic bir sınıfın türemiş sınıf açılımı aynı generic sınıfın taban sınıf açılımına tür dönüştürme operatörü ile de
	dönüştürülemez (invariant)
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; ++i)
            list.add(i * 10);

        Sample.display((ArrayList<Number>)list); //error
    }
}

class Sample {
    public static void display(ArrayList<Number> list)
    {
        for (Number n : list)
            System.out.println(n);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki durum ? extends ile aşağıdaki gibi çözülebilir (covariant)
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; ++i)
            integers.add(i * 10);

        Sample.display(integers);

        System.out.println("/////////////////");
        ArrayList<Double> doubles = new ArrayList<>();

        for (double i = 0; i < 1.23; i += 0.1)
            doubles.add(i);

        Sample.display(doubles);
    }
}

class Sample {
    public static void display(ArrayList<? extends Number> list)
    {
        for (Number n : list)
            System.out.println(n);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki foo çağrısı geçersizdir  simdi de super keyword  wildcard charakter icin
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Number> list = new ArrayList<>();

        Sample.foo(list);

        ArrayList<Object> listObjects = new ArrayList<>();

        Sample.foo(listObjects); //error
    }
}

class Sample {
    public static void foo(ArrayList<Integer> list)
    {
        //...
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki foo çağrısı geçersizdir donusum olsa bile
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Number> list = new ArrayList<>();

        Sample.foo(list);

        ArrayList<Object> listObjects = new ArrayList<>();

        Sample.foo((ArrayList<Integer>)listObjects); //error
    }
}

class Sample {
    public static void foo(ArrayList<Integer> list)
    {
        //...
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Aşağıda generic açılım contravariant duruma getirilmiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Number> list = new ArrayList<>();

        Sample.foo(list);

        ArrayList<Object> listObjects = new ArrayList<>();

        Sample.foo(listObjects);
    }
}

class Sample {
    public static void foo(ArrayList<? super Integer> list)
    {
        //...
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ? işereti açılımı kullanılmıştır. Bu herhangi bir tür demektir. Ancak Object gibi düşünülmemelidir.
	Bu durumun kullanımı uygulama kursunda ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        A<?> a;

        a = new A<>();

        a.foo("ankara"); //error
        a.bar();
    }
}

class A<T> {
    public void bar()
    {

    }

    public void foo(T t)
    {
        System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	enum türleri ve exception sınıfları generic olarak bildirilemez
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

enum A<T> { //error
    //...
}

class MyException<T> extends RuntimeException { //error
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic metotlar:
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
	Generic metotlar ve çağrılması. Generic metotların çağrısında generic poarametrenin türü geçilen argümana göre
	tespit edilebiliyorsa (type deduction) çağrı açılım yapmadan da yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample s = new Sample();

        s.<String>foo("ankara");
        s.foo("ankara");
        s.foo(10);
        s.foo(true);
    }
}

class Sample {
    public <T> void foo(T t)
    {
        System.out.println(t);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki iki çağırmada da String parametreli foo çağrılır.
   Dikkat: Tür belirtilse bile String paramatreli metot çağrılır.
   Bu işlem generic bir işin türe özgü olarak farklılaşması gibi durumlarda kullanılır
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample.foo("ankara");
        Sample.<String>foo("ankara");
        Sample.foo(10);
        Sample.foo(3.4);
    }
}

class Sample {
    public static void foo(String s)
    {
        System.out.println("foo(String)");
    }

    public static void foo(int val)
    {
        System.out.println("foo(int)");
    }

    public static <T> void foo(T t)
    {
        System.out.println("foo(T)");
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz.
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample.foo("ankara");
        Sample.foo(2.3);

    }
}

class Sample<T> {
    public void bar(T t)
    {
        System.out.println(t);
    }

    public static void foo(T t) //error
    {
        System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz. Bu durumda static
	metotların da generic yapılması gerekir.

	Anahtar Notlar: Generic sınıfların static metotları çağrılırken sadece sınıf ismi
	kullanılabilir. Açılım yapılamaz
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample.foo("ankara");
        Sample.foo(2.3);

        Sample<String> ss = new Sample<>();
        Sample<Float> sf = new Sample<>();

        ss.bar("ankara");
        sf.bar(3.4F);
    }
}

class Sample<T> {
    public void bar(T t)
    {
        System.out.println(t);
    }

    public static <K> void foo(K k)
    {
        System.out.println(k);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz. Bu durumda static
	metotların da generic yapılması gerekir. Aşağıdaki örnekte static metodun generic pametresi ile sınıfın generic
	parametresi aynı isimdedir. Bu bir sorun oluşturmaz
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample.foo("ankara");
        Sample.foo(2.3);

        Sample<String> s = new Sample<>();

        s.bar("ankara");
    }
}

class Sample<T> {
    public void bar(T t)
    {
        System.out.println(t);
    }

    public static <T> void foo(T t)
    {
        System.out.println(t);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic sınıfların static metotlarında sınıfların generic parametreleri kullanılamaz. Bu durumda static ,
	metotların da generic yapılması gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample.foo("ankara", true);
        Sample.foo(2.3, 's');
    }
}

class Sample<T, K> {
    //...
    public void bar(T t, K k)
    {
        //...
    }

    public static <T, K> void foo(T t, K k)
    {
        System.out.println(t);
        System.out.println(k);
    }
}



/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte generic bir sınıfın içerisinde non-static bir metot generic yapılmıştır (member generic)
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample<Integer, Float> s;

        s = new Sample<>();

        System.out.printf("Result:%s%n", s.foo(10, 3.4F, "ankara", true));
        System.out.printf("Result:%c%n", s.foo(10, 3.4F, 'z', 9L));
    }
}

class Sample<T, K> {
    //...
    public <L, M> L foo(T t, K k, L l, M m)
    {
        System.out.println(t);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        return l;
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte generic bar metodunun T ve K parametreli isim olarak sınıfın T ve K parametre isimleriniz gizler
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class App {
    public static void main(String [] args)
    {
        Sample<Integer, Float> s;

        s = new Sample<>();
        s.foo(10, 3.4F);
        s.bar("ankara", true);
    }
}

class Sample<T, K> {
    //...
    public void foo(T t, K k)
    {
        System.out.println("foo");
        System.out.println(t);
        System.out.println(k);
    }

    public <T, K> void bar(T t, K k)
    {
        System.out.println("bar");
        System.out.println(t);
        System.out.println(k);
    }
}




/*----------------------------------------------------------------------------------------------------------------------
	Java'da generic kavrama genel olarak arakoda yansıtılmadığı için aynı paket içerisinde aynı isimde fakat
	farklı sayıda generic parametreye sahip türler bildirilemez
----------------------------------------------------------------------------------------------------------------------*/
package test;

public class Tuple<T> { //error
    //
}

class Tuple<T1, T2> { //error

}

/*----------------------------------------------------------------------------------------------------------------------
    Unit sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import org.siloconLabs.util.Unit;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Unit<String>> units = new ArrayList<>();

        units.add(new Unit<>("ankara"));
        units.add(new Unit<>("istanbul"));

        for (Unit<String> unit : units)
            System.out.println(unit);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Unit sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import org.siloconLabs.util.Unit;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Unit<String>> units = new ArrayList<>();

        units.add(Unit.of("ankara"));
        units.add(Unit.of("istanbul"));


        for (Unit<String> unit : units)
            System.out.println(unit);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Unit sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.util;

public final class Unit<T> {
    private final T m_value;

    public static <T> Unit<T> of(T value)
    {
        return new Unit<>(value);
    }

    public Unit(T value)
    {
        m_value = value;
    }

    public T getValue()
    {
        return m_value;
    }

    //...

    public String toString()
    {
        return String.format("{value : %s}", m_value);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
   Device sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import org.siloconLabs.util.Pair;

        import static org.siloconLabs.util.Pair.*;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Pair<Integer, DeviceInfo>> devices = new ArrayList<>();

        devices.add(of(1, new DeviceInfo(1, "test", 34000)));
        devices.add(of(2, new DeviceInfo(2, "weather", 55000)));

        for (Pair<Integer, DeviceInfo> devicePair : devices)
            System.out.println(devicePair);
    }
}

class DeviceInfo {
    private int m_id;
    private String m_name;
    private int m_port;

    public DeviceInfo() {}

    public DeviceInfo(int id, String name, int port)
    {
        //...
        m_id = id;
        m_name = name;
        m_port = port;
    }

    public int getId()
    {
        return m_id;
    }

    public void setId(int id)
    {
        //...
        m_id = id;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        //...
        m_name = name;
    }

    public int getPort()
    {
        return m_port;
    }

    public void setPort(int port)
    {
        //...
        m_port = port;
    }

    public String toString()
    {
        return String.format("[%d]%s:%d", m_id, m_name, m_port);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
    Pair sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import org.siloconLabs.util.Pair;

        import static org.siloconLabs.util.Pair.*;

        import java.util.ArrayList;

class App {
    public static void main(String [] args)
    {
        ArrayList<Pair<Integer, Integer>> points = new ArrayList<>();

        points.add(of(100, 100));
        points.add(of(50, 50));

        for (Pair<Integer, Integer> point : points)
            System.out.println(point);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Pair sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.util;

public final class Pair<F, S> {
    private final F m_first;
    private final S m_second;

    public Pair(F first, S second)
    {
        m_first = first;
        m_second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second)
    {
        return new Pair<>(first, second);
    }

    public F getFirst()
    {
        return m_first;
    }

    public S getSecond()
    {
        return m_second;
    }

    //...

    public String toString()
    {
        return String.format("{first : %s, second : %s}", m_first, m_second);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
    Triple sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

        import org.siloconLabs.util.Triple;

        import java.util.ArrayList;

        import static org.siloconLabs.util.Triple.of;

class App {
    public static void main(String [] args)
    {
        ArrayList<Triple<Integer, Integer, Integer>> points = new ArrayList<>();

        points.add(of(100, 100, 200));
        points.add(of(50, 50, -30));

        for (Triple<Integer, Integer, Integer> point : points)
            System.out.println(point);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Triple sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.util;

public final class Triple<F, S, T> {
    private final F m_first;
    private final S m_second;
    private final T m_third;

    public Triple(F first, S second, T third)
    {
        m_first = first;
        m_second = second;
        m_third = third;
    }

    public static <F, S, T> Triple<F, S, T> of(F first, S second, T third)
    {
        return new Triple<>(first, second, third);
    }

    public F getFirst()
    {
        return m_first;
    }

    public S getSecond()
    {
        return m_second;
    }

    public T getThird()
    {
        return m_third;
    }

    //...

    public String toString()
    {
        return String.format("{first : %s, second : %s, third : %s}", m_first, m_second, m_third);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Generic parametre türü new operatörü ile kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class Sample<T> {
    private T m_t;

    public Sample(int n)
    {
        m_t = new T(); //error
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki kuraldan dolayı generic türden dizi de new operatörü ile doğrudan yaratılamaz
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class Sample<T> {
    private T [] m_t;

    public Sample(int n)
    {
        m_t = new T[n]; //error
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki problem new Object[n] gibi yapılarak çözülebilir. Aşağıdaki kodda uyarının problem oluturduğu bir durum
	gerçekleşemez. Çünkü Object dizisinin referansı dışarıya Object [] türünden verilmemiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class Sample<T> {
    private T [] m_t;
    private int m_index;

    public Sample(int n)
    {
        m_t = (T []) new Object[n]; //Uyarı önemsiz. Şimdilik görmeyin
    }

    public boolean add(T value)
    {
        if (m_index == m_t.length)
            return false;
        m_t[m_index++] = value;

        return true;
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte de Object yaratılmış ve T türüne dönüştürülmüştür
----------------------------------------------------------------------------------------------------------------------*/
package org.siloconLabs.app;

class Sample<T> {
    private T m_t;

    public Sample(int n)
    {
        m_t = (T) new Object(); //Uyarı önemsiz
    }
    //...
}
