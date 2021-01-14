package Arrays;

public class ArraysExp {

    public static void main(String[] args) {
        int sayilar[] = new int[100];
        int tumSayilarinToplami = 0;

        for(int i=0; i<sayilar.length; i++)
        {
            int rastgeleSayi = (int)(Math.random() * 100);
            sayilar[i] = rastgeleSayi;
            tumSayilarinToplami += rastgeleSayi;
            // tumSayilarinToplami = tumSayilarinToplami + rastgeleSayi;
        }

        double ortalama = (double) tumSayilarinToplami / (double)sayilar.length;

        int ortalamaAltindakiDegerlerinSayisi = 0;

        for (int i=0 ; i<sayilar.length; i++){
            if(sayilar[i] < ortalama){
                ortalamaAltindakiDegerlerinSayisi++;
            }
        }
        System.out.println("Ortalama : "+ortalama + " ve ortalamanın altındaki değerlerin sayısı : "+ortalamaAltindakiDegerlerinSayisi);
    }
}