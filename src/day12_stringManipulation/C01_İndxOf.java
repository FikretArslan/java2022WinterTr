package day12_stringManipulation;

public class  C01_İndxOf {
    public static void main(String[] args) {
        // manipulation soru 2

        String cumle="Java ogren, yeni program ile bir sayfa ac";
        String kelime="Java";
                int ilkkullanim=cumle.indexOf(kelime);
        int ikinckullanim=cumle.indexOf(kelime,ilkkullanim+1);


        if (ilkkullanim==-1){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (ikinckullanim==(-1)){
            System.out.println("girilen kelime cumlede 1 kere kullanilmiş");
        }else {
            System.out.println("girilen kelime cumlede birden fazla kullanilmis");
        }
    }
}
