import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Alistirmalar2 {

    public static void main(String[] args) {
        ArrayList<Calisan> calisanlar=new ArrayList<>();


        try(BufferedReader okuyucu=new BufferedReader(new FileReader("maas.txt"))) {

            String tekSatir=okuyucu.readLine();

            while (tekSatir != null){

                String[] tekSatirDizisi=tekSatir.split(" ");

                String isim = tekSatirDizisi[0];
                int maas = Integer.parseInt(tekSatirDizisi[1]);
                Calisan geciciCalisan = new Calisan(maas,isim);
                calisanlar.add(geciciCalisan);

                tekSatir=okuyucu.readLine();
            }

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(calisanlar);

        try(BufferedWriter yazici=new BufferedWriter(new FileWriter("sirali_maas.txt"))) {

            for(Calisan gecici : calisanlar){

                yazici.write(gecici.isim+" "+gecici.maas);
                yazici.newLine();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
class Calisan implements Comparable{

    int maas;
    String isim;

    public Calisan(int maas, String isim) {
        this.maas = maas;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "maas=" + maas +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Calisan Calisan2=(Calisan)o;

        if(this.maas < Calisan2.maas){
            return 1;
        }else if (this.maas > Calisan2.maas){
            return -1;
        }
        else return 0;

    }
}