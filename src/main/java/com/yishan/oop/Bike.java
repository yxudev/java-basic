package com.yishan.oop;
public class Bike{
    public String wheelShape;
    public String seatShape;
    public int wheelNum;
    public boolean realBike;

    public void testRealBike(){
        if (wheelNum >1){
            realBike=true;
            System.out.println("it's a bike!");
        }
    }

    public static void move(){
        System.out.println("move like 8mph");
    }

    public static void getPedals(){
        System.out.println("Pedals are 2!");
    }
    public static void main(String[] args){
        Bike b =new Bike();

        Bike.move();
        Bike.getPedals();
        b.testRealBike();
    }
}


