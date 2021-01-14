
public class Insan {
    private String sacRengi;
    private String gozRengi;
    private int yas;
    private int kilo;
    private int boy;
    public static int abc;

    public Insan(String sacRengi, String gozRengi, int yas, int kilo, int boy) {
        this.sacRengi = sacRengi;
        this.gozRengi = gozRengi;
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
    }

    public Insan(String sac) {
        this.sacRengi = sac;
    }

    public Insan()
    {}

    public String getSacRengi() {
        return this.sacRengi;
    }

    public String getGozRengi() {
        return gozRengi;
    }

    public int getYas() {
        return yas;
    }

    public int getKilo() {
        return kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setSacRengi(String sacRengi) {
        this.sacRengi = sacRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "sacRengi='" + sacRengi + '\'' +
                ", gozRengi='" + gozRengi + '\'' +
                ", yas=" + yas +
                ", kilo=" + kilo +
                ", boy=" + boy +
                '}';
    }

    public static void main(String[] args) {
        HayvanAlemi h=new HayvanAlemi();

    }
    
    
}
