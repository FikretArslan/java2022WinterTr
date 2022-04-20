package day10_Switch_StrngManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
    //kullanicadan kacinci ay oldugunu alip mevsimi yazdiran bir
    //swith olustueun

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo= scan.nextInt();



        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkBahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("SonBahar");
                break;


            default:
                System.out.println("lutfen gecerli bir ay numarasi yaziniz");

        }
    }
    }