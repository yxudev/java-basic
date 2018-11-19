package com.yishan.oop;
public class BikeObjects {

    public static void main(String args[]){
        Bike u = new Bike();
        Motorcycle motorcycleObjects = new Motorcycle();
      //  Bike s = new Bike();
      //  Bike b = new Bike();

        u.wheelShape = "round";
        u.seatShape = "triangle";
        u.wheelNum = Integer.parseInt("2");


       /* s.wheelShape = "LOL";
        s.seatShape = "un";
        s.wheelNum = Integer.parseInt("3");

        b.wheelShape = "pop";
        b.seatShape = "vim";
        b.wheelNum = Integer.parseInt("100"); */


        u.testRealBike();
      //  s.testRealBike();
        // b.testRealBike();

        System.out.println("Is that a bike? " + u.realBike + "\nPlease see details: " + u.wheelNum +" wheels; "+ u.seatShape+ " seats;  " + u.wheelShape +" wheel!  ");

    }

}