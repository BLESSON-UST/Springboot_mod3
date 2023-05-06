package com.ust.realestate.Repository;

import com.ust.realestate.Entity.Realestate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RealestateRepo extends JpaRepository<Realestate,Integer> {

//    List<Realestate> findByZipcode(double zipcode);
}
