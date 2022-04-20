package day09_Ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //verile sayinin pozotif mi negatif mi kontrol edip
        //0 veya pozitif sayi ise tek veya cift
        //negatif sayi ise -100 den buyuk veya kucuk
        //oldugunu belirleyen tenary yaziniz

        int sayi=121;

        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi pozitif cift sayi");
            }else {
                System.out.println("sayi pozitif tek sayi");
            }

        }else {
            if (sayi<-100){
                System.out.println("sayi -100 den kucuk negatif sayi");
            }else {
                System.out.println("sayi -100 den buyuk negatif sayi");
            }


        }

        //ternary
        String sonuc=sayi>=0 ?
                (sayi%2==0? "pozitif cift sayi" :"pozitif tek sayi"):
                (sayi<-100 ? "-100 den kucuk negatif sayi" :
        "-100 den buyuk negatif sayi");
        System.out.println(sonuc);

    }

}
