package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {



    String str="Bugun ne cok sey ogrendik";
    //bu cumledeki bosluk dısındaki karekter sayisi bulun

        System.out.println("space haric karekter sayisi:" +str.replace("","").length());

        //atama yapilmadigi surece

        System.out.println("orjinal str karekter sayisi: "+str.length() );

        str=str.replace("bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("kalici degisiklikten sonra:"+str);
        str.replace("ne cok","ne az");
        System.out.println(str);


}
    }