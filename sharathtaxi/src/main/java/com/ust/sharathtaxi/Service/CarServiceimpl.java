package com.ust.sharathtaxi.Service;

import com.ust.sharathtaxi.Entity.Car;
import com.ust.sharathtaxi.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceimpl implements CarService{
    @Autowired
    private CarRepo carrepo;
    @Override
    public Car add(Car car) {
        return null;
    }

    @Override
    public List<Car> getall() {
        return carrepo.findAll();
    }
}
