package com.yishan.OA;

import com.yishan.OA.domain.Car;
import com.yishan.OA.repository.CarRepository;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static junit.framework.TestCase.assertNotNull;
import static org.mockito.Mockito.when;





public class CarTest{

    private Car c;
    private Car expected;
    private Car result;


    @Autowired
    private CarRepository carRepository = Mockito.mock(CarRepository.class);


    @Before
    public void setUp(){
        c = new Car();
        c.setCarId(5);
        c.setYear(2000);
        c.setModel("suv");
        c.setMake("Tesla");
        expected = new Car();
        expected.setCarId(5);
        expected.setYear(2000);
        expected.setModel("suv");
        expected.setMake("Tesla");
        result = new Car();
        when(carRepository.save(c)).thenReturn(expected);
        result = carRepository.save(c);

    }



    @Test
    public void findByIdTest() {

        when(carRepository.findById(5L)).thenReturn(Optional.of(expected));
        Optional<Car> testCar = carRepository.findById(expected.getCarId());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getCarId(), testCar.get().getCarId());
    }

    @Test
    public void findByYearTest() {

        when(carRepository.findByYear(2000)).thenReturn(expected);
        Car testCar = carRepository.findByYear(expected.getYear());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getYear(), testCar.getYear());
    }

    @Test
    public void findByMakeTest() {

        when(carRepository.findByMake("Tesla")).thenReturn(expected);
        Car testCar = carRepository.findByMake(expected.getMake());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getMake(), testCar.getMake());
    }


    @Test
    public void findByModelTest() {
        when(carRepository.findByModel("suv")).thenReturn(expected);
        Car testCar = carRepository.findByModel(expected.getModel());
        assertNotNull(testCar);
        TestCase.assertEquals(result.getModel(), testCar.getModel());
    }
}
