package day04_dataCasting_Increment;

public class C05_incerementDecrement {

    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);//30
        System.out.println(sayi);//20

        sayi=sayi+10;
        System.out.println(sayi);//30

        System.out.println(sayi=sayi+=10);//40

        System.out.println(sayi);//40

        System.out.println(sayi+=10);//50
        System.out.println(sayi);//50

        System.out.println(sayi++);//50
        System.out.println(sayi);//51

        System.out.println(+ ++sayi);//52
        System.out.println(+sayi);//52
    }
}
