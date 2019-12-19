package com.yishan.oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapSetPractice{

    public static void main(String[] args){

        HashMap<String, String> stringStringHashMap = new HashMap<>();

        System.out.println(stringStringHashMap.equals(stringStringHashMap));

        Map hashmap = new HashMap();
        String str = "weeee";
        String str2 = "weeee";


        System.out.println(str.hashCode()==str2.hashCode());
        System.out.println(str.equals(str2));

        hashmap.put(str, str);
        hashmap.put(str, str2);
        hashmap.put(str2, str2);
        hashmap.put(str2, str);

        hashmap.entrySet().stream().sorted().forEach(System.out::println);


        Set set = new TreeSet();
        set.add(str);
        set.add(str);
        set.add(str2);

        set.stream().sorted().forEach(System.out::println);
    }
}
