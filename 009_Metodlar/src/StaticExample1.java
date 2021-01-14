public class StaticExample1 {


    /*----------------------------------------------------------------------------------------------------------------------
	Sınıfın static veri elemanının bir kullanımı
----------------------------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
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


