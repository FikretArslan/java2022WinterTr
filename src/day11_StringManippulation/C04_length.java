package day11_StringManippulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk Harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));


        String str1="";
        System.out.println(str1.length());

        String str2=null;
        System.out.println(str2.length());

        String str3;
       // System.out.println(str3);
        //str3 ile str2 ye deger atanmamiştir

    }
}
