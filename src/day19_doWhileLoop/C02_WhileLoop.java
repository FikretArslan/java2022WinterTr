package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //soru 7) rakamlar toplami

        int input=123456;
        int rakam=0;
        int rakamlartoplami=0;

        while (input > 0) {
            rakam=input%10;
            rakamlartoplami+=rakam;
            input/=10;
        }
        System.out.println(rakamlartoplami);
        }


    }

