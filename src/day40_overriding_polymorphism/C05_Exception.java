package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        do {

            System.out.println("toplamak istedigizsayi girin \n bitirmek icin Q ya basiniz");
            int sayi1 = 0;
            try {
                sayi1 = scan.nextInt();
            } catch (InputMismatchException e) {

                String hataliGiris = scan.next();
                if (hataliGiris.equalsIgnoreCase("q")) {

                    break;
                } else {
                    System.out.println("hatali giris");
                }

            }
            toplam += sayi1;
        } while (toplam < 500);
        System.out.println("girdigiz sayilarin toplami :" + toplam);
    }
}