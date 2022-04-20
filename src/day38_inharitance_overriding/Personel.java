package day38_inharitance_overriding;

public class Personel {
   public String statu="personel";
   public String haklar="tum personel esit haklara sahiptir";
   public String izin="tum personel yilda 4 hafta izin kullanirla";
    public void mesai(){
        System.out.println("tum personel 5 gun 8 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("tum personel 30 gun *8 saat*10 euro= " +
                ""+(30*8*10)+"euro maas");
    }

}
