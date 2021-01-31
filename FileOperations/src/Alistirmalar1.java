import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Alistirmalar1 {
    public static void main(String[] args) {

        //1. İstiklal marşını bir dosyaya kaydedip src klasoru altına yapıstırın
        //Sonrasında bu dosyadaki toplam karakter,kelime ve satır sayısını ekranda gösteren uygulamayı yazınız.
        //En çok tekrar eden kelimeyi bulunuz

        int toplamKarakterSayisi=0;
        int toplamKelimeSayisi=0;
        int toplamSatirSayisi=0;
        HashMap<String, Integer> kelimeTekrarMap = new HashMap<>();

        try(BufferedReader okuyucu = new BufferedReader(new FileReader("istiklal.txt"))) {

            String oankiSatir=okuyucu.readLine();

            while (oankiSatir != null){

               toplamSatirSayisi++;


               String[] satirdakiKelimeDizisi = oankiSatir.toLowerCase().split(" ");

               toplamKelimeSayisi=toplamKelimeSayisi+satirdakiKelimeDizisi.length;

               for(String kelime : satirdakiKelimeDizisi)
               {

                   if(kelimeTekrarMap.containsKey(kelime)){

                       kelimeTekrarMap.put(kelime, kelimeTekrarMap.get(kelime)+1);

                   }else{
                       kelimeTekrarMap.put(kelime,1);
                   }



                   toplamKarakterSayisi = toplamKarakterSayisi + kelime.length();
               }


               oankiSatir=okuyucu.readLine();
            }
            System.out.println("toplam satır sayısı:"+toplamSatirSayisi);
            System.out.println("toplam kelime sayısı :"+toplamKelimeSayisi);
            System.out.println("toplam karakter sayısı :"+toplamKarakterSayisi);

            int tekrarSayisi=0;
            String enCokTekrarEdenKelime = null;


            for(Map.Entry<String,Integer> temp : kelimeTekrarMap.entrySet()){
                if(temp.getValue() > tekrarSayisi && !temp.getKey().equals("")){

                    enCokTekrarEdenKelime=temp.getKey();
                    tekrarSayisi=temp.getValue();
                }

            }
            System.out.println("En çok tekrar eden kelime :"+enCokTekrarEdenKelime+" tekrar sayısı:"+tekrarSayisi);




        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
