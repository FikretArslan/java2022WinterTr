package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));//ile IT cok guzel
        //yukaridaki String'i Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet hoca"+str.substring(5));

        System.out.println(str.substring(9));


        System.out.println(str.substring(0,5));//0-5 aralıgını,"Java" aldı
        System.out.println(str.substring(0,1));//J
     String harf=str.substring(5,6);//i bana  5. HARFİ STRİNG OLARAK AL
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));//hiclik donduru

        //System.out.println(str.substring(5,2));//bitiş endexi baslanic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));
        System.out.println(str.substring(str.length()-5));
        System.out.println(str.substring(str.length()));//hiclik yazdirir


    }
}
