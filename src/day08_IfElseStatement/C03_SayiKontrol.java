package day08_IfElseStatement;

import java.util.Scanner;

public class C03_SayiKontrol {

    public static void main(String[] args) {

        // soru 6(if else if)

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi de pozitif oldugundan toplamlari="+(sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayi de negatif oldugundan carpimlari="+ (sayi1*sayi2));
        }else if (sayi1*sayi2<0){
            System.out.println("farkli işaretlerde sayilarla islem yapazsiniz");
        }else {
            System.out.println("sifir carpaya gore yutan elemandir");
        }

    }
}
