package Encapsulation;

public class Televizyon {

    private int kanal;
    private int sesSeviyesi;
    private boolean acik;

    public void ac(){

        if(acik == false){
            System.out.println("Televizyon açılıyor");
            acik = true;
        }else{
            System.out.println("Televizyon zaten açık");
        }

    }

    public void kapat(){

        if(acik){
            System.out.println("Televizyon kapatılıyor");
            acik = false;
        }else{
            System.out.println("Televizyon zaten kapalı");
        }

    }

    public void setKanal(int yeniKanal){
        if(acik && yeniKanal > 0 && yeniKanal < 500){
            kanal = yeniKanal;
        }else{
            System.out.println("tv kapalı veya yanlış bir kanal değeri yazdınız");
            kanal = 1;
        }
    }
    public int getKanal() {
        return kanal;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        if(acik && sesSeviyesi>0 && sesSeviyesi < 20){
            this.sesSeviyesi = sesSeviyesi;
        }else{
            sesSeviyesi = 1;
        }

    }

    public void goster(){
        System.out.println("Tv acik :"+ acik +" kanal :"+kanal+" ses seviyesi: "+sesSeviyesi);
    }

}