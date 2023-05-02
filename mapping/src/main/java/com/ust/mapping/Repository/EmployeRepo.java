package com.ust.mapping.Repository;

import com.ust.mapping.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepo extends JpaRepository<Employee,Long> {
}
