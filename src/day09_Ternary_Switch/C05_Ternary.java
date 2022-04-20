package day09_Ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary daki iki sonucun data turleri farkli olabilir
        //verilen sayi 100 den  buyuk sayinin karesini  alip yazdran

        int sayi=150;
        //ternary bize sonuc getirdiginde  ya sonucu direk yazdirmaliyiz
        //veya bir degiskene atamaliyiz
        //eger sonuclar farkli data turlerinde ise
        //atama yapacagimiz variable in data turu  tek placagindan
        //atama yapmayiz
        //SADECE direk yazdirabiliz
        System.out.println( sayi>100 ? sayi*sayi :"sayi 100 den buyuk olmali");
    }
}
