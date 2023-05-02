package com.ust.EcommerceWithList.Controller;

import com.ust.EcommerceWithList.Entity.Car;
import com.ust.EcommerceWithList.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carservice;

    @PostMapping( "/add")
    public Car addcar(@RequestBody Car car){
        return carservice.add(car);
    }

    @GetMapping("/get")
    public List<Car> getall(){
        return carservice.getall();
    }

    @GetMapping("/get/{id}")
    public Car getbyid(@PathVariable int id){
        return carservice.getbyid(id);
    }
    @GetMapping("/getname/{name}")
    public Car getbyname(@PathVariable String name){
        return carservice.getbyname(name);
    }
    @GetMapping("/getdate/{date}")
    public Car getbydate(@PathVariable String date){
        return carservice.getbydate(date);
    }
//    @GetMapping("/get/color")
//    public List<String> getbycolor(@PathVariable List colors){
//        return carservice.getbycolor(colors);
//    }

}
