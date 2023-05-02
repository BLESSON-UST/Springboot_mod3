package com.ust.sharathtaxi.Service;

import com.ust.sharathtaxi.Entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {
    Car add(Car car);

    List<Car> getall();
}
