package com.yishan.OA.repository;

import com.yishan.OA.domain.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

        List<Car> findAll();
        Car findByMake(String make);
        Car findByModel(String model);
        Car findByYear(int bodyType);
        Car deleteByCarId(Long aLong);
}
