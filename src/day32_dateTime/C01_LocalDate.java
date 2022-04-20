package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh = LocalDate.now();
        LocalDate baskaTrh = LocalDate.of(1985, 12, 02);

        System.out.println(trh);

        System.out.println(trh.getDayOfMonth());//31
        System.out.println(trh.getDayOfWeek());//thursday
        System.out.println(trh.getMonthValue());//3
        System.out.println(trh.getYear());//2022


        System.out.println(trh.minusWeeks(20));//2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-02-21

        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-10
        //tarh dile gore istedigimiz ulkenin  o andaki tarihini elde etmek istersek

        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);
        System.out.println(LocalDate.now().isLeapYear());//FALSE
        System.out.println(trh.isAfter(baskaTrh));//true


    }
}
