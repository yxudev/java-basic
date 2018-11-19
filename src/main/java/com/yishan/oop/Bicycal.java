package com.yishan.oop;
public class Bicycal extends Bike {
    int pedalNum;
    boolean theBicycal;
    void testBicycal(){
        if (pedalNum<4 && wheelNum >1)
            theBicycal = true;
    }

}
