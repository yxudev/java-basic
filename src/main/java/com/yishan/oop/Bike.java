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
}