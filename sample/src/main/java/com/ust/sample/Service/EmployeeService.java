package com.ust.sample.Service;

import com.ust.sample.Entity.Employee;
import com.ust.sample.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;
    public Employee addemp(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getall() {
        return repo.findAll();
    }

    public Employee getbyid(int id) {
        return repo.findById(id).orElse(null);
    }

    public void del(int id) {
        repo.deleteById(id);
    }

    public Employee updateEmployee(int id, Employee emp) {
        Employee existingemp=repo.findById(id).orElse(null);
        existingemp.setE_name(emp.getE_name());
        existingemp.setGender(emp.getGender());
        Employee updatedemp=repo.save(existingemp);
        return updatedemp;

    }

}
