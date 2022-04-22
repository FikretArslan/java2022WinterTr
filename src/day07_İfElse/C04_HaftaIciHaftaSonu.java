package day07_İfElse;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {

    public static void main(String[] args) {

       /* kullanicidan gün ismi aliniz
       haftaici mi hafta sonumu yazdiriniz
       */

        //String case sensitive'dir
        //yani pazar,PAZAR,Pazar bunlar hep farklı kelimelerdir
        //bu durum  String methodlarından yardım alırız

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yazınız");
        String gunIsmi=scan.next().toLowerCase();

        //kullanıcı nasıl yazarsa yazsın biz kucuk harfe
        //string ifadelerde ==kullanılması tavsiye edilmez
        //cunku beklediğimizden farklı sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiğiniz gun hafta sonu");
        }

       if (gunIsmi.equals("pazartesi") || gunIsmi.equals("salı") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiğiniz gun hafta ici");
        }


    }
}
