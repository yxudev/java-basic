package com.yishan.algorithm;
import java.util.HashMap;
import java.util.Map;

public class MyMap{

        public static void main(String[] args) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("The best smart phone is", "iPhone!");
            map.put("The trash smart phones are", "Android phones");
            for (String key : map.keySet()) {
                System.out.println(key + " = " + map.get(key));
            }
        }
    }



