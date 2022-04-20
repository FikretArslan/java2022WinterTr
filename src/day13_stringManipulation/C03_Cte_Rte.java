package day13_stringManipulation;

public class C03_Cte_Rte {
    public static void main(String[] args) {

        //HATALAR

      //  int sayi="Ali Can";//syntex hatalarini java yazdigimizda gorur
                           //ve altini cizer
                             // tum projede alti cizili  bir kod varsa
                            //projede hic bir kod calişmaz

        String str="javada herşey zamanla oturur";
        System.out.println(str.substring(5000));//bu hatayi calişinca soyler,hata verir
    }
}
