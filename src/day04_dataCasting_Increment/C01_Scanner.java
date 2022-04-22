package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        //soru 7

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");

        char ilkHarf=scan.next().charAt(0);

        System.out.println("Girdiginiz ismin ilk harfi:"+ilkHarf);//leyla Girdiginiz ismin ilk harfi:l

    }
}
