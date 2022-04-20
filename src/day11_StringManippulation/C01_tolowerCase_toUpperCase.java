package day11_StringManippulation;

import java.util.Locale;

public class C01_tolowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="java Guzeldir";

        //str.charAt(5) boyle yazdıgımızda sonuc artık string degil charAt olacak
        //dolayisiyla string de yapmak istedigimiz tum

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GUZELDİR

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));
    }
}
