package com.yishan.oop;
import java.lang.String;
import java.util.Scanner;

public class Bot {
    public static void main(String args[]){
        System.out.println("Please say something: \n" );
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String outString = s;

        switch (s){
            case "Hi":
                outString = "How are you?";
            break;

            case "Fine":
                outString = "Thank you!";
            break;

            case "Weather?":
                outString = "76F" ;
            break;}
        System.out.println(outString);


        }

    }
