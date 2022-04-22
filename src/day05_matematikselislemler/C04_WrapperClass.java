package day05_matematikselislemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        //primitive data turu ie non- primitive arasindaki farklar nelerdi?
      String str="java";
      int sayi=10;
        System.out.println(str.toUpperCase());
        System.out.println(str);

        //non-primitive data turleri data depolamak yaninda bir cok faydali methoda sahiptir
        //ancak primitivi data turlerinin boyle bir ozelligi yoktur
        //primitive data turlri sadece degerleri toplarlar(container)

        double sayi2=20.5;

        //sayi2 primitive olldugundan sayi2 dedigimizde hic bir method gelmez

        Double sayi3=15.2;


    }
}
