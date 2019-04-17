package com.yishan.OA.service;

import com.yishan.OA.domain.Car;

import java.util.UUID;

public class CarService {


    public String carID = UUID.randomUUID().toString();

    public Car addCar() {



        return new Car();
    }
}
