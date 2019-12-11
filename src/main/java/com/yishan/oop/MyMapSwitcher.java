package com.yishan.oop;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MyMapSwitcher {



    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","uno");
        map.put("one","uno");
        map.put("2","duo");
        map.put("3","tres");
        System.out.println("The original map:\n ");
        map.entrySet().stream().forEach(e-> System.out.println(e));



        Map<String, String> magicMap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (e1, e2) -> e1+e2));
        System.out.println("\nThe swapped map is: \n");
        magicMap.entrySet().stream().forEach(e-> System.out.println(e));
    }
}
