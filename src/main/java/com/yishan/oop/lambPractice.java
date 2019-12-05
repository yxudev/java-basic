package com.yishan.oop;

import java.util.ArrayList;
import java.util.List;

public class lambPractice {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");

        stringList.forEach(str ->
            System.out.println(str)
        );



    }

}
