package com.yishan.oop;
public class BicycalObjects {
    public static void main(String args[]){
        Bicycal uu = new Bicycal();
        uu.pedalNum = Integer.parseInt("5");
        uu.testBicycal();
        System.out.println("whats the bike? " + uu.theBicycal + "; " + "pedal number is:" +uu.pedalNum);
}}
