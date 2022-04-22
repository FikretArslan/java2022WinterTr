package day03_scanner;

public class C02_SwapVariables {

    public static void main(String[] args) {

        //iki sayinin yerini değiştirme

        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'dan once sayi1:"+sayi1+",sayi2:"+sayi2);

        int temp=sayi1;
        sayi1=sayi2;

        sayi2=temp;

        System.out.println("Swap'dan sonra sayi1:"+sayi1+",sayi2:"+sayi2);

    }
}
