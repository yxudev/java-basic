package com.yishan.oop;

import java.util.ArrayList;
import java.util.List;

public class tryStreamFilters {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
    for(int i=0; i<101;i++){
        list.add(i);
    }

        list.stream().filter(num -> num % 2 == 0 || num %3 == 0 || num%5 == 0).forEach(System.out::println);


    }



}
