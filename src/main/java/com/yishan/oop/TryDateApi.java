//package com.yishan.oop;
//
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class TryDateApi{
//
//   public static void main(String[] args) {
////        System.out.println(LocalDate.now());
////        System.out.println(LocalTime.now());
////
////        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
////        String dateInString = "01/12/2001";
////
////        try {
////           Date date= formatter.parse(dateInString);
////            System.out.println( converter(date));
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
//
//      new TryDateApi::myList();
//
//    }
//    private static LocalDate converter(Date dateToConvert) {
//        return dateToConvert.toInstant()
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
//    }
//
//     void myList(){
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//        list.add(2);
//
//        list.forEach(System.out::println);
//
//        list.forEach(n -> System.out.println(n));
//    }
//
//
//
//
//
//}
//
//
////TODO
////convert local date to zoned date time