package day07_İfElse;

public class C01_IfStadement {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        if (a == b) {
            System.out.println("verilen sayilar esittir");
        }
        if (a > 100) {
            System.out.println("a yuzden buyuk");
        }
        if (a * b > 1){
            System.out.println("sayiların carpımı 5 ten buyuk");
        }

        if (a!=b){
            System.out.println("verilen sayılar esit degildir");//sayiların carpımı 5 ten buyuk
                                                                //verilen sayılar esit degildir

        }
    }

}
