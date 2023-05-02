package com.ust.sharathtaxi.Repository;

import com.ust.sharathtaxi.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Long> {

}
