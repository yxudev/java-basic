package com.yishan.oop;

public class Phone{
    public String homeButton;
    public int homeButtonNum;
    public Phone(int n, String shape){
        this.homeButton = shape;
        this.homeButtonNum = n;
    }

    public int getHomeButtonNum(){
        System.out.println("iPhone has "+ this.homeButtonNum+ " home button" );
        return this.homeButtonNum;
    }

    public String pushHomeButton(int j){
        System.out.println("Push " + j + " time to active iPhone");
        return this.homeButton;
    }

    public static void main(String[] args){
        Phone iPhone = new Phone(1, "yuan");
        iPhone.getHomeButtonNum();
        iPhone.pushHomeButton(1);

        System.out.println(iPhone);

    }
}
