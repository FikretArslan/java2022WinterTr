package day07_İfElse;

import java.util.Scanner;

public class C03_TekCifAayi {

    public static void main(String[] args) {
        //tek çift

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0) {
            System.out.println("girilen sayi çift sayi");
        }
        if (sayi%2!=0){
            System.out.println("girilen sayi tek sayidir");
        }
        //===== if else ile cozum====

        if (sayi%2==0){
            System.out.println("girdiğiniz sayi cift sayidir");
        } else {
            System.out.println("girdiğiniz sayi tek sayidir");
        }
    }
}
