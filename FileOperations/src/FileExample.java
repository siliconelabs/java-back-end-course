import java.io.*;
import java.util.ArrayList;

public class FileExample {

    public static void main(String[] args)  {

        try(BufferedReader okuyucu= new BufferedReader(new FileReader("karakter.txt")))
        {
            String input;

            while ((input= okuyucu.readLine())!=null)
            {
                String[]arr=input.split(" ");

                for(String x:arr)
                {
                    System.out.println(x);
                }

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}

class Ogrenci implements Serializable{

    int id;
    String isim;
    boolean aktif;
    private final long serialVersionUID=1L;

    public Ogrenci(int id, String isim, boolean aktif) {
        this.id = id;
        this.isim = isim;
        this.aktif = aktif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", aktif=" + aktif +
                '}';
    }
}
