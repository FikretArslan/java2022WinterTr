package day20_scope_Arraye;

public class C02_StaticVariables {

    //instance variable ler obj ye bagimlidir ve her obje farkli degerler alabilirler
    //ogrenci notlari ve ogretmen braslari gibi

   static String okulIsmi="Yidiz Koleji";
   static int okulNo;
   static boolean okulAcikMi;
    public static void main(String[] args) {

        System.out.println(okulIsmi);//Yidiz Koleji
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false

        staticMethod();//(metot kol)  method u buraya yazmaliyiz

        System.out.println(okulNo);//200

    }

    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200
    }
}
