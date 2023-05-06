package com.ust.proper.Service;

import com.ust.proper.DTO.EmployeeDto;
import com.ust.proper.Entity.Employee;
import com.ust.proper.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;


    public ResponseEntity<Employee> submit(EmployeeDto emp) {
        Employee employee=new Employee(0,emp.getName(),emp.getEmail(),emp.getPhno());
        repo.save(employee);
        return ResponseEntity.ok().body(employee);
    }
}
