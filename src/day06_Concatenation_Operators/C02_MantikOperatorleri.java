package day06_Concatenation_Operators;

public class C02_MantikOperatorleri {

    public static void main(String[] args) {
        System.out.println(5+2==8);//folse

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc1);

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println(sonuc2);

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);

        int sayi3=13;
        //sayi3 un 10 ile 20 aralıgında tru diyerek dondurelim
        //jsvs 3 lu karsilastırma yapmaz.onun icin 2 lerle yapmalıyız

        System.out.println(10<sayi3   &&  sayi3<20);

        int sayi4=5;
        //sayi4 un 10 ile 20 arlığında olmadıgını tru diyerek dondurelim

        System.out.println(sayi4<10 || sayi4>20);//true



    }



}
