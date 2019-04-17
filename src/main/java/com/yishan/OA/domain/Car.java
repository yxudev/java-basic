package com.yishan.OA.domain;

public class Car {

    public long carId;

    public String make;

    public String model;

    public int year;

    public Car(long carId, String make, String model, int year) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car() {
    }


    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




}
