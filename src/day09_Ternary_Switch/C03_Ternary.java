package day09_Ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {


        int sayi=-10;

       String sonuc=sayi>=100 ? "sayi 3 basamakli veya daha buyuk"
               : "sayi negatif veya 3 basamaktan kucuk";

        System.out.println("girdiginiz sayi analizi:" +sonuc);
    }
}
