package com.ust.sharathtaxi.Controller;

import com.ust.sharathtaxi.Entity.Car;
import com.ust.sharathtaxi.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sharathcar")
public class CarController {
    @Autowired
    private CarService carservice;

    @PostMapping("/add")
    public Car addcar(Car car){
        return carservice.add(car);
    }
    @GetMapping("/cars")
    public List<Car> getall(){
        return carservice.getall();
    }
//    @GetMapping("/availcar")
//    public Car
}
