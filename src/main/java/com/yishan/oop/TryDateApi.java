package com.yishan.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TryDateApi{

   public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "01/12/2001";

        try {
           Date date= formatter.parse(dateInString);
            System.out.println( converter(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    private static LocalDate converter(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}


//TODO
//convert local date to zoned date time