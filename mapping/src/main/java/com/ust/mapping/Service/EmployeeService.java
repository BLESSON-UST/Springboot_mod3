package com.ust.mapping.Service;

import com.ust.mapping.Entity.Employee;
import com.ust.mapping.Repository.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeRepo repo;
    public Employee submit(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getall() {
        return repo.findAll();
    }


    public void remove(Long empId) {
        repo.deleteById(empId);
    }
}
