package day38_inharitance_overriding;

public class Isci extends Personel{
    public String statu="Isci";
    public String haklar="Isciler kıdem tazminati alirlar";
    public String ikramiye="Isciler yilda bir ikramiye alırlar";
    public void mesai(){
        System.out.println("tum isciler haftalik 40 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("tum personel 30 gun *8 saat*11 euro= " +
                ""+(30*8*11)+"euro maas");
    }

}
