package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {

        //java calismaya main method'dan baslar
        // sonra yukariyad asagi,soldan saga dogru calisir

        //eger isersek variable'i once declare  edip sonra deger atayabiliriz

        String okulIsmi;

        // java deger atamasi yapmadigimiz bir variable olusturmamaiza  itiraz etmez
        // ancak deger atamasi yapinca ya kadar o variabe'i kullanmamiza izin vermez
        // System.out.println(okulIsmi);

        okulIsmi="Yildiz Koleji";

        System.out.println(okulIsmi);//Yildiz Koleji

        okulIsmi="Star Koleji";
        System.out.println(okulIsmi);//Star Koleji

        okulIsmi="Java Koleji";

        //println ile prin arasindaki fark
        //println dediginizde yazdırma işeminden sonra alt satıra gecerken
        // sadece prin dediginizde yazdirma isleminden sonra alt satıra gecmez
        System.out.println(okulIsmi);//Java Koleji
        System.out.print(okulIsmi);
    }
}
