package com.yishan.oop;
public class Motorcycle extends Bicycal{
    float gasTank;
    int motor;
    boolean realMotorcycle;
    public void testMotorcycle(){
        if (gasTank >= 2.4) {
        }
        realMotorcycle= true;
    }

    public static void pri(){
        System.out.println("lol");
    }

    public static void main(String args[]){
        Motorcycle m = new Motorcycle();
        Motorcycle.pri();
        m.gasTank = Float.parseFloat("3.8");
        m.testMotorcycle();
        System.out.println("Is that a Motorcycle? " + m.realMotorcycle + "\nPlease see details: " + m.wheelNum +" wheels; "+ m.seatShape+ " seats;  " + m.wheelShape +" wheel!  " + "pedal number is:" +m.pedalNum);
    }
}
