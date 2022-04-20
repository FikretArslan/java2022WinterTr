package day01_variables;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        //ternary ile yapılan tum işlemler if else ile yapılabilir
        //if else yerine ternary  tercih etme sebebi yapinin basit
        //ve anlaşılabılir

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi griniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");
        }else {
            System.out.println("sayi tek");
        }


        //ternary metod:
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");
    }
}
