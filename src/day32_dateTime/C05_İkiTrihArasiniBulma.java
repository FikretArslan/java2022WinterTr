package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_İkiTrihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1985,12,02);
        System.out.println(Period.between(dogumGunu,bugun));//P36Y3M29D

        System.out.println(Period.between(dogumGunu,bugun).getYears());//36
    }
}
