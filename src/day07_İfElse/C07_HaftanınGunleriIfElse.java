package day07_İfElse;

import java.util.Scanner;

public class C07_HaftanınGunleriIfElse {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String gunismi= scan.next().toLowerCase();

        if (gunismi.equals("pazar") || gunismi.equals("cumartesi")){
            System.out.println("girdiğiniz gun hafta sonu");

        } else if (gunismi.equals("pazartesi") || gunismi.equals("salı") ||
                gunismi.equals("carsamba") || gunismi.equals("persembe")
                || gunismi.equals("cuma")){
            System.out.println("girdiğini gun hafta ici");

        } else {
            System.out.println("lutfen gecerli bir gun ismi giriniz");

        }

        //eger if else if ....statement else ile bitiyorsa
        //olasılıklardan sadece bir tanesi mutlaaka calısır
    }
}
