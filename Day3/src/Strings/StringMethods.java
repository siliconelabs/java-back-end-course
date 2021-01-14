package Strings;

public class StringMethods {

    public static void main(String[] args) {
        String isim = "emre";

        System.out.println(isim.length());

        System.out.println(isim.charAt(2));
        System.out.println(isim.concat(" sahin"));
        String yeni = isim.concat(" mehmet");
        System.out.println(yeni.toLowerCase());
        System.out.println(yeni.toUpperCase());
        yeni="  "+ yeni;
        System.out.println(yeni);

        System.out.println(yeni.trim());

        String ay = "Ocak";
        String ay2 = "Ocak";

        System.out.println(ay.equals(ay2));
        System.out.println(ay.equalsIgnoreCase(ay2));

        System.out.println(ay.compareTo(ay2));
        System.out.println(ay.startsWith("A"));
        System.out.println(ay.endsWith("m"));

        System.out.println(yeni.trim().substring(5));
        System.out.println(yeni.trim().substring(0,5));

        System.out.println(yeni.trim().indexOf("m"));
        System.out.println(yeni.trim().lastIndexOf("e"));

        int sayi = 5;
        int sayi2=6;

        String say = "56";

        System.out.println(sayi+sayi2);
        System.out.println(Integer.parseInt(say)+4);


    }
}
