package day20_scope_Arraye;

public class C01_Scope {
    int sayi;
    String bransImi="Java";
   // String okulIsmi="Yildiz Koleji";
    Boolean okuldaMi;

    public  static  void main(String[]args){

        //
        //

        C01_Scope obje1=new C01_Scope();
        System.out.println(obje1.sayi);//0
        obje1.sayi=10;
        System.out.println(obje1.sayi);//10
        obje1.bransImi="SQL";
        System.out.println(obje1.okuldaMi);//false

        C01_Scope obj2=new C01_Scope();
        System.out.println(obj2.sayi);//0
        System.out.println(obj2.bransImi);//Java

        obje1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);//

    }
}
