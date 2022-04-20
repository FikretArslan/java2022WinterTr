package day09_Ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        //kullanıcıdan 4 basamaklı bir sayi girmesini isteyin
        //girdiginiz sayi 5 e bolunemiyorsa tekrar deneyiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamaklı sayi giriniz");
        }


        else if (sayi%5==0){

             if (sayi%10==0){
                 System.out.println("5'e bolunen çift  sayi");
             }


         else {
                 System.out.println("5 e bolunen tek sayi");
             }
        }else {
            System.out.println("tekrar deneyin");
        }

    }
}