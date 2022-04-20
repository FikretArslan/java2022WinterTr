package day11_StringManippulation;

import java.util.Scanner;

public class C03__equalsIgnoreCase {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak istermisin? \n Evet veya Hayir yaziniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz: "+cevap+"derse katiliminiz onaylanmiştir");

        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz:"+cevap+" sonraki dersimize bekleriz");
        }else {
            System.out.println("lutfen evet veya hayir yaziniz");
        }
    }
}
