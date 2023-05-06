package com.ust.proper.Controller;

import com.ust.proper.Entity.Department;
import com.ust.proper.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentRepo drepo;
    @PostMapping("/post")
    public ResponseEntity<Department> post(Department dept)
    {
        drepo.save(dept);
        return ResponseEntity.ok().body(dept);
    }

}
