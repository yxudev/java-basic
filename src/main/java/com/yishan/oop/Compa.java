package com.yishan.oop;

public class Compa {



    static void isThatEquals(String string, String string2){

       System.out.println(string.compareTo(string2));

    }

    static void isThatEqualsPartTwo(String string, String string2){
        System.out.println(string.equals(string2));
    }


    public static void main(String[] args) {
        isThatEquals("aa","aa");
        isThatEqualsPartTwo("aa","aa");
    }
}
