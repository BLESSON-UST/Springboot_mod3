package com.ust.mapping.Controller;

import com.ust.mapping.Entity.Employee;
import com.ust.mapping.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/save")
    public Employee submit(@RequestBody Employee emp)
    {
        return employeeService.submit(emp);
    }
    @GetMapping("/retrieve")
    public List<Employee> getall()
    {
        return employeeService.getall();
    }
    @DeleteMapping("/del/{emp_id}")
    public String remove(@PathVariable Long emp_id)
    {
        employeeService.remove(emp_id);
        return("The data with id "+ emp_id +" is deleted");
    }
}
