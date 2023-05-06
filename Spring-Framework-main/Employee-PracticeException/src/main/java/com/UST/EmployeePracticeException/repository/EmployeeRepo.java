package com.UST.EmployeePracticeException.repository;

//import com.UST.EmployeePracticeCrud.entity.EmployeeEntity;
import com.UST.EmployeePracticeException.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {
    Optional<EmployeeEntity> findByName(String name);
}
