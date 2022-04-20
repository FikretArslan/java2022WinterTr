package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        //kullanicidan isim -soyisim bilgisini alip

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim ve soyissminizi yaziniz");
        String isimSoyisim= scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\s","*"));

    }
}
