package day10_Switch_StrngManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        //concatenation yapmak icin iki ihtimalimiz var
        //istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        //veya String class'indan gelen concat methodun kullanabiliriz
        String str1="Java";
        String str2="Candir";

        //Java Candir yazdiralim

        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2);//JavaCandir

        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

        //cocet icine string degilde boolean deger yazsak?
        //cocat methodu icine String parametre ister
        //String disinda  bir data turu yazdiginizdde  onu String haline getirmelisiniz

        cumle=str1.concat(" "+5);
        cumle=str1.concat(true+" ");
    }
}
