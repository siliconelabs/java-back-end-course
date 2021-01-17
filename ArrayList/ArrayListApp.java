package ArrayList;
/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfında capacity kullanılır ancak nasıl büyütüleceği söylenmez. Bu sebeple ArrayList sınıfının
    capacity değerini veren bir metodu yoktur. Bu sebeple capacity bilgisi gereken kodlarda Vector sınıfı ile örnekler
    yazılacaktır.
----------------------------------------------------------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.Vector;

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının default ctor elemanı ile capcity değerini 10 olarak nesne yaratılır. Vector
    sınıfının capacity metodu capacity değerini döndürür. ArrayList/Vector sınıfının size metodu tutulan eleman sayısı
    bilgisini döndürür
----------------------------------------------------------------------------------------------------------------------*/
public class ArrayListApp {

    public static void main(String [] args)
    {
        Vector numbers = new Vector();

        System.out.printf("Capacity:%d%n", numbers.capacity());
        System.out.printf("Size:%d%n", numbers.size());

        Vector numbers2 = new Vector(23);

        System.out.printf("Capacity:%d%n", numbers2.capacity());
        System.out.printf("Size:%d%n", numbers2.size());

        /*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının add metodu sona eklemek için kullanılır. Şüphesiz bu metot gerektiğinde capacity
    değerini de uygun şekilde (amortized constant time) büyütür. Vector sınıfının default capacity büyütmesi
    var olan capacity değerinin iki katı olacak şekildedir
----------------------------------------------------------------------------------------------------------------------*/

        Vector numbers3 = new Vector(6);

        System.out.printf("Capacity:%d%n", numbers3.capacity());
        System.out.printf("Size:%d%n", numbers3.size());

        for (int i = 0; i < 12; ++i)
            numbers3.add(i * 10);

        System.out.printf("Capacity:%d%n", numbers3.capacity());
        System.out.printf("Size:%d%n", numbers3.size());
        numbers3.add(67);

        System.out.printf("Capacity:%d%n", numbers3.capacity());
        System.out.printf("Size:%d%n", numbers3.size());

    /*Index parametrel add metodu*/
        numbers3.add(2, 67);


/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının get metodu ile bir indeksteki eleman elde edilebilir
----------------------------------------------------------------------------------------------------------------------*/

        ArrayList number = new ArrayList(6);

        for (int i = 0; i < 12; ++i)
            number.add(i * 10);

        int size = number.size();

        for (int i = 0; i < size; ++i) {
            int val = (int)number.get(i);

            System.out.printf("%d ", val);
        }


        System.out.println();

        /*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının get metoduna pozitif ya da negatif bakımdan sınırlar dışında bir indeks numarası
    verildiğinde exception oluşur
----------------------------------------------------------------------------------------------------------------------*/


/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfı for-each döngü deyimi ile dolaşılabilir (iterable) bir sınıftır. for-each döngü deyiminin
    her adımında içeride tutulan eleman sırasıyla elde edilir
----------------------------------------------------------------------------------------------------------------------*/

        ArrayList numberb = new ArrayList(6);

        for (int i = 0; i < 10; ++i)
            numberb.add(i * 10);

        for (Object obj : numberb) {
            int val = (int)obj;

            System.out.printf("%d ", val);
        }

        System.out.println();

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının isEmpty metodu
----------------------------------------------------------------------------------------------------------------------*/

        System.out.println(numberb.isEmpty() ? "Boş" : "Dolu");

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının set metodu
----------------------------------------------------------------------------------------------------------------------*/

        ArrayList<Integer>
                arrlist = new ArrayList<Integer>();

        // Populating arrlist1
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);

        // print arrlist
        System.out.println("Before operation: "
                + arrlist);

        // Replacing element at the index 3 with 30
        // using method set()
        int i = arrlist.set(3, 30);

        // Print the modified arrlist
        System.out.println("After operation: "
                + arrlist);

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının clear metodu tüm elemanları siler.
----------------------------------------------------------------------------------------------------------------------*/

    }
}

/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının remove metodu
----------------------------------------------------------------------------------------------------------------------*/
class App {
    public static void main(String [] args)
    {
        ArrayList numbers = new ArrayList();


        System.out.printf("Size:%d%n", numbers.size());

        for (int i = 0; i < 15; ++i)
            numbers.add(i * 10);


        for (Object o : numbers) {
            int val = (int)o;

            System.out.printf("%d ", val);
        }
        System.out.println();


        System.out.printf("Size:%d%n", numbers.size());

        int oldVal = (int)numbers.remove(2);

        for (Object o : numbers) {
            int val = (int)o;

            System.out.printf("%d ", val);
        }
        System.out.println();

        System.out.printf("Old value:%d%n", oldVal);
       // System.out.printf("Capacity:%d%n", numbers.capacity());
        System.out.printf("Size:%d%n", numbers.size());
    }
}



