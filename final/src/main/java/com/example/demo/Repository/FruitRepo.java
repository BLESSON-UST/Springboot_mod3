package com.example.demo.Repository;

import com.example.demo.Entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepo extends JpaRepository<Fruit,Integer> {
}
