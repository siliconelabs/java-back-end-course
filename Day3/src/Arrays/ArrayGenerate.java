package Arrays;

public class ArrayGenerate {

    public static void main(String[] args) {
        double[] a = new double[10];
        int []b = new int[4];
        float c[] = new float[10];

        b[0] = 5;
        b[2]=10;

        int[] veriler = {3,4, 5,1, 2,3,89,90};

        for(int i=0; i<veriler.length ; i++){
            System.out.println(i+". indeksteki eleman:" + veriler[i]);
        }
       /*Dizi bir kere tanımlanır, sonrasında dizideki elemanları
değiştirebilirsiniz ancak tutacağı eleman sayısını
değiştiremezsiniz.
*/

        int sayilar[] = new int[10];

        sayilar = new int[15];//burada eski dizi silindi genisletilmedi

    }
}
