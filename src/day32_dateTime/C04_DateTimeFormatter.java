package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-03-31T22:40:21.947545

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/M/YYYY");

        System.out.println(formatter.format(tarihSaat));//31/3/2022

        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(formatter1.format(tarihSaat));//31/Mart/2022


    }
}
