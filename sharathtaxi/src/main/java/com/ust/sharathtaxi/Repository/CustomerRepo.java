package com.ust.sharathtaxi.Repository;

import com.ust.sharathtaxi.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
