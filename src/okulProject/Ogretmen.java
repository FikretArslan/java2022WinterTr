package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan=new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan, 1984, Matematik");
    }

    public static void ogretmenlerMenu() throws InterruptedException {

        String tercih="";
        do {
            System.out.println("\"============= YILDIZ KOLEJI =============\\n\" +\n" +
                    "=========== OGRETMEN MENU ============\\n\" +\n" +
                    "\n" +
                    "\t   1- Ogretmenler Listesi Yazdir\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ\n");
            tercih=scan.nextLine();

            switch(tercih){
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("lutfen gecerli tercih yapiniz");

            }
        }while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void ogretmenListesiYazdir() {
        System.out.println("============= YILDIZ KOLEJI =============\n" +
                        "=========== OGRETMEN MENU ============\n");
        System.out.printf("TcNo      İsim    Soyisim    D.Yili    Brans");
        System.out.println();
                Set<Map.Entry<String, String>> ogretmenEntrySet=ogretmenlerMap.entrySet();
       for(Map.Entry<String, String> each:ogretmenEntrySet){
           String eachKey=each.getKey();
           String eachvalue=each.getValue();
           String eachvaluearr[]=eachvalue.split(" ");

           System.out.printf("%11s %-7s %-6s %4s %-2s\n",eachKey, eachvaluearr[0], eachvaluearr[1], eachvaluearr[2], eachvaluearr[3]);
       }
    }
}