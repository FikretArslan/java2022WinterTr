package day07_İfElse;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {
        //kullanıcıdan yası isteyin
        // emekli olma durumu


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsın");
            System.out.println(65-yas + " sene daha calısmalısın");
        }


    }
}
