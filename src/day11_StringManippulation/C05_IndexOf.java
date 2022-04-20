package day11_StringManippulation;

import java.util.Scanner;


public class C05_IndexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel";


        System.out.println(str1.indexOf('J'));//0

        System.out.println(str1.indexOf("l"));//19

        System.out.println(str1.length()-1);//19
        System.out.println(str1.indexOf("aska"));//10

        System.out.println(str1.indexOf("b"));//5 buldugu ilk eslesmeyi alir

        System.out.println( str1.indexOf('b',5));


        //verilen 2. a harfin index ini bulalim
        int İlkİndex=str1.indexOf('a');
        System.out.println(str1.indexOf('a',İlkİndex+1));


     //stringde olmayan bir harf aratma

        System.out.println(str1.indexOf("y"));
        //y yok demesi lazim ama return type i index
        //yok demesinin saisal karsiligi olarak java -1 dondurmeyi tercih rtmistir
        //kullanicidan mail adresini istein @ işareti icermiyorsa gecersiz yazdirin
        //iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mailinizi yaziniz");
        String mail= scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("gecersiz");
        }else {
            System.out.println("mailiniz kabul edildi");
        }

    }
}
