package day32_dateTime;

import java.time.LocalTime;
import java.util.Locale;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm);//22:14:08.230729


        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += 1;

        }
        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tm);//22:14:08.230729

        double nano01 = tm.getNano();
        double nano02 = tmLoopSonrasi.getNano();

        System.out.println(" islem " + (nano02 - nano01) + " nanosaniyede bitti");

        //ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000));

        //istersek zone id kullanarak istedigimiz bolegenin
        // saati  icicnde obje olusturabiliriz

    }
}
