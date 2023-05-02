package com.ust.sample.Controller;

import com.ust.sample.Entity.Employee;
import com.ust.sample.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee add(@RequestBody  Employee emp){
        return employeeService.addemp(emp);

    }

    @GetMapping("/get")
    public List<Employee> getall(){
        return employeeService.getall();
    }

    @GetMapping("/get/{id}")
    public Employee getbyid(@PathVariable int id)
    {
        return employeeService.getbyid(id);
    }

    @DeleteMapping("/del/{id}")
    public String del(@PathVariable int id)
    {
        employeeService.del(id);
        return("The value is removed");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
        Employee updatedEmployee = employeeService.updateEmployee(id, emp);
        return ResponseEntity.ok(updatedEmployee);
    }
}
