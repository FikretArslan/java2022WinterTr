package day07_İfElse;

import java.util.Scanner;

public class C05_IfElseHaftanınGunleri {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiğiniz gun haftasonu");

        } else {
            System.out.println("girdiğiniz gun hafta içi");
        }

    }
}
