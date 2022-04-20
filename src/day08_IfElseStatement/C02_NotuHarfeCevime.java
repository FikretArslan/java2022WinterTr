package day08_IfElseStatement;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class C02_NotuHarfeCevime {
    public static void main(String[] args) {

        // SORU 7


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double notSayi= scan.nextDouble();

        if (notSayi<0 ||notSayi>100){
            System.out.println("lutfen gecerli bir not giriniz");
        } else if (notSayi<50){
            System.out.println("notunuz D");
        }else if(notSayi<60){
            System.out.println("notunuz C");
        }else if (notSayi<80){
            System.out.println("notunuz B");
        }else {
            System.out.println("notunuz A");
        }
    }
}
