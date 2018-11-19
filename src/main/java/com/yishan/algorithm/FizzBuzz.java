package com.yishan.algorithm;
public class FizzBuzz {

    public static void main(String args[]){

        for (int k=1;k<=100; k++){
            if ((k % 3 == 0)&&(k % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else{
                System.out.println(k);
            }
        }
    }

}
