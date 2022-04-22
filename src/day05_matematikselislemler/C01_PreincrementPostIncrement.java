package day05_matematikselislemler;

public class C01_PreincrementPostIncrement {

    public static void main(String[] args) {

        int sayi=10;
        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);

        System.out.println("pre-increment satirinda " + ++sayi);//13
        System.out.println("pre-incrementden sonra "+ sayi);//13

        System.out.println("post-increment satirinda " +sayi++);
        System.out.println("post-increment satirindan sonra " +sayi);//14

    }
}
