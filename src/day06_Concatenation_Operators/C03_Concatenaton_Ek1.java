package day06_Concatenation_Operators;

public class C03_Concatenaton_Ek1 {
    public static void main(String[] args) {


        // soru
        String str1="Java";// JavaGuzel54
        String str2="Guzel";
        int sayi1=5;
        int sayi2=4;
        System.out.println(str1+""+str2+""+sayi1+sayi2);
        System.out.println(str1+""+sayi1+""+str2);
        System.out.println(str1+""+(sayi1+sayi2)+sayi2);
        System.out.println(str1+""+(sayi1-sayi2)+(sayi1+sayi2));
        System.out.println(sayi1+""+sayi2+""+str2);
        System.out.println(""+sayi1+sayi2+str2);

        // soru
        int num1=Integer.MIN_VALUE;//-2147483648
        System.out.println(num1);
        int num2=Integer.MAX_VALUE;// 2147483647
        System.out.println(num2);
        int num3=Byte.MIN_VALUE;//-128
        System.out.println(num3);
        int num4=Byte.MAX_VALUE;//127
        System.out.println(num4);

        String a="Hello";
        int  b=2;
        int  c=3;
        System.out.println(a+b+c);// Hello23
        System.out.println(c+b+a);// 5Hello
        System.out.println(a+(b+c));// Hello5
        System.out.println(a+b*c);// Hello6


}
    }

