package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email="mulkiyeayboy@gomail.com";
        String arananMetin="@gmail.com";//(@gmail.com) uzunlugu 10 ,buna gore gideriz

        if (!email.contains(arananMetin)){
            System.out.println("lufen gmail adresi giriniz");
        }else if (email.lastIndexOf(arananMetin)==(email.length()-10)){
            // uzunluktan 10 cıkarttık
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println(" lutfen yazimi kontol edin");
        }



    }
}
