package day18_nestedForLoop;
import java.util.Scanner;
import java.util.Random;
public class C09_H_sayiBulmaca {
    public static void main(String[] args) {


        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd = new Random();
        int sayi = rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        System.out.println("Lutfen bir sayi giriniz");
        while (sayi != tahmin) {

            tahmin = scan.nextInt();
            if (tahmin > sayi) {
                System.out.println("Daha kucuk bir sayi soylemelisin");
            } else if (tahmin < sayi) {
                System.out.println("Daha buyuk bir sayi soylemelisin");
            }
            sayac++;
        }
        if (sayac <= 7) {
            System.out.println("tebrikler " + (sayac - 1) + " defada buldunuz");
        }
        else if (sayac > 7) {
            System.out.println(sayac - 1 + "  defada buldnuz kotu bir tahmin");

        }
    }


}





