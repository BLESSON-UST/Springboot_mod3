package com.ust.EcommerceWithList.Repo;

import com.ust.EcommerceWithList.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,Integer> {

    Car findByName(String name);


    Car findByDate(String date);



}
