package com.yishan.OA.service;

import com.yishan.OA.domain.Car;
import com.yishan.OA.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public class CarService {



    @Transactional
    public Car createNewCar(Car newCar) {
        String code = UUID.randomUUID().toString();
        save(newCar);
        return newCar;
    }
    public String carID = UUID.randomUUID().toString();

    public Car addCar() {
        return new Car();
    }

    @Autowired
    private CarRepository carRepository;

    public CarService() {

    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findByCarId(Long CarId) {
        return carRepository.findById(CarId).get();
    }

    public Car findByMake(String Make) {
        return carRepository.findByMake(Make);
    }

    public Car findByModel(String Model) {
        return carRepository.findByModel(Model);
    }

    public Car findByYear(Integer Year) {
        return carRepository.findByYear(Year);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void deleteByCarId(Long aLong) {
        carRepository.deleteByCarId(aLong);
    }


}
