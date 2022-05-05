package okulProject;

import java.util.Scanner;

public class Depo {
   static Scanner scan=new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {

        String tercih="";
        do {
            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "==============  ANA MENU ==============\n" +
                    "\n" +
                    "\t   1- Okul Bilgileri Goruntule\n" +
                    "\t   2- Ogretmen Menu\n" +
                    "\t   3- Ogrenci Menu\t\t \n" +
                    "\t   Q- ÇIKIŞ\n");

            System.out.println("Lutfen menuden tercih yapiniz");
            tercih=scan.nextLine();

            switch(tercih){

                case "1":
                    okulBilgileri();
                    break;
                case "2":
                    Ogretmen.ogretmenlerMenu();
                    break;
                case "3":
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gcerli bir tercih yapiniz");
            }

        }while(!tercih.equalsIgnoreCase("q"));

       projeDurdur();
    }

    public final static void okulBilgileri() throws InterruptedException {

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "\t\t Adres :"+Okul.adres+
        "\n\t\t telefon :"+Okul.telefon);
        Thread.sleep(5000);


    }

    public static void projeDurdur(){
        System.out.println("okul projesinden ciktiniz");
    }

}
