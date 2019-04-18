package com.yishan.OA;

import com.yishan.OA.domain.Car;
import com.yishan.OA.repository.CarRepository;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static junit.framework.TestCase.assertNotNull;
import static org.mockito.Mockito.when;





public class CarTest{

    @Autowired
    private CarRepository carRepository = Mockito.mock(CarRepository.class);

    @Test
    @Transactional
    public void findByIdTest() {
        Car c = new Car();
        c.setCarId(5);
        Car expected = new Car();
        expected.setCarId(5);
        when(carRepository.save(c)).thenReturn(expected);
        when(carRepository.findById(5L)).thenReturn(Optional.of(expected));
        Car result = carRepository.save(c);
        Optional<Car> testCar = carRepository.findById(expected.getCarId());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getCarId(), testCar.get().getCarId());
    }

    @Test
    @Transactional
    public void findByYearTest() {
        Car c1 = new Car();
        c1.setYear(2000);
        Car expected1 = new Car();
        expected1.setYear(2000);
        when(carRepository.save(c1)).thenReturn(expected1);
        when(carRepository.findByYear(2000)).thenReturn(expected1);
        Car result = carRepository.save(c1);
        Car testCar = carRepository.findByYear(expected1.getYear());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getYear(), testCar.getYear());
    }

    @Test
    @Transactional
    public void findByMakeTest() {
        Car c2 = new Car();
        c2.setMake("Honda");
        Car expected2 = new Car();
        expected2.setMake("Honda");
        when(carRepository.save(c2)).thenReturn(expected2);
        when(carRepository.findByMake("Honda")).thenReturn(expected2);
        Car result = carRepository.save(c2);
        Car testCar = carRepository.findByMake(expected2.getMake());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getMake(), testCar.getMake());
    }


    @Test
    @Transactional
    public void findByModelTest() {
        Car c3 = new Car();
        c3.setModel("suv");
        Car expected3 = new Car();
        expected3.setModel("suv");
        when(carRepository.save(c3)).thenReturn(expected3);
        when(carRepository.findByModel("suv")).thenReturn(expected3);
        Car result = carRepository.save(c3);
        Car testCar = carRepository.findByModel(expected3.getModel());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getModel(), testCar.getModel());
    }
}
