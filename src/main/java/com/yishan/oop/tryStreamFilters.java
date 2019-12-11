package com.yishan.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class tryStreamFilters {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<101;i++){
        list.add(i);
        }


        Map<Integer, Boolean> result = list.stream().filter(num -> num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0)
                .collect(Collectors.toMap(num->num ,num->true));
        System.out.println(result);
    }





}
