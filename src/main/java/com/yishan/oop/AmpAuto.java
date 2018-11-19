package com.yishan.oop;
public abstract class AmpAuto extends Auto implements Ship, Machine

    {

        public void shipMe () {
            System.out.println("Amp also floats!");
        }
        public void runMe (){
            System.out.println("Amp uses diesel as its the fuel type.");
        }

        public static void main (String args[]){

            AmpAuto at = new AmpAuto() {};

            at.doorNum = "four";
        at.seatShape = "round";

        System.out.println("Amp has " + at.doorNum + "doors" + " and " + at.seatShape + " seats");
        at.shipMe();
        at.autoMe();
        at.runMe();
    }
    }
;