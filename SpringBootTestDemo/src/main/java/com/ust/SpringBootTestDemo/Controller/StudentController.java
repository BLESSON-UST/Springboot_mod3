package com.ust.SpringBootTestDemo.Controller;

import com.ust.SpringBootTestDemo.Entity.Student;
import com.ust.SpringBootTestDemo.Service.StudentService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/student")

public class StudentController {
    private final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student submit(@Valid @RequestBody Student student)
    {
        LOGGER.info("inside student controller add student method,request body:{}",student);
        return studentService.submit(student);
    }
    @GetMapping("/retrieve")
    public List<Student> getall()
    {
        return studentService.getall();
    }

    @GetMapping("/retrieve/{id}")
    public Student getbyid(@PathVariable("id") Integer id)
    {
        return studentService.getbyid(id);
    }

    @GetMapping("/retrievee/{name}")
    public List<Student> getbyname(@PathVariable("name") String name)
    {
        return studentService.getbyname(name);
    }

    @DeleteMapping("/del/{id}")
    public Student  deletebyid(@PathVariable("id") Integer id)
    {
       return studentService.deletebyid(id);

    }


}
