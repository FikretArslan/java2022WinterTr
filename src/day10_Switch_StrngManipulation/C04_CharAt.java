package day10_Switch_StrngManipulation;

import java.util.Locale;

public class C04_CharAt {
    public static void main(String[] args) {
        //Sring te herhangi bir karekteri almak istedigimizde o harfi inteksini kullanarak
        //str.charAt(istenilen Index)

        String str="Java Cok Guzel";

        //J'yi yazdiralim

        System.out.println(str.charAt(0));
        //eger G'yi yazmak istersek

        System.out.println(str.charAt(9));

        //va yazdiralim

        System.out.println(""+str.charAt(2)+str.charAt(3));// va

        //cOK seklinde yazdiralim

        System.out.println(str.toLowerCase().charAt(5)+
                            ""+str.toUpperCase().charAt(6)+
                              str.toUpperCase().charAt(7));

        //son karekteri yazdir
        //String de 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1));//uzunlu-1

        //eger uzunlugu index olarak girersek
        //java clistitan sonra hata verir
        System.out.println(str.charAt(14));
    }
}
