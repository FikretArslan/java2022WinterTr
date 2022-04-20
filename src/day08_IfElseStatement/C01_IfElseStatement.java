package day08_IfElseStatement;

import java.util.Scanner;

public class C01_IfElseStatement {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char karekter=scan.next().charAt(0);

        if (karekter>='A' && karekter<='Z' || karekter>='a' && karekter<='z'){
            System.out.println("girdiginiz karekter bir harf");
        }else {
            System.out.println("girdiginiz karekter bir harf degil");
        }
    }
}
