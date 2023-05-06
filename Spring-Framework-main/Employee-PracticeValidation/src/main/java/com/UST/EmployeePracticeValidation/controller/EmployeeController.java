package com.UST.EmployeePracticeValidation.controller;

import com.UST.EmployeePracticeValidation.dto.EntityRequest;
import com.UST.EmployeePracticeValidation.entity.EmployeeEntity;
import com.UST.EmployeePracticeValidation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService services;

    @PostMapping("/emp1")
    public ResponseEntity<EmployeeEntity> postStud(@Valid @RequestBody EntityRequest request){
        return new ResponseEntity<>(services.postStud(request), HttpStatus.CREATED);
    }

    @GetMapping("/emp2")
    public List<EmployeeEntity> get(){
        return services.getAll();
    }
    @GetMapping("/emp3/{id}")
    public EmployeeEntity getemp(@PathVariable Long id){
        return services.getById(id);
    }
    @PutMapping("/emp4/{id}")
    public EmployeeEntity update(@RequestBody EmployeeEntity empent){
        return services.updateById(empent);
    }
    @DeleteMapping("/emp5/{id}")
    public String delete(@PathVariable Long id){
        return services.deleteById(id);

    }


}
