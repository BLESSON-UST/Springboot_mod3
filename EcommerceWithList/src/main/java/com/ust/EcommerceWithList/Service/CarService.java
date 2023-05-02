package com.ust.EcommerceWithList.Service;

import com.ust.EcommerceWithList.Entity.Car;
import com.ust.EcommerceWithList.Repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepo carrepo;
    public Car add(Car car) {
        return carrepo.save(car);
    }

    public List<Car> getall() {
        return carrepo.findAll();
    }

    public Car getbyid(int id) {
        return carrepo.findById(id).orElse(null);
    }

    public Car getbyname(String name) {
        return carrepo.findByName(name);
    }

    public Car getbydate(String date) {
        return carrepo.findByDate(date);
    }


//    public List<String> getbycolor(List colors) {
//        return carrepo.findByColor(colors);
//    }
}
