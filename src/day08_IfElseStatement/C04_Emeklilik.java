package day08_IfElseStatement;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        //emeklilik sorusu

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yaziniz:"+ "\nKadin icin K \n erkek icin E harfini girniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen  yaşiniz giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet=='K'){

            if (yas<0 || yas>120){
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println("emekli olamazsiiz \n daha "+(60-yas)+ "yil calisman gerekir" );
            }else {
                System.out.println("emekli olabilirsiniz");
            }

        }else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<65){
                System.out.println("emekli olamazsiniz \n daha" +(65-yas)+" yil calisman gerekir");

            }else {
                System.out.println("emekli olabilirsin");
            }
        }else {
            System.out.println("lutfen cinsiyet icicn gecerli bir harf giriniz");
        }
    }
}
