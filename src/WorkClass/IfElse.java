package WorkClass;
import java.util.Random;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {


        Random rnd=new Random();
        int sayi= rnd.nextInt(100);

        Scanner scan=new Scanner(System.in);

        int tahmin=0;
        int sayac=0;
        System.out.println("lutfen bir sayi girin");
while (sayi !=tahmin){

    tahmin= scan.nextInt();

    if (tahmin>=sayi){
        System.out.println("daha kucu bir sayi girin");

    }else  if (tahmin<sayi){
        System.out.println("daha buyuk bir sayi girin");

    }
    sayac++;
}
        System.out.println("sayiyi : "+(sayac-1)+" tahminde bulundunuz");





    }




        }


