package com.yishan.oop;
public class Bike{
    public String wheelShape;
    public String seatShape;
    public int wheelNum;
    public boolean realBike;

    public void testRealBike(){
        if (wheelNum >1){
            realBike=true;
        }
    }

    public void move(){
        System.out.println("move like 8mph");
    }

    public static void getPedals(){
        System.out.println("Pedals are 2!");
    }
    public static void main(String[] args){
        Bike b =new Bike();
        b.move();
        Bike.getPedals();
    }
}


