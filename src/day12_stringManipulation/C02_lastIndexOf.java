package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {


        String cumle="Java ogren, yeni program ile bir sayfa ac";
        String kelime="yeni";

        int İlkkullanim=cumle.indexOf(kelime);
        int sonkullanim=cumle.lastIndexOf(kelime);

        if (İlkkullanim==(-1)){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (İlkkullanim==sonkullanim){
            System.out.println("girilen kelime cumlede 1 kullanilmis");
        }else {
            System.out.println("girilen kelime cumlede 1den fazla kullanılmis");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));//4 dahl



    }
}
