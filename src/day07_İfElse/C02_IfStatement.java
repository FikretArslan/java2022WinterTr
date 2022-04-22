package day07_İfElse;

public class C02_IfStatement {


    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a>b && b<100){

            System.out.println("istediginiz grceklesecek");
            System.out.println("body icindeki tum kodlarcalısır");
        }

        if (a>b) System.out.println("suslu parantez olmazsa sadece bir satır calısır");

        System.out.println("2.satırda calısıcak");



    }
}
