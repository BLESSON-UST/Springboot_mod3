package com.ust.proper.Controller;

import com.ust.proper.DTO.EmployeeDto;
import com.ust.proper.Entity.Employee;
import com.ust.proper.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> submit(@Valid @RequestBody EmployeeDto emp)
    {
        return employeeService.submit(emp);


    }
}
