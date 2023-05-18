package com.example.demo.Repository;

import com.example.demo.Entity.Vegetables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegetableRepo extends JpaRepository<Vegetables,Integer> {
    Vegetables findByvid(int vid);
}
