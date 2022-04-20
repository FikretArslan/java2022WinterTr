package day10_Switch_StrngManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        //kullanicidan sayi olark ay numarasini alip
        //istenen ay ismini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo= scan.nextInt();

        //bu soruyu if else ile yapabiliriz ama art arda 12 if else
        //cok kalabalik ve anlasilmasi guc olabilir
        //bunun yerine swith-case yapisini kullanabiliriz

        switch (ayNo){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;

            default:
                System.out.println("lutfen gecerli bir ay numarasini yaziniz");




        }
        //switch icine yazilan variablein degerine gore
        //ilgili case'i bulur ve break gorene kadar kodu calistirir
        //eger break yoksa ilgili case'den aagiya dogru tum caseleri caliştirir
        //if else 'deki son else gibi ,geriye kalan durumlari tamamen
        //kapsayacak bir satir daha ekleyebiliriz
    }
}
