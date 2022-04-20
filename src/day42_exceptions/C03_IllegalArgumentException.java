package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen yasiniz i giriniz");
        int yas = scan.nextInt();

        if (yas<=0 || yas>=120){
            System.out.println("lutfen gecerli bir yas giriniz");
            throw new IllegalArgumentException();
        }else System.out.println("uygun yas girdiniz,tesekkurle");
    }

}
