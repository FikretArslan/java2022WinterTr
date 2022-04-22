package day05_matematikselislemler;

public class C06_WrapperClass {

    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //verilen iki string'daki sayilari toplayin

        System.out.println(str1+str2);//1234523456
        System.out.println(Integer.valueOf(str1) +  Integer.valueOf(str2));//35801

        //int sayi3=Integer.valueOf(str1) + Integer.valueOf(str2);//burda hata verir





    }
}
